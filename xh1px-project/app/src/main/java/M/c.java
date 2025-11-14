package M;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final t.i f3267a = new t.i(2);

    /* renamed from: b, reason: collision with root package name */
    public static final a f3268b = new Object();

    /* JADX WARN: Type inference failed for: r5v2, types: [M.i, java.lang.Object] */
    public static i a(Context context, List list) {
        E2.c.I("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                d dVar = (d) list.get(i4);
                ProviderInfo b4 = b(context.getPackageManager(), dVar, context.getResources());
                if (b4 == null) {
                    return new i(0, false);
                }
                arrayList.add(c(context, dVar, b4.authority));
            }
            ?? obj = new Object();
            obj.f3287d = 0;
            obj.f3288e = arrayList;
            return obj;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [M.b, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        a aVar = f3268b;
        t.i iVar = f3267a;
        E2.c.I("FontProvider.getProvider");
        try {
            List list = dVar.f3272d;
            String str = dVar.f3269a;
            String str2 = dVar.f3270b;
            if (list == null) {
                list = G.b.j(resources, 0);
            }
            ?? obj = new Object();
            obj.f3264a = str;
            obj.f3265b = str2;
            obj.f3266c = list;
            ProviderInfo providerInfo = (ProviderInfo) iVar.f(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, aVar);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i4));
                        Collections.sort(arrayList2, aVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                                    break;
                                }
                            }
                            iVar.j(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static j[] c(Context context, d dVar, String str) {
        int i4;
        int i8;
        Uri withAppendedId;
        int i9;
        boolean z8;
        E2.c.I("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                E2.c.I("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {dVar.f3271c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e9) {
                            Log.w("FontsProvider", "Unable to query the content provider", e9);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i4 = cursor.getInt(columnIndex);
                            } else {
                                i4 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i8 = cursor.getInt(columnIndex4);
                            } else {
                                i8 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i9 = cursor.getInt(columnIndex5);
                            } else {
                                i9 = 400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            arrayList2.add(new j(uri, i8, i9, z8, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (j[]) arrayList.toArray(new j[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
