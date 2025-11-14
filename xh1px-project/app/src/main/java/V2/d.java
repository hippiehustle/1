package V2;

import B0.e;
import H7.m;
import L7.InterfaceC0163v;
import R.g;
import Z5.y;
import android.content.ContentResolver;
import android.graphics.Point;
import android.net.Uri;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import o6.j;
import o6.s;

/* loaded from: classes.dex */
public final class d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public Closeable f6344h;

    /* renamed from: i, reason: collision with root package name */
    public g f6345i;
    public s j;
    public A4.a k;

    /* renamed from: l, reason: collision with root package name */
    public ZipInputStream f6346l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f6347m;

    /* renamed from: n, reason: collision with root package name */
    public int f6348n;

    /* renamed from: o, reason: collision with root package name */
    public int f6349o;

    /* renamed from: p, reason: collision with root package name */
    public int f6350p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f6351q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Uri f6352r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A4.a f6353s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Point f6354t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f6355u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Uri uri, A4.a aVar, Point point, s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6351q = gVar;
        this.f6352r = uri;
        this.f6353s = aVar;
        this.f6354t = point;
        this.f6355u = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new d(this.f6351q, this.f6352r, this.f6353s, this.f6354t, this.f6355u, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0268, code lost:
    
        if (r0.b(r1, r2, r6, r4, r23) != r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x030b, code lost:
    
        if (r0.m(r23) != r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02cb, code lost:
    
        if (r0.m(r23) != r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02ab, code lost:
    
        if (r0.m(r23) != r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02eb, code lost:
    
        if (r0.m(r23) != r11) goto L113;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [f6.j, n6.b] */
    /* JADX WARN: Type inference failed for: r0v17, types: [f6.j, n6.b] */
    /* JADX WARN: Type inference failed for: r0v21, types: [f6.j, n6.b] */
    /* JADX WARN: Type inference failed for: r0v25, types: [f6.j, n6.b] */
    /* JADX WARN: Type inference failed for: r0v64, types: [n6.f, f6.j] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v12, types: [f6.j, n6.d] */
    /* JADX WARN: Type inference failed for: r3v14, types: [f6.j, n6.d] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [A4.a] */
    /* JADX WARN: Type inference failed for: r7v7, types: [A4.a] */
    /* JADX WARN: Type inference failed for: r7v8, types: [A4.a] */
    /* JADX WARN: Type inference failed for: r7v9, types: [A4.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0170 -> B:25:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01a0 -> B:24:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01ab -> B:25:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01ca -> B:25:0x01d2). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        ?? r72;
        ?? r73;
        ?? r74;
        ?? r75;
        Throwable th;
        ?? r22;
        Iterator it;
        int i4;
        ZipInputStream zipInputStream;
        Uri uri;
        A4.a aVar;
        s sVar;
        int i8;
        g gVar;
        Closeable closeable;
        Point point;
        X2.a aVar2;
        Z2.d dVar;
        A4.a aVar3;
        g gVar2;
        int i9;
        Point point2;
        X2.a aVar4;
        Z2.d dVar2;
        A4.a aVar5;
        Point point3 = this.f6354t;
        g gVar3 = this.f6351q;
        X2.a aVar6 = (X2.a) gVar3.f4988f;
        Z2.d dVar3 = (Z2.d) gVar3.f4989g;
        int i10 = this.f6350p;
        Uri uri2 = this.f6352r;
        A4.a aVar7 = this.f6353s;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    r22 = gVar3;
                }
            } catch (IOException e9) {
                e = e9;
                r75 = uri2;
            } catch (IllegalArgumentException e10) {
                e = e10;
                r74 = uri2;
            } catch (NullPointerException e11) {
                e = e11;
                r73 = uri2;
            } catch (SecurityException e12) {
                e = e12;
                r72 = uri2;
            }
        } catch (IOException e13) {
            e = e13;
            r75 = aVar7;
        } catch (IllegalArgumentException e14) {
            e = e14;
            r74 = aVar7;
        } catch (NullPointerException e15) {
            e = e15;
            r73 = aVar7;
        } catch (SecurityException e16) {
            e = e16;
            r72 = aVar7;
        }
        switch (i10) {
            case 0:
                Z5.a.d(obj);
                ZipInputStream zipInputStream2 = new ZipInputStream(((ContentResolver) gVar3.f4987e).openInputStream(uri2));
                s sVar2 = this.f6355u;
                try {
                    it = ((H7.a) m.U(new e(11, zipInputStream2))).iterator();
                    i4 = 0;
                    zipInputStream = zipInputStream2;
                    uri = uri2;
                    aVar = aVar7;
                    sVar = sVar2;
                    i8 = 0;
                    gVar = gVar3;
                    closeable = zipInputStream;
                    try {
                        if (it.hasNext()) {
                            try {
                                ZipEntry zipEntry = (ZipEntry) it.next();
                                if (!zipEntry.isDirectory()) {
                                    zipEntry.getName();
                                    dVar = dVar3;
                                    X2.a aVar8 = (X2.a) gVar.f4988f;
                                    point = point3;
                                    Z2.d dVar4 = (Z2.d) gVar.f4989g;
                                    aVar2 = aVar6;
                                    String name = zipEntry.getName();
                                    j.d(name, "getName(...)");
                                    if (aVar8.c(zipInputStream, name)) {
                                        try {
                                            zipEntry.getName();
                                            int i11 = sVar.f13640d + 1;
                                            sVar.f13640d = i11;
                                            ?? r32 = (AbstractC0720j) aVar.f280e;
                                            Integer num = new Integer(i11);
                                            this.f6344h = closeable;
                                            this.f6345i = gVar;
                                            this.j = sVar;
                                            this.k = aVar;
                                            this.f6346l = zipInputStream;
                                            this.f6347m = it;
                                            this.f6348n = i8;
                                            this.f6349o = i4;
                                            this.f6350p = 1;
                                            if (r32.j(num, null, this) != enumC0646a) {
                                                sVar = sVar;
                                                zipInputStream = zipInputStream;
                                                it = it;
                                                i8 = i8;
                                                gVar = gVar;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            r22 = closeable;
                                            try {
                                                throw th;
                                            } catch (Throwable th4) {
                                                h2.a.b(r22, th);
                                                throw th4;
                                            }
                                        }
                                        aVar3 = aVar7;
                                    } else {
                                        aVar3 = aVar7;
                                        String name2 = zipEntry.getName();
                                        j.d(name2, "getName(...)");
                                        if (dVar4.c(zipInputStream, name2)) {
                                            String name3 = zipEntry.getName();
                                            j.d(name3, "getName(...)");
                                            if (dVar4.f7313g.c(name3)) {
                                                zipEntry.getName();
                                                int i12 = sVar.f13640d + 1;
                                                sVar.f13640d = i12;
                                                ?? r33 = (AbstractC0720j) aVar.f280e;
                                                Integer num2 = new Integer(i12);
                                                this.f6344h = closeable;
                                                this.f6345i = gVar;
                                                this.j = sVar;
                                                this.k = aVar;
                                                this.f6346l = zipInputStream;
                                                this.f6347m = it;
                                                this.f6348n = i8;
                                                this.f6349o = i4;
                                                this.f6350p = 2;
                                                if (r33.j(num2, null, this) != enumC0646a) {
                                                    int i13 = i8;
                                                    gVar2 = gVar;
                                                    i9 = i13;
                                                    closeable = closeable;
                                                    g gVar4 = gVar2;
                                                    i8 = i9;
                                                    gVar = gVar4;
                                                }
                                            }
                                        } else {
                                            new Integer(Log.w("BackupEngine", "Nothing found to handle zip entry " + zipEntry.getName()));
                                        }
                                    }
                                    if (it.hasNext()) {
                                        point2 = point3;
                                        aVar4 = aVar6;
                                        dVar2 = dVar3;
                                        A4.a aVar9 = aVar7;
                                        try {
                                            h2.a.b(closeable, null);
                                            aVar5 = aVar9;
                                            InterfaceC1163b interfaceC1163b = (InterfaceC1163b) aVar5.f283h;
                                            if (interfaceC1163b != null) {
                                                this.f6344h = null;
                                                this.f6345i = null;
                                                this.j = null;
                                                this.k = null;
                                                this.f6346l = null;
                                                this.f6347m = null;
                                                this.f6350p = 3;
                                                if (interfaceC1163b.m(this) == enumC0646a) {
                                                }
                                            }
                                            Point point4 = point2;
                                            X2.a aVar10 = aVar4;
                                            aVar10.l(point4);
                                            Z2.d dVar5 = dVar2;
                                            dVar5.l(point4);
                                            Log.i("BackupEngine", "Backup loading completed: " + uri);
                                            Log.i("BackupEngine", "Inserting extracted scenarios into database");
                                            ?? r02 = (AbstractC0720j) aVar5.f281f;
                                            ArrayList arrayList = aVar10.f6503d;
                                            ArrayList arrayList2 = dVar5.f6503d;
                                            Integer num3 = new Integer(aVar10.f6504e + dVar5.f6504e);
                                            Boolean valueOf = Boolean.valueOf(dVar5.j);
                                            this.f6344h = null;
                                            this.f6345i = null;
                                            this.j = null;
                                            this.k = null;
                                            this.f6346l = null;
                                            this.f6347m = null;
                                            this.f6350p = 4;
                                            break;
                                        } catch (IOException e17) {
                                            e = e17;
                                            r75 = aVar9;
                                            Log.e("BackupEngine", "Error while loading backup archive", e);
                                            ?? r03 = (AbstractC0720j) r75.f282g;
                                            this.f6344h = null;
                                            this.f6345i = null;
                                            this.j = null;
                                            this.k = null;
                                            this.f6346l = null;
                                            this.f6347m = null;
                                            this.f6350p = 5;
                                            break;
                                        } catch (IllegalArgumentException e18) {
                                            e = e18;
                                            r74 = aVar9;
                                            Log.e("BackupEngine", "Error while loading backup archive, file is invalid", e);
                                            ?? r04 = (AbstractC0720j) r74.f282g;
                                            this.f6344h = null;
                                            this.f6345i = null;
                                            this.j = null;
                                            this.k = null;
                                            this.f6346l = null;
                                            this.f6347m = null;
                                            this.f6350p = 7;
                                            break;
                                        } catch (NullPointerException e19) {
                                            e = e19;
                                            r73 = aVar9;
                                            Log.e("BackupEngine", "Error while loading backup archive, file path is null", e);
                                            ?? r05 = (AbstractC0720j) r73.f282g;
                                            this.f6344h = null;
                                            this.f6345i = null;
                                            this.j = null;
                                            this.k = null;
                                            this.f6346l = null;
                                            this.f6347m = null;
                                            this.f6350p = 8;
                                            break;
                                        } catch (SecurityException e20) {
                                            e = e20;
                                            r72 = aVar9;
                                            Log.e("BackupEngine", "Error while loading backup archive, permission is denied", e);
                                            ?? r06 = (AbstractC0720j) r72.f282g;
                                            this.f6344h = null;
                                            this.f6345i = null;
                                            this.j = null;
                                            this.k = null;
                                            this.f6346l = null;
                                            this.f6347m = null;
                                            this.f6350p = 6;
                                            break;
                                        }
                                    }
                                } else {
                                    point = point3;
                                    aVar2 = aVar6;
                                    dVar = dVar3;
                                    aVar3 = aVar7;
                                }
                                dVar3 = dVar;
                                point3 = point;
                                aVar6 = aVar2;
                                aVar7 = aVar3;
                                closeable = closeable;
                            } catch (Throwable th5) {
                                th = th5;
                                aVar3 = aVar7;
                            }
                            if (it.hasNext()) {
                            }
                        }
                        return enumC0646a;
                    } catch (Throwable th6) {
                        th = th6;
                        r22 = closeable;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r22 = zipInputStream2;
                    throw th;
                }
            case 1:
                int i14 = this.f6349o;
                int i15 = this.f6348n;
                Iterator it2 = this.f6347m;
                ZipInputStream zipInputStream3 = this.f6346l;
                A4.a aVar11 = this.k;
                s sVar3 = this.j;
                g gVar5 = this.f6345i;
                closeable = this.f6344h;
                Z5.a.d(obj);
                point = point3;
                aVar2 = aVar6;
                dVar = dVar3;
                aVar3 = aVar7;
                aVar = aVar11;
                i4 = i14;
                uri = uri2;
                sVar = sVar3;
                zipInputStream = zipInputStream3;
                it = it2;
                i8 = i15;
                gVar = gVar5;
                dVar3 = dVar;
                point3 = point;
                aVar6 = aVar2;
                aVar7 = aVar3;
                closeable = closeable;
                if (it.hasNext()) {
                }
                return enumC0646a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                int i16 = this.f6349o;
                i9 = this.f6348n;
                it = this.f6347m;
                ZipInputStream zipInputStream4 = this.f6346l;
                A4.a aVar12 = this.k;
                s sVar4 = this.j;
                gVar2 = this.f6345i;
                Closeable closeable2 = this.f6344h;
                Z5.a.d(obj);
                uri = uri2;
                sVar = sVar4;
                aVar = aVar12;
                zipInputStream = zipInputStream4;
                i4 = i16;
                point = point3;
                aVar2 = aVar6;
                dVar = dVar3;
                aVar3 = aVar7;
                closeable = closeable2;
                g gVar42 = gVar2;
                i8 = i9;
                gVar = gVar42;
                dVar3 = dVar;
                point3 = point;
                aVar6 = aVar2;
                aVar7 = aVar3;
                closeable = closeable;
                if (it.hasNext()) {
                }
                return enumC0646a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Z5.a.d(obj);
                point2 = point3;
                aVar4 = aVar6;
                dVar2 = dVar3;
                uri = uri2;
                aVar5 = aVar7;
                Point point42 = point2;
                X2.a aVar102 = aVar4;
                aVar102.l(point42);
                Z2.d dVar52 = dVar2;
                dVar52.l(point42);
                Log.i("BackupEngine", "Backup loading completed: " + uri);
                Log.i("BackupEngine", "Inserting extracted scenarios into database");
                ?? r022 = (AbstractC0720j) aVar5.f281f;
                ArrayList arrayList3 = aVar102.f6503d;
                ArrayList arrayList22 = dVar52.f6503d;
                Integer num32 = new Integer(aVar102.f6504e + dVar52.f6504e);
                Boolean valueOf2 = Boolean.valueOf(dVar52.j);
                this.f6344h = null;
                this.f6345i = null;
                this.j = null;
                this.k = null;
                this.f6346l = null;
                this.f6347m = null;
                this.f6350p = 4;
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Z5.a.d(obj);
                return y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Z5.a.d(obj);
                return y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Z5.a.d(obj);
                return y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Z5.a.d(obj);
                return y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                Z5.a.d(obj);
                return y.f7506a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
