package N0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import q4.X;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3627a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f3628b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3629c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f3630d = {31, -117, 8};

    public static E a(final String str, Callable callable, E.a aVar) {
        C0202j a3;
        E e9 = null;
        if (str == null) {
            a3 = null;
        } else {
            a3 = S0.g.f5201b.a(str);
        }
        if (a3 != null) {
            e9 = new E(a3);
        }
        HashMap hashMap = f3627a;
        if (str != null && hashMap.containsKey(str)) {
            e9 = (E) hashMap.get(str);
        }
        if (e9 != null) {
            if (aVar != null) {
                aVar.run();
            }
            return e9;
        }
        E e10 = new E(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i4 = 0;
            e10.b(new A() { // from class: N0.m
                @Override // N0.A
                public final void onResult(Object obj) {
                    switch (i4) {
                        case 0:
                            HashMap hashMap2 = o.f3627a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = o.f3627a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                    }
                }
            });
            final int i8 = 1;
            e10.a(new A() { // from class: N0.m
                @Override // N0.A
                public final void onResult(Object obj) {
                    switch (i8) {
                        case 0:
                            HashMap hashMap2 = o.f3627a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = o.f3627a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, e10);
                if (hashMap.size() == 1) {
                    j();
                }
            }
        }
        return e10;
    }

    public static C b(Context context, String str, String str2) {
        C0202j a3;
        if (str2 == null) {
            a3 = null;
        } else {
            a3 = S0.g.f5201b.a(str2);
        }
        if (a3 != null) {
            return new C(a3);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e9) {
            return new C(e9);
        }
    }

    public static C c(Context context, InputStream inputStream, String str) {
        C0202j a3;
        if (str == null) {
            a3 = null;
        } else {
            a3 = S0.g.f5201b.a(str);
        }
        if (a3 != null) {
            return new C(a3);
        }
        try {
            d8.i iVar = new d8.i(X.Z(inputStream));
            if (i(iVar, f3629c).booleanValue()) {
                return g(context, new ZipInputStream(new d8.h(iVar)), str);
            }
            if (i(iVar, f3630d).booleanValue()) {
                return d(new GZIPInputStream(new d8.h(iVar)), str);
            }
            String[] strArr = Y0.c.f7077h;
            return e(new Y0.d(iVar), str, true);
        } catch (IOException e9) {
            return new C(e9);
        }
    }

    public static C d(InputStream inputStream, String str) {
        d8.i iVar = new d8.i(X.Z(inputStream));
        String[] strArr = Y0.c.f7077h;
        return e(new Y0.d(iVar), str, true);
    }

    public static C e(Y0.d dVar, String str, boolean z8) {
        C0202j a3;
        try {
            if (str == null) {
                a3 = null;
            } else {
                try {
                    a3 = S0.g.f5201b.a(str);
                } catch (Exception e9) {
                    C c6 = new C(e9);
                    if (z8) {
                        Z0.k.b(dVar);
                    }
                    return c6;
                }
            }
            if (a3 != null) {
                C c9 = new C(a3);
                if (z8) {
                    Z0.k.b(dVar);
                }
                return c9;
            }
            C0202j a4 = X0.r.a(dVar);
            if (str != null) {
                S0.g.f5201b.f5202a.j(str, a4);
            }
            C c10 = new C(a4);
            if (z8) {
                Z0.k.b(dVar);
            }
            return c10;
        } catch (Throwable th) {
            if (z8) {
                Z0.k.b(dVar);
            }
            throw th;
        }
    }

    public static C f(Context context, int i4, String str) {
        C0202j a3;
        if (str == null) {
            a3 = null;
        } else {
            a3 = S0.g.f5201b.a(str);
        }
        if (a3 != null) {
            return new C(a3);
        }
        try {
            d8.i iVar = new d8.i(X.Z(context.getResources().openRawResource(i4)));
            if (i(iVar, f3629c).booleanValue()) {
                return g(context, new ZipInputStream(new d8.h(iVar)), str);
            }
            if (i(iVar, f3630d).booleanValue()) {
                try {
                    return d(new GZIPInputStream(new d8.h(iVar)), str);
                } catch (IOException e9) {
                    return new C(e9);
                }
            }
            String[] strArr = Y0.c.f7077h;
            return e(new Y0.d(iVar), str, true);
        } catch (Resources.NotFoundException e10) {
            return new C(e10);
        }
    }

    public static C g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            Z0.k.b(zipInputStream);
        }
    }

    public static C h(Context context, ZipInputStream zipInputStream, String str) {
        C0202j a3;
        z zVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a3 = null;
        } else {
            try {
                a3 = S0.g.f5201b.a(str);
            } catch (IOException e9) {
                return new C(e9);
            }
        }
        if (a3 != null) {
            return new C(a3);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C0202j c0202j = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                d8.i iVar = new d8.i(X.Z(zipInputStream));
                String[] strArr = Y0.c.f7077h;
                c0202j = e(new Y0.d(iVar), null, false).f3564a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new C(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                                break;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        Z0.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        Z0.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c0202j == null) {
            return new C(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c0202j.c()).values().iterator();
            while (true) {
                if (it.hasNext()) {
                    zVar = (z) it.next();
                    if (zVar.f3700d.equals(str4)) {
                        break;
                    }
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                zVar.f3702f = Z0.k.d((Bitmap) entry.getValue(), zVar.f3697a, zVar.f3698b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z8 = false;
            for (S0.c cVar : c0202j.f3606f.values()) {
                if (cVar.f5189a.equals(entry2.getKey())) {
                    cVar.f5192d = (Typeface) entry2.getValue();
                    z8 = true;
                }
            }
            if (!z8) {
                Z0.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) c0202j.c()).entrySet().iterator();
            while (it2.hasNext()) {
                z zVar2 = (z) ((Map.Entry) it2.next()).getValue();
                if (zVar2 == null) {
                    return null;
                }
                String str5 = zVar2.f3700d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            zVar2.f3702f = Z0.k.d(decodeByteArray, zVar2.f3697a, zVar2.f3698b);
                        }
                    } catch (IllegalArgumentException e10) {
                        Z0.c.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            S0.g.f5201b.f5202a.j(str, c0202j);
        }
        return new C(c0202j);
    }

    public static Boolean i(d8.i iVar, byte[] bArr) {
        try {
            d8.i iVar2 = new d8.i(new d8.g(iVar));
            for (byte b4 : bArr) {
                if (iVar2.o(1L)) {
                    if (iVar2.f10542e.d() != b4) {
                        return Boolean.FALSE;
                    }
                } else {
                    throw new EOFException();
                }
            }
            iVar2.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            Z0.c.f7255a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(f3628b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String k(Context context, int i4) {
        String str;
        StringBuilder sb = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i4);
        return sb.toString();
    }
}
