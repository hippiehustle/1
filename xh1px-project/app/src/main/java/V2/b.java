package V2;

import L7.InterfaceC0163v;
import R.g;
import T1.C0316o;
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
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipOutputStream;
import n6.InterfaceC1164c;
import o6.s;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public Closeable f6322h;

    /* renamed from: i, reason: collision with root package name */
    public List f6323i;
    public List j;
    public A4.a k;

    /* renamed from: l, reason: collision with root package name */
    public g f6324l;

    /* renamed from: m, reason: collision with root package name */
    public Point f6325m;

    /* renamed from: n, reason: collision with root package name */
    public s f6326n;

    /* renamed from: o, reason: collision with root package name */
    public ZipOutputStream f6327o;

    /* renamed from: p, reason: collision with root package name */
    public Iterator f6328p;

    /* renamed from: q, reason: collision with root package name */
    public int f6329q;

    /* renamed from: r, reason: collision with root package name */
    public int f6330r;

    /* renamed from: s, reason: collision with root package name */
    public int f6331s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f6332t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f6333u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A4.a f6334v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f6335w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f6336x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Point f6337y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s f6338z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, Uri uri, A4.a aVar, List list, List list2, Point point, s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6332t = gVar;
        this.f6333u = uri;
        this.f6334v = aVar;
        this.f6335w = list;
        this.f6336x = list2;
        this.f6337y = point;
        this.f6338z = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new b(this.f6332t, this.f6333u, this.f6334v, this.f6335w, this.f6336x, this.f6337y, this.f6338z, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02a3, code lost:
    
        if (r0.m(r20) != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027a, code lost:
    
        if (r0.m(r20) != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0251, code lost:
    
        if (r0.m(r20) != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        if (r2 == r6) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163 A[Catch: all -> 0x01bb, TryCatch #15 {all -> 0x01bb, blocks: (B:24:0x015d, B:26:0x0163, B:33:0x01be), top: B:23:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7 A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #2 {all -> 0x0143, blocks: (B:56:0x00d1, B:58:0x00d7), top: B:55:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0149  */
    /* JADX WARN: Type inference failed for: r0v12, types: [f6.j, n6.b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [f6.j, n6.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [f6.j, n6.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [n6.f, f6.j] */
    /* JADX WARN: Type inference failed for: r1v31, types: [f6.j, n6.d] */
    /* JADX WARN: Type inference failed for: r6v22, types: [X2.a, W2.a] */
    /* JADX WARN: Type inference failed for: r6v24, types: [f6.j, n6.d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x012a -> B:51:0x012e). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Closeable closeable;
        A4.a aVar;
        A4.a aVar2;
        String str;
        String str2;
        String str3;
        String str4;
        Throwable th;
        s sVar;
        Iterator it;
        List list;
        List list2;
        A4.a aVar3;
        Point point;
        int i4;
        Closeable closeable2;
        ?? r8;
        int i8;
        Iterator it2;
        int i9;
        s sVar2;
        List list3;
        ZipOutputStream zipOutputStream;
        A4.a aVar4;
        List list4;
        g gVar;
        int i10;
        n2.s sVar3;
        A4.a aVar5;
        Object obj2;
        Object obj3;
        ZipOutputStream zipOutputStream2;
        Closeable closeable3;
        int i11;
        int i12;
        List list5;
        g gVar2 = this.f6332t;
        ?? r12 = this.f6331s;
        Object obj4 = "BackupEngine";
        A4.a aVar6 = this.f6334v;
        Object obj5 = EnumC0646a.f10656d;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                closeable = r12;
            }
        } catch (IOException unused) {
        } catch (IllegalStateException unused2) {
        } catch (SecurityException unused3) {
        }
        switch (r12) {
            case 0:
                Z5.a.d(obj);
                try {
                    try {
                    } catch (SecurityException unused4) {
                        obj4 = obj5;
                        Log.e("BackupEngine", "Error while creating backup archive, permission is denied");
                        ?? r02 = (AbstractC0720j) aVar6.f282g;
                        this.f6322h = null;
                        this.f6323i = null;
                        this.j = null;
                        this.k = null;
                        this.f6324l = null;
                        this.f6325m = null;
                        this.f6326n = null;
                        this.f6327o = null;
                        this.f6328p = null;
                        this.f6331s = 6;
                        break;
                    }
                } catch (IOException unused5) {
                    str3 = "BackupEngine";
                    aVar2 = aVar6;
                    obj4 = obj5;
                    Log.e(str3, "Error while creating backup archive.");
                    ?? r03 = (AbstractC0720j) aVar2.f282g;
                    this.f6322h = null;
                    this.f6323i = null;
                    this.j = null;
                    this.k = null;
                    this.f6324l = null;
                    this.f6325m = null;
                    this.f6326n = null;
                    this.f6327o = null;
                    this.f6328p = null;
                    this.f6331s = 4;
                    break;
                } catch (IllegalStateException unused6) {
                    str = "BackupEngine";
                    aVar = aVar6;
                    obj4 = obj5;
                    Log.e(str, "Error while creating backup archive, target folder can't be written");
                    ?? r04 = (AbstractC0720j) aVar.f282g;
                    this.f6322h = null;
                    this.f6323i = null;
                    this.j = null;
                    this.k = null;
                    this.f6324l = null;
                    this.f6325m = null;
                    this.f6326n = null;
                    this.f6327o = null;
                    this.f6328p = null;
                    this.f6331s = 5;
                    break;
                }
                try {
                    try {
                        ZipOutputStream zipOutputStream3 = new ZipOutputStream(((ContentResolver) gVar2.f4987e).openOutputStream(this.f6333u));
                        List list6 = this.f6335w;
                        List list7 = this.f6336x;
                        Point point2 = this.f6337y;
                        sVar = this.f6338z;
                        it = list6.iterator();
                        list = list6;
                        list2 = list7;
                        aVar3 = aVar6;
                        point = point2;
                        i4 = 0;
                        closeable2 = zipOutputStream3;
                        r8 = closeable2;
                        i8 = 0;
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException unused7) {
                        str4 = "BackupEngine";
                        obj4 = obj5;
                        aVar2 = aVar6;
                        str3 = str4;
                        Log.e(str3, "Error while creating backup archive.");
                        ?? r032 = (AbstractC0720j) aVar2.f282g;
                        this.f6322h = null;
                        this.f6323i = null;
                        this.j = null;
                        this.k = null;
                        this.f6324l = null;
                        this.f6325m = null;
                        this.f6326n = null;
                        this.f6327o = null;
                        this.f6328p = null;
                        this.f6331s = 4;
                    } catch (IllegalStateException unused8) {
                        str2 = "BackupEngine";
                        obj4 = obj5;
                        aVar = aVar6;
                        str = str2;
                        Log.e(str, "Error while creating backup archive, target folder can't be written");
                        ?? r042 = (AbstractC0720j) aVar.f282g;
                        this.f6322h = null;
                        this.f6323i = null;
                        this.j = null;
                        this.k = null;
                        this.f6324l = null;
                        this.f6325m = null;
                        this.f6326n = null;
                        this.f6327o = null;
                        this.f6328p = null;
                        this.f6331s = 5;
                    }
                } catch (IOException unused9) {
                    str4 = "BackupEngine";
                    obj4 = obj5;
                    aVar2 = aVar6;
                    str3 = str4;
                    Log.e(str3, "Error while creating backup archive.");
                    ?? r0322 = (AbstractC0720j) aVar2.f282g;
                    this.f6322h = null;
                    this.f6323i = null;
                    this.j = null;
                    this.k = null;
                    this.f6324l = null;
                    this.f6325m = null;
                    this.f6326n = null;
                    this.f6327o = null;
                    this.f6328p = null;
                    this.f6331s = 4;
                } catch (IllegalStateException unused10) {
                    str2 = "BackupEngine";
                    obj4 = obj5;
                    aVar = aVar6;
                    str = str2;
                    Log.e(str, "Error while creating backup archive, target folder can't be written");
                    ?? r0422 = (AbstractC0720j) aVar.f282g;
                    this.f6322h = null;
                    this.f6323i = null;
                    this.j = null;
                    this.k = null;
                    this.f6324l = null;
                    this.f6325m = null;
                    this.f6326n = null;
                    this.f6327o = null;
                    this.f6328p = null;
                    this.f6331s = 5;
                }
                if (!it.hasNext()) {
                    try {
                        try {
                            try {
                                try {
                                    sVar3 = (n2.s) it.next();
                                    ((X2.a) gVar2.f4988f).a(r8, sVar3, point);
                                    int i13 = sVar.f13640d + 1;
                                    sVar.f13640d = i13;
                                    ?? r62 = (AbstractC0720j) aVar3.f280e;
                                    Integer num = new Integer(i13);
                                    Integer num2 = new Integer(list2.size());
                                    this.f6322h = closeable2;
                                    this.f6323i = list;
                                    this.j = list2;
                                    this.k = aVar3;
                                    this.f6324l = gVar2;
                                    this.f6325m = point;
                                    this.f6326n = sVar;
                                    this.f6327o = r8;
                                    this.f6328p = it;
                                    this.f6329q = i4;
                                    this.f6330r = i8;
                                    this.f6331s = 1;
                                    Object j = r62.j(num, num2, this);
                                    obj4 = obj3;
                                    zipOutputStream2 = r8;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                obj3 = obj5;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            obj2 = obj4;
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            closeable = closeable2;
                            throw th;
                        }
                        long j5 = sVar3.f12925a.f12911a;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    aVar5 = aVar6;
                } else {
                    obj4 = obj5;
                    try {
                        int i14 = i4;
                        it2 = list2.iterator();
                        i9 = i14;
                        closeable = closeable2;
                        sVar2 = sVar;
                        list3 = list2;
                        zipOutputStream = r8;
                        aVar4 = aVar3;
                        list4 = list;
                        gVar = gVar2;
                        i10 = 0;
                        while (true) {
                            try {
                                if (!it2.hasNext()) {
                                    C0316o c0316o = (C0316o) it2.next();
                                    i11 = i10;
                                    i12 = i9;
                                    long j8 = c0316o.f5609a.f5528a;
                                    ((Z2.d) gVar.f4989g).a(zipOutputStream, c0316o, point);
                                    int i15 = sVar2.f13640d + 1;
                                    sVar2.f13640d = i15;
                                    ?? r13 = (AbstractC0720j) aVar4.f280e;
                                    Integer num3 = new Integer(i15);
                                    Integer num4 = new Integer(list3.size());
                                    this.f6322h = closeable;
                                    this.f6323i = list4;
                                    this.j = list3;
                                    this.k = aVar4;
                                    this.f6324l = gVar;
                                    this.f6325m = point;
                                    this.f6326n = sVar2;
                                    this.f6327o = zipOutputStream;
                                    this.f6328p = it2;
                                    this.f6329q = i12;
                                    this.f6330r = i11;
                                    list5 = list3;
                                    this.f6331s = 2;
                                    if (r13.j(num3, num4, this) != obj4) {
                                        list3 = list5;
                                        i9 = i12;
                                        i10 = i11;
                                    }
                                } else {
                                    int i16 = i9;
                                    ?? r14 = (AbstractC0720j) aVar4.f281f;
                                    Integer num5 = new Integer(0);
                                    Boolean bool = Boolean.FALSE;
                                    this.f6322h = closeable;
                                    this.f6323i = null;
                                    this.j = null;
                                    this.k = null;
                                    this.f6324l = null;
                                    this.f6325m = null;
                                    this.f6326n = null;
                                    this.f6327o = null;
                                    this.f6328p = null;
                                    this.f6329q = i16;
                                    this.f6331s = 3;
                                    if (r14.b(list4, list3, num5, bool, this) != obj4) {
                                        closeable3 = closeable;
                                        break;
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                th = th;
                                throw th;
                            }
                        }
                        return obj4;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
                th = th;
                closeable = closeable2;
                try {
                    throw th;
                } catch (Throwable th10) {
                    h2.a.b(closeable, th);
                    throw th10;
                }
            case 1:
                int i17 = this.f6330r;
                int i18 = this.f6329q;
                Iterator it3 = this.f6328p;
                ZipOutputStream zipOutputStream4 = this.f6327o;
                s sVar4 = this.f6326n;
                Point point3 = this.f6325m;
                g gVar3 = this.f6324l;
                A4.a aVar7 = this.k;
                List list8 = this.j;
                List list9 = this.f6323i;
                Closeable closeable4 = this.f6322h;
                try {
                    Z5.a.d(obj);
                    i8 = i17;
                    gVar2 = gVar3;
                    it = it3;
                    closeable2 = closeable4;
                    list = list9;
                    list2 = list8;
                    aVar3 = aVar7;
                    point = point3;
                    sVar = sVar4;
                    zipOutputStream2 = zipOutputStream4;
                    i4 = i18;
                    obj2 = "BackupEngine";
                    aVar5 = aVar6;
                    obj4 = obj5;
                    obj5 = obj4;
                    aVar6 = aVar5;
                    obj4 = obj2;
                    r8 = zipOutputStream2;
                    if (!it.hasNext()) {
                    }
                    th = th;
                } catch (Throwable th11) {
                    th = th11;
                    closeable = closeable4;
                }
                closeable = closeable2;
                throw th;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                i10 = this.f6330r;
                i9 = this.f6329q;
                it2 = this.f6328p;
                zipOutputStream = this.f6327o;
                sVar2 = this.f6326n;
                point = this.f6325m;
                gVar = this.f6324l;
                aVar4 = this.k;
                List list10 = this.j;
                list4 = this.f6323i;
                closeable2 = this.f6322h;
                try {
                    Z5.a.d(obj);
                    obj4 = obj5;
                    list3 = list10;
                    closeable = closeable2;
                    while (true) {
                        if (!it2.hasNext()) {
                        }
                        list3 = list5;
                        i9 = i12;
                        i10 = i11;
                    }
                    return obj4;
                } catch (Throwable th12) {
                    th = th12;
                    break;
                }
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                closeable3 = this.f6322h;
                Z5.a.d(obj);
                h2.a.b(closeable3, null);
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Z5.a.d(obj);
                return y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Z5.a.d(obj);
                return y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Z5.a.d(obj);
                return y.f7506a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
