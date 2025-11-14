package s2;

import D4.C0037m;
import L7.AbstractC0166y;
import L7.F;
import Z5.y;
import a6.AbstractC0436k;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.buzbuz.smartautoclicker.core.detection.DetectionResult;
import com.buzbuz.smartautoclicker.core.detection.NativeDetector;
import d6.InterfaceC0617c;
import e2.AbstractC0640c;
import e2.C0638a;
import e2.C0639b;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import g0.b0;
import i.AbstractC0863b;
import j2.AbstractC0901a;
import j2.C0902b;
import j2.C0903c;
import j2.C0905e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import l1.C1000b;
import n6.InterfaceC1165d;
import r1.C1428b;
import r2.C1433e;
import t0.C1536c;
import t2.C1562a;
import u2.C1630a;
import v2.InterfaceC1661a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final o f14483h = new o(true);

    /* renamed from: i, reason: collision with root package name */
    public static final o f14484i = new o(false);

    /* renamed from: a, reason: collision with root package name */
    public final NativeDetector f14485a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.j f14486b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f14487c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14488d;

    /* renamed from: e, reason: collision with root package name */
    public final Z5.d f14489e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14490f;

    /* renamed from: g, reason: collision with root package name */
    public Object f14491g;

    public n(b0 b0Var, NativeDetector nativeDetector, u2.b bVar, C1433e c1433e, v2.j jVar) {
        this.f14487c = b0Var;
        this.f14485a = nativeDetector;
        this.f14488d = bVar;
        this.f14489e = c1433e;
        this.f14486b = jVar;
        this.f14490f = new k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x015d, code lost:
    
        if (r14 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0130, code lost:
    
        if (r3.d(r0) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        if (b(r14, r15, r1, r0) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (r3.c(r0) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b5, code lost:
    
        if (c(r15, r1, r0) == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[LOOP:0: B:40:0x00ce->B:42:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Bitmap bitmap, AbstractC0713c abstractC0713c) {
        q qVar;
        int i4;
        Object obj;
        v2.j jVar;
        b0 b0Var;
        Iterator it;
        C1000b c1000b;
        Object obj2;
        if (abstractC0713c instanceof q) {
            qVar = (q) abstractC0713c;
            int i8 = qVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.j = i8 - Integer.MIN_VALUE;
                Object obj3 = qVar.f14499h;
                i4 = qVar.j;
                obj = EnumC0646a.f10656d;
                jVar = this.f14486b;
                Object obj4 = y.f7506a;
                InterfaceC0617c interfaceC0617c = null;
                b0Var = this.f14487c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 == 5) {
                                        Z5.a.d(obj3);
                                        return obj4;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Z5.a.d(obj3);
                                b0 b0Var2 = (b0) this.f14491g;
                                qVar.f14498g = null;
                                qVar.j = 5;
                                c1000b = (C1000b) b0Var2.f10990g;
                                if (c1000b != null) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (currentTimeMillis >= c1000b.f12189a + 10000) {
                                        c1000b.f12189a = currentTimeMillis;
                                        S7.e eVar = F.f3175a;
                                        obj2 = AbstractC0166y.A(Q7.n.f4962a, new C1489j(b0Var2, null), qVar);
                                    }
                                }
                                obj2 = obj4;
                                if (obj2 == obj) {
                                    return obj;
                                }
                                return obj4;
                            }
                            Z5.a.d(obj3);
                            if (jVar != null) {
                                qVar.f14498g = null;
                                qVar.j = 4;
                            }
                            b0 b0Var22 = (b0) this.f14491g;
                            qVar.f14498g = null;
                            qVar.j = 5;
                            c1000b = (C1000b) b0Var22.f10990g;
                            if (c1000b != null) {
                            }
                            obj2 = obj4;
                            if (obj2 == obj) {
                            }
                        } else {
                            bitmap = qVar.f14498g;
                            Z5.a.d(obj3);
                            if (!((LinkedHashMap) ((R.g) ((C1536c) b0Var.f10987d).f14808e).f4987e).isEmpty()) {
                                List t8 = AbstractC0863b.t(((LinkedHashMap) ((R.g) ((C1536c) b0Var.f10987d).f14808e).f4987e).values());
                                C0037m c0037m = new C0037m(this, interfaceC0617c, 13);
                                qVar.f14498g = null;
                                qVar.j = 3;
                            }
                            if (jVar != null) {
                            }
                            b0 b0Var222 = (b0) this.f14491g;
                            qVar.f14498g = null;
                            qVar.j = 5;
                            c1000b = (C1000b) b0Var222.f10990g;
                            if (c1000b != null) {
                            }
                            obj2 = obj4;
                            if (obj2 == obj) {
                            }
                        }
                    } else {
                        bitmap = qVar.f14498g;
                        Z5.a.d(obj3);
                    }
                } else {
                    Z5.a.d(obj3);
                    C1536c c1536c = (C1536c) b0Var.f10987d;
                    C1536c c1536c2 = (C1536c) b0Var.f10987d;
                    if (((LinkedHashMap) ((R.g) c1536c.f14808e).f4987e).isEmpty() && ((LinkedHashMap) ((R.g) c1536c.f14809f).f4987e).isEmpty()) {
                        ((B0.e) this.f14489e).a();
                        return obj4;
                    }
                    if (!((LinkedHashMap) ((R.g) c1536c2.f14809f).f4987e).isEmpty()) {
                        List Q02 = AbstractC0436k.Q0(((LinkedHashMap) ((R.g) c1536c2.f14809f).f4987e).values());
                        C0037m c0037m2 = new C0037m(this, interfaceC0617c, 12);
                        qVar.f14498g = bitmap;
                        qVar.j = 1;
                    }
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((C1536c) b0Var.f10988e).f14808e;
                Set keySet = concurrentHashMap.keySet();
                o6.j.d(keySet, "<get-keys>(...)");
                it = keySet.iterator();
                while (it.hasNext()) {
                    concurrentHashMap.put((String) it.next(), Boolean.FALSE);
                }
                if (jVar != null) {
                    qVar.f14498g = bitmap;
                    qVar.j = 2;
                }
                if (!((LinkedHashMap) ((R.g) ((C1536c) b0Var.f10987d).f14808e).f4987e).isEmpty()) {
                }
                if (jVar != null) {
                }
                b0 b0Var2222 = (b0) this.f14491g;
                qVar.f14498g = null;
                qVar.j = 5;
                c1000b = (C1000b) b0Var2222.f10990g;
                if (c1000b != null) {
                }
                obj2 = obj4;
                if (obj2 == obj) {
                }
            }
        }
        qVar = new q(this, abstractC0713c);
        Object obj32 = qVar.f14499h;
        i4 = qVar.j;
        obj = EnumC0646a.f10656d;
        jVar = this.f14486b;
        Object obj42 = y.f7506a;
        InterfaceC0617c interfaceC0617c2 = null;
        b0Var = this.f14487c;
        if (i4 == 0) {
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ((C1536c) b0Var.f10988e).f14808e;
        Set keySet2 = concurrentHashMap2.keySet();
        o6.j.d(keySet2, "<get-keys>(...)");
        it = keySet2.iterator();
        while (it.hasNext()) {
        }
        if (jVar != null) {
        }
        if (!((LinkedHashMap) ((R.g) ((C1536c) b0Var.f10987d).f14808e).f4987e).isEmpty()) {
        }
        if (jVar != null) {
        }
        b0 b0Var22222 = (b0) this.f14491g;
        qVar.f14498g = null;
        qVar.j = 5;
        c1000b = (C1000b) b0Var22222.f10990g;
        if (c1000b != null) {
        }
        obj2 = obj42;
        if (obj2 == obj) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(3:(1:(1:(10:14|15|16|17|18|19|(2:22|(1:61)(2:24|(3:26|(4:28|29|30|(1:32)(5:33|34|(2:36|(1:38)(2:39|40))|41|(2:43|(1:45)(3:46|47|(3:49|50|(5:52|17|18|19|(1:20)))(3:53|54|55)))(3:57|50|(0))))|59)(3:60|30|(0)(0))))|62|54|55)(2:68|69))(6:70|71|72|73|47|(0)(0)))(6:77|78|79|40|41|(0)(0))|66|67)(7:83|84|85|34|(0)|41|(0)(0)))(5:86|87|29|30|(0)(0)))(8:88|89|90|19|(1:20)|62|54|55)))|92|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0047, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[Catch: all -> 0x00d9, TryCatch #3 {all -> 0x00d9, blocks: (B:20:0x00a9, B:22:0x00af, B:26:0x00bf, B:90:0x00a2), top: B:89:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:15:0x003e, B:30:0x00de, B:34:0x00fc, B:36:0x0101, B:41:0x011e, B:43:0x0128, B:47:0x013d, B:50:0x0146, B:84:0x0083, B:87:0x0092), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:15:0x003e, B:30:0x00de, B:34:0x00fc, B:36:0x0101, B:41:0x011e, B:43:0x0128, B:47:0x013d, B:50:0x0146, B:84:0x0083, B:87:0x0092), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r13v12, types: [n6.d] */
    /* JADX WARN: Type inference failed for: r13v13, types: [n6.d] */
    /* JADX WARN: Type inference failed for: r13v17, types: [n6.d] */
    /* JADX WARN: Type inference failed for: r14v22, types: [n6.d] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2, types: [n6.d] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x015a -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Bitmap bitmap, List list, C0037m c0037m, AbstractC0713c abstractC0713c) {
        r rVar;
        int i4;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Iterator it;
        C0037m c0037m2;
        C0037m c0037m3;
        C0037m c0037m4;
        Iterator it2;
        C0952b c0952b;
        ?? r15;
        C0952b c0952b2;
        k kVar;
        Z5.d dVar;
        Iterator it3;
        Bitmap bitmap4;
        C0037m c0037m5;
        Object d2;
        C0037m c0037m6;
        C0952b c0952b3;
        if (abstractC0713c instanceof r) {
            rVar = (r) abstractC0713c;
            int i8 = rVar.f14506n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                rVar.f14506n = i8 - Integer.MIN_VALUE;
                Object obj = rVar.f14504l;
                i4 = rVar.f14506n;
                v2.j jVar = this.f14486b;
                int i9 = 1;
                NativeDetector nativeDetector = this.f14485a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 == 5) {
                                        Iterator it4 = rVar.f14503i;
                                        ?? r13 = rVar.f14502h;
                                        bitmap2 = rVar.f14501g;
                                        Z5.a.d(obj);
                                        c0037m2 = r13;
                                        it = it4;
                                        bitmap3 = bitmap2;
                                        i9 = 1;
                                        while (it.hasNext()) {
                                            c0952b2 = (C0952b) it.next();
                                            if (!c0952b2.f11964f.isEmpty()) {
                                                if (jVar != null) {
                                                    rVar.f14501g = bitmap3;
                                                    rVar.f14502h = c0037m2;
                                                    rVar.f14503i = it;
                                                    rVar.j = c0952b2;
                                                    rVar.k = null;
                                                    rVar.f14506n = i9;
                                                    if (jVar.v(c0952b2, rVar) != enumC0646a) {
                                                        bitmap2 = bitmap3;
                                                        c0952b3 = c0952b2;
                                                        c0037m6 = c0037m2;
                                                        c0037m2 = c0037m6;
                                                        c0952b2 = c0952b3;
                                                        n nVar = (n) this.f14490f;
                                                        int i10 = c0952b2.f11962d;
                                                        List list2 = c0952b2.f11964f;
                                                        rVar.f14501g = bitmap2;
                                                        rVar.f14502h = c0037m2;
                                                        rVar.f14503i = it;
                                                        rVar.j = c0952b2;
                                                        rVar.k = null;
                                                        rVar.f14506n = 2;
                                                        d2 = nVar.d(i10, list2, rVar);
                                                        if (d2 != enumC0646a) {
                                                            c0037m5 = c0037m2;
                                                            obj = d2;
                                                            kVar = (k) obj;
                                                            r15 = c0037m5;
                                                            if (jVar != null) {
                                                                rVar.f14501g = bitmap2;
                                                                rVar.f14502h = c0037m5;
                                                                rVar.f14503i = it;
                                                                rVar.j = c0952b2;
                                                                rVar.k = kVar;
                                                                rVar.f14506n = 3;
                                                                if (jVar.r(c0952b2, kVar, rVar) != enumC0646a) {
                                                                    Bitmap bitmap5 = bitmap2;
                                                                    it3 = it;
                                                                    bitmap4 = bitmap5;
                                                                    dVar = c0037m5;
                                                                    Iterator it5 = it3;
                                                                    bitmap2 = bitmap4;
                                                                    it = it5;
                                                                    r15 = dVar;
                                                                }
                                                            }
                                                            if (o6.j.a(kVar.f14474b, Boolean.TRUE)) {
                                                                rVar.f14501g = bitmap2;
                                                                rVar.f14502h = r15;
                                                                rVar.f14503i = it;
                                                                rVar.j = c0952b2;
                                                                rVar.k = null;
                                                                rVar.f14506n = 4;
                                                                if (r15.j(c0952b2, kVar, rVar) != enumC0646a) {
                                                                    c0952b = c0952b2;
                                                                    it2 = it;
                                                                    c0037m4 = r15;
                                                                    if (!c0952b.f11967i) {
                                                                        it4 = it2;
                                                                        c0037m3 = c0037m4;
                                                                        rVar.f14501g = bitmap2;
                                                                        rVar.f14502h = c0037m3;
                                                                        rVar.f14503i = it4;
                                                                        rVar.j = null;
                                                                        rVar.k = null;
                                                                        rVar.f14506n = 5;
                                                                        if (AbstractC0166y.C(rVar) != enumC0646a) {
                                                                            c0037m2 = c0037m3;
                                                                            it = it4;
                                                                            bitmap3 = bitmap2;
                                                                            i9 = 1;
                                                                            while (it.hasNext()) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        bitmap3 = bitmap2;
                                                                        nativeDetector.e(bitmap3);
                                                                        return y.f7506a;
                                                                    }
                                                                }
                                                            } else {
                                                                it4 = it;
                                                                c0037m3 = r15;
                                                                rVar.f14501g = bitmap2;
                                                                rVar.f14502h = c0037m3;
                                                                rVar.f14503i = it4;
                                                                rVar.j = null;
                                                                rVar.k = null;
                                                                rVar.f14506n = 5;
                                                                if (AbstractC0166y.C(rVar) != enumC0646a) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return enumC0646a;
                                                }
                                                bitmap2 = bitmap3;
                                                n nVar2 = (n) this.f14490f;
                                                int i102 = c0952b2.f11962d;
                                                List list22 = c0952b2.f11964f;
                                                rVar.f14501g = bitmap2;
                                                rVar.f14502h = c0037m2;
                                                rVar.f14503i = it;
                                                rVar.j = c0952b2;
                                                rVar.k = null;
                                                rVar.f14506n = 2;
                                                d2 = nVar2.d(i102, list22, rVar);
                                                if (d2 != enumC0646a) {
                                                }
                                            }
                                        }
                                        nativeDetector.e(bitmap3);
                                        return y.f7506a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0952b = rVar.j;
                                it2 = rVar.f14503i;
                                ?? r14 = rVar.f14502h;
                                Bitmap bitmap6 = rVar.f14501g;
                                try {
                                    Z5.a.d(obj);
                                    c0037m4 = r14;
                                    bitmap2 = bitmap6;
                                    if (!c0952b.f11967i) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    bitmap2 = bitmap6;
                                }
                            } else {
                                kVar = rVar.k;
                                c0952b2 = rVar.j;
                                it3 = rVar.f14503i;
                                Z5.d dVar2 = rVar.f14502h;
                                bitmap4 = rVar.f14501g;
                                try {
                                    Z5.a.d(obj);
                                    dVar = dVar2;
                                    Iterator it52 = it3;
                                    bitmap2 = bitmap4;
                                    it = it52;
                                    r15 = dVar;
                                    if (o6.j.a(kVar.f14474b, Boolean.TRUE)) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bitmap2 = bitmap4;
                                }
                            }
                            nativeDetector.e(bitmap2);
                            throw th;
                        }
                        C0952b c0952b4 = rVar.j;
                        it = rVar.f14503i;
                        ?? r132 = rVar.f14502h;
                        bitmap2 = rVar.f14501g;
                        Z5.a.d(obj);
                        c0037m5 = r132;
                        c0952b2 = c0952b4;
                        kVar = (k) obj;
                        r15 = c0037m5;
                        if (jVar != null) {
                        }
                        if (o6.j.a(kVar.f14474b, Boolean.TRUE)) {
                        }
                    } else {
                        c0952b3 = rVar.j;
                        it = rVar.f14503i;
                        ?? r133 = rVar.f14502h;
                        bitmap2 = rVar.f14501g;
                        Z5.a.d(obj);
                        c0037m6 = r133;
                        c0037m2 = c0037m6;
                        c0952b2 = c0952b3;
                        n nVar22 = (n) this.f14490f;
                        int i1022 = c0952b2.f11962d;
                        List list222 = c0952b2.f11964f;
                        rVar.f14501g = bitmap2;
                        rVar.f14502h = c0037m2;
                        rVar.f14503i = it;
                        rVar.j = c0952b2;
                        rVar.k = null;
                        rVar.f14506n = 2;
                        d2 = nVar22.d(i1022, list222, rVar);
                        if (d2 != enumC0646a) {
                        }
                    }
                } else {
                    Z5.a.d(obj);
                    bitmap3 = bitmap;
                    nativeDetector.j(bitmap3, (String) this.f14488d);
                    try {
                        it = list.iterator();
                        c0037m2 = c0037m;
                        while (it.hasNext()) {
                        }
                        nativeDetector.e(bitmap3);
                        return y.f7506a;
                    } catch (Throwable th3) {
                        th = th3;
                        bitmap2 = bitmap3;
                    }
                }
            }
        }
        rVar = new r(this, abstractC0713c);
        Object obj2 = rVar.f14504l;
        i4 = rVar.f14506n;
        v2.j jVar2 = this.f14486b;
        int i92 = 1;
        NativeDetector nativeDetector2 = this.f14485a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
    
        r3 = 4;
        r6 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r12v11, types: [n6.d] */
    /* JADX WARN: Type inference failed for: r13v11, types: [n6.d] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [n6.d] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v9, types: [n6.d] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0123 -> B:13:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0128 -> B:14:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(List list, C0037m c0037m, AbstractC0713c abstractC0713c) {
        s sVar;
        int i4;
        Iterator it;
        C0037m c0037m2;
        C0037m c0037m3;
        char c6;
        k kVar;
        C0037m c0037m4;
        k kVar2;
        ?? r13;
        C0953c c0953c;
        Object d2;
        C0037m c0037m5;
        if (abstractC0713c instanceof s) {
            sVar = (s) abstractC0713c;
            int i8 = sVar.f14511m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sVar.f14511m = i8 - Integer.MIN_VALUE;
                Object obj = sVar.k;
                i4 = sVar.f14511m;
                y yVar = y.f7506a;
                v2.j jVar = this.f14486b;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    Iterator it2 = sVar.f14508h;
                                    ?? r12 = sVar.f14507g;
                                    Z5.a.d(obj);
                                    c0037m2 = r12;
                                    it = it2;
                                    char c9 = 4;
                                    c6 = 3;
                                    if (it.hasNext()) {
                                        c0953c = (C0953c) it.next();
                                        long j = c0953c.f11968a.f12187a;
                                        C1536c c1536c = (C1536c) this.f14487c.f10987d;
                                        if ((!((LinkedHashMap) ((R.g) c1536c.f14809f).f4987e).containsKey(Long.valueOf(j)) && !((LinkedHashMap) ((R.g) c1536c.f14808e).f4987e).containsKey(Long.valueOf(j))) || c0953c.f11973f.isEmpty()) {
                                            c9 = 4;
                                            c6 = 3;
                                            if (it.hasNext()) {
                                            }
                                        } else {
                                            if (jVar != null) {
                                                sVar.getClass();
                                                sVar.f14507g = c0037m2;
                                                sVar.f14508h = it;
                                                sVar.f14509i = c0953c;
                                                sVar.j = null;
                                                sVar.f14511m = 1;
                                                if (yVar != enumC0646a) {
                                                    c0037m5 = c0037m2;
                                                    c0037m2 = c0037m5;
                                                }
                                                return enumC0646a;
                                            }
                                            n nVar = (n) this.f14490f;
                                            int i9 = c0953c.f11971d;
                                            List list2 = c0953c.f11973f;
                                            sVar.getClass();
                                            sVar.f14507g = c0037m2;
                                            sVar.f14508h = it;
                                            sVar.f14509i = c0953c;
                                            sVar.j = null;
                                            sVar.f14511m = 2;
                                            d2 = nVar.d(i9, list2, sVar);
                                            if (d2 != enumC0646a) {
                                                r13 = c0037m2;
                                                obj = d2;
                                                kVar = (k) obj;
                                                if (!o6.j.a(kVar.f14474b, Boolean.TRUE)) {
                                                    sVar.f14507g = r13;
                                                    sVar.f14508h = it;
                                                    sVar.f14509i = c0953c;
                                                    sVar.j = kVar;
                                                    c6 = 3;
                                                    sVar.f14511m = 3;
                                                    if (r13.j(c0953c, kVar, sVar) != enumC0646a) {
                                                        kVar2 = kVar;
                                                        c0037m4 = r13;
                                                        kVar = kVar2;
                                                        c0037m3 = c0037m4;
                                                        if (jVar != null) {
                                                            kVar.a();
                                                            sVar.f14507g = c0037m3;
                                                            sVar.f14508h = it;
                                                            sVar.f14509i = null;
                                                            sVar.j = null;
                                                            c9 = 4;
                                                            sVar.f14511m = 4;
                                                            if (yVar != enumC0646a) {
                                                                c0037m2 = c0037m3;
                                                                if (it.hasNext()) {
                                                                    return yVar;
                                                                }
                                                            }
                                                        } else {
                                                            c0037m2 = c0037m3;
                                                            if (it.hasNext()) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c6 = 3;
                                                    c0037m3 = r13;
                                                    if (jVar != null) {
                                                    }
                                                }
                                            }
                                            return enumC0646a;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                kVar2 = sVar.j;
                                it = sVar.f14508h;
                                ?? r132 = sVar.f14507g;
                                Z5.a.d(obj);
                                c6 = 3;
                                c0037m4 = r132;
                                kVar = kVar2;
                                c0037m3 = c0037m4;
                                if (jVar != null) {
                                }
                            }
                        } else {
                            c0953c = sVar.f14509i;
                            it = sVar.f14508h;
                            InterfaceC1165d interfaceC1165d = sVar.f14507g;
                            Z5.a.d(obj);
                            r13 = interfaceC1165d;
                            kVar = (k) obj;
                            if (!o6.j.a(kVar.f14474b, Boolean.TRUE)) {
                            }
                        }
                    } else {
                        c0953c = sVar.f14509i;
                        it = sVar.f14508h;
                        ?? r133 = sVar.f14507g;
                        Z5.a.d(obj);
                        c0037m5 = r133;
                        c0037m2 = c0037m5;
                        n nVar2 = (n) this.f14490f;
                        int i92 = c0953c.f11971d;
                        List list22 = c0953c.f11973f;
                        sVar.getClass();
                        sVar.f14507g = c0037m2;
                        sVar.f14508h = it;
                        sVar.f14509i = c0953c;
                        sVar.j = null;
                        sVar.f14511m = 2;
                        d2 = nVar2.d(i92, list22, sVar);
                        if (d2 != enumC0646a) {
                        }
                        return enumC0646a;
                    }
                } else {
                    Z5.a.d(obj);
                    it = list.iterator();
                    c0037m2 = c0037m;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        sVar = new s(this, abstractC0713c);
        Object obj2 = sVar.k;
        i4 = sVar.f14511m;
        y yVar2 = y.f7506a;
        v2.j jVar2 = this.f14486b;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        if (r12 >= r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
    
        if (r12 > r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        if (r12 <= r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        if (r12 < r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r12 == r13) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01db -> B:11:0x01dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(int i4, List list, AbstractC0713c abstractC0713c) {
        l lVar;
        int i8;
        l lVar2;
        Iterator it;
        int i9;
        Iterator it2;
        AbstractC0901a abstractC0901a;
        int i10;
        Object obj;
        boolean z8;
        int i11;
        int i12;
        Object obj2;
        k kVar = (k) this.f14490f;
        if (abstractC0713c instanceof l) {
            lVar = (l) abstractC0713c;
            int i13 = lVar.f14478l;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f14478l = i13 - Integer.MIN_VALUE;
                Object obj3 = lVar.j;
                i8 = lVar.f14478l;
                int i14 = 1;
                Object obj4 = EnumC0646a.f10656d;
                if (i8 == 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            i10 = lVar.f14475g;
                            Iterator it3 = lVar.f14476h;
                            Z5.a.d(obj3);
                            obj = null;
                            l lVar3 = lVar;
                            it = it3;
                            i9 = i10;
                            lVar2 = lVar3;
                            i14 = 1;
                            if (!it.hasNext()) {
                                abstractC0901a = (AbstractC0901a) it.next();
                                lVar2.f14476h = it;
                                lVar2.f14477i = abstractC0901a;
                                lVar2.f14475g = i9;
                                lVar2.f14478l = i14;
                                if (abstractC0901a instanceof C0902b) {
                                    obj2 = e((C0902b) abstractC0901a, lVar2);
                                } else if (abstractC0901a instanceof j2.g) {
                                    j2.g gVar = (j2.g) abstractC0901a;
                                    boolean z9 = gVar instanceof C0903c;
                                    b0 b0Var = this.f14487c;
                                    if (z9) {
                                        C0903c c0903c = (C0903c) gVar;
                                        o6.j.e(c0903c, "condition");
                                        C1536c c1536c = (C1536c) b0Var.f10988e;
                                        c1536c.getClass();
                                        Boolean bool = (Boolean) ((ConcurrentHashMap) c1536c.f14808e).get(c0903c.f11801d);
                                        if (bool != null) {
                                            i11 = bool.booleanValue();
                                            if (i11 == 0) {
                                            }
                                        }
                                        i11 = 0;
                                        if (i11 == 0) {
                                        }
                                    } else if (gVar instanceof C0905e) {
                                        C0905e c0905e = (C0905e) gVar;
                                        Integer j = b0Var.j(c0905e.f11811d);
                                        if (j != null) {
                                            int intValue = j.intValue();
                                            AbstractC0640c abstractC0640c = c0905e.f11813f;
                                            if (abstractC0640c instanceof C0638a) {
                                                Integer j5 = b0Var.j(((C0638a) abstractC0640c).f10597a);
                                                if (j5 != null) {
                                                    i12 = j5.intValue();
                                                } else {
                                                    i12 = 0;
                                                }
                                            } else if (abstractC0640c instanceof C0639b) {
                                                i12 = ((C0639b) abstractC0640c).f10598a;
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            int ordinal = c0905e.f11812e.ordinal();
                                            if (ordinal != 0) {
                                                if (ordinal != i14) {
                                                    if (ordinal != 2) {
                                                        if (ordinal != 3) {
                                                            if (ordinal != 4) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (i11 == 0) {
                                            }
                                        }
                                        i11 = 0;
                                        if (i11 == 0) {
                                        }
                                    } else if (gVar instanceof j2.f) {
                                        j2.f fVar = (j2.f) gVar;
                                        Long l6 = (Long) this.f14491g;
                                        if (l6 != null) {
                                            long longValue = l6.longValue();
                                            long c6 = fVar.c();
                                            C1536c c1536c2 = (C1536c) b0Var.f10990g;
                                            LinkedHashMap linkedHashMap = (LinkedHashMap) c1536c2.f14809f;
                                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1536c2.f14809f;
                                            Long l8 = (Long) linkedHashMap.get(Long.valueOf(c6));
                                            if (l8 != null && longValue > l8.longValue()) {
                                                if (fVar.f11818e) {
                                                    Long valueOf = Long.valueOf(fVar.c());
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    long j8 = fVar.f11817d;
                                                    long j9 = Long.MAX_VALUE;
                                                    if (Long.MAX_VALUE - j8 >= currentTimeMillis) {
                                                        j9 = currentTimeMillis + j8;
                                                    }
                                                    linkedHashMap2.put(valueOf, Long.valueOf(j9));
                                                } else {
                                                    linkedHashMap2.remove(Long.valueOf(fVar.c()));
                                                }
                                                i11 = 1;
                                                if (i11 == 0) {
                                                    obj2 = f14483h;
                                                } else {
                                                    obj2 = f14484i;
                                                }
                                            }
                                        }
                                        i11 = 0;
                                        if (i11 == 0) {
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i9 = i10;
                                    lVar2 = lVar3;
                                    i14 = 1;
                                    if (!it.hasNext()) {
                                        int i15 = i14;
                                        if (i9 == i15) {
                                            z8 = i15;
                                        } else {
                                            z8 = 0;
                                        }
                                        kVar.f14474b = Boolean.valueOf(z8);
                                        return kVar;
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (obj2 != obj4) {
                                    it2 = it;
                                    lVar = lVar2;
                                    i10 = i9;
                                    obj3 = obj2;
                                    InterfaceC1661a interfaceC1661a = (InterfaceC1661a) obj3;
                                    long c9 = abstractC0901a.c();
                                    kVar.getClass();
                                    o6.j.e(interfaceC1661a, "result");
                                    if (kVar.f14474b == null) {
                                        kVar.f14473a.put(Long.valueOf(c9), interfaceC1661a);
                                    }
                                    if (i10 != 2 && interfaceC1661a.a()) {
                                        kVar.f14474b = Boolean.TRUE;
                                        return kVar;
                                    }
                                    if (i10 != 1 && !interfaceC1661a.a()) {
                                        kVar.f14474b = Boolean.FALSE;
                                        return kVar;
                                    }
                                    lVar.f14476h = it2;
                                    obj = null;
                                    lVar.f14477i = null;
                                    lVar.f14475g = i10;
                                    lVar.f14478l = 2;
                                    if (AbstractC0166y.C(lVar) != obj4) {
                                        lVar3 = lVar;
                                        it = it2;
                                        i9 = i10;
                                        lVar2 = lVar3;
                                        i14 = 1;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                                return obj4;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i10 = lVar.f14475g;
                        abstractC0901a = lVar.f14477i;
                        it2 = lVar.f14476h;
                        Z5.a.d(obj3);
                        InterfaceC1661a interfaceC1661a2 = (InterfaceC1661a) obj3;
                        long c92 = abstractC0901a.c();
                        kVar.getClass();
                        o6.j.e(interfaceC1661a2, "result");
                        if (kVar.f14474b == null) {
                        }
                        if (i10 != 2) {
                        }
                        if (i10 != 1) {
                        }
                        lVar.f14476h = it2;
                        obj = null;
                        lVar.f14477i = null;
                        lVar.f14475g = i10;
                        lVar.f14478l = 2;
                        if (AbstractC0166y.C(lVar) != obj4) {
                        }
                        return obj4;
                    }
                } else {
                    Z5.a.d(obj3);
                    kVar.f14473a.clear();
                    kVar.f14474b = null;
                    this.f14491g = new Long(System.currentTimeMillis());
                    lVar2 = lVar;
                    it = list.iterator();
                    i9 = i4;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        lVar = new l(this, abstractC0713c);
        Object obj32 = lVar.j;
        i8 = lVar.f14478l;
        int i142 = 1;
        Object obj42 = EnumC0646a.f10656d;
        if (i8 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if (r7.B(r1, r4) == r11) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(C0902b c0902b, AbstractC0713c abstractC0713c) {
        m mVar;
        int i4;
        C1630a c1630a;
        C0902b c0902b2;
        C1630a c1630a2;
        Bitmap bitmap;
        C0902b c0902b3 = c0902b;
        u2.b bVar = (u2.b) this.f14488d;
        if (abstractC0713c instanceof m) {
            mVar = (m) abstractC0713c;
            int i8 = mVar.f14482l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.f14482l = i8 - Integer.MIN_VALUE;
                Object obj = mVar.j;
                i4 = mVar.f14482l;
                InterfaceC1661a interfaceC1661a = f14484i;
                v2.j jVar = this.f14486b;
                boolean z8 = true;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                InterfaceC1661a interfaceC1661a2 = mVar.f14481i;
                                Z5.a.d(obj);
                                return interfaceC1661a2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1630a2 = mVar.f14480h;
                        C0902b c0902b4 = mVar.f14479g;
                        Z5.a.d(obj);
                        c0902b2 = c0902b4;
                        bitmap = (Bitmap) obj;
                        if (bitmap != null) {
                            DetectionResult a3 = this.f14485a.a(bitmap, c1630a2.f15311b.width(), c1630a2.f15311b.height(), c1630a2.f15312c, c0902b2.f11795g);
                            boolean z9 = a3.f9772a;
                            if (z9 != c0902b2.f11797i) {
                                z8 = false;
                            }
                            interfaceC1661a = new p(z8, z9, c0902b2, h2.a.z(a3.f9773b, 1.0d / bVar.f15316d), a3.f9774c);
                        }
                        if (jVar != null) {
                            mVar.f14479g = null;
                            mVar.f14480h = null;
                            mVar.f14481i = interfaceC1661a;
                            mVar.f14482l = 3;
                            if (jVar.R(interfaceC1661a) == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return interfaceC1661a;
                    }
                    c0902b3 = mVar.f14479g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    if (jVar != null) {
                        mVar.f14479g = c0902b3;
                        mVar.f14482l = 1;
                    }
                }
                o6.j.e(c0902b3, "imageCondition");
                c1630a = (C1630a) bVar.f15314b.get(Long.valueOf(c0902b3.f11789a.f12187a));
                if (c1630a != null) {
                    return interfaceC1661a;
                }
                Rect rect = c1630a.f15311b;
                C1433e c1433e = (C1433e) this.f14489e;
                String str = c0902b3.f11793e;
                Integer num = new Integer(rect.width());
                Integer num2 = new Integer(rect.height());
                mVar.f14479g = c0902b3;
                mVar.f14480h = c1630a;
                mVar.f14482l = 2;
                Object q6 = c1433e.q(str, num, num2, mVar);
                if (q6 != enumC0646a) {
                    c0902b2 = c0902b3;
                    c1630a2 = c1630a;
                    obj = q6;
                    bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                    }
                    if (jVar != null) {
                    }
                    return interfaceC1661a;
                }
                return enumC0646a;
            }
        }
        mVar = new m(this, abstractC0713c);
        Object obj2 = mVar.j;
        i4 = mVar.f14482l;
        InterfaceC1661a interfaceC1661a3 = f14484i;
        v2.j jVar2 = this.f14486b;
        boolean z82 = true;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        o6.j.e(c0902b3, "imageCondition");
        c1630a = (C1630a) bVar.f15314b.get(Long.valueOf(c0902b3.f11789a.f12187a));
        if (c1630a != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [g0.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [g0.b0, java.lang.Object] */
    public n(String str, NativeDetector nativeDetector, u2.b bVar, boolean z8, List list, List list2, C1433e c1433e, C1428b c1428b, boolean z9, B0.e eVar, v2.j jVar) {
        o6.j.e(str, "processingTag");
        o6.j.e(list, "imageEvents");
        o6.j.e(list2, "triggerEvents");
        o6.j.e(c1428b, "androidExecutor");
        this.f14488d = str;
        this.f14485a = nativeDetector;
        this.f14489e = eVar;
        this.f14486b = jVar;
        C1536c c1536c = new C1536c(list, list2);
        C1536c c1536c2 = new C1536c(4, list2);
        X6.q qVar = new X6.q(list, list2);
        C1536c c1536c3 = new C1536c(6, list2);
        o6.j.e(list, "imageEvents");
        o6.j.e(list2, "triggerEvents");
        ?? obj = new Object();
        obj.f10987d = c1536c;
        obj.f10988e = c1536c2;
        obj.f10989f = qVar;
        obj.f10990g = c1536c3;
        C1562a c1562a = new C1562a((Object) obj);
        ((R.g) c1536c.f14809f).f4989g = c1562a;
        ((R.g) c1536c.f14808e).f4989g = c1562a;
        this.f14487c = obj;
        this.f14490f = new n(obj, nativeDetector, bVar, c1433e, jVar);
        o6.j.e(c1428b, "androidExecutor");
        ?? obj2 = new Object();
        obj2.f10987d = c1428b;
        obj2.f10988e = obj;
        c1428b.c();
        obj2.f10989f = z8 ? h4.g.a(System.currentTimeMillis()) : null;
        obj2.f10990g = z9 ? new C1000b() : null;
        this.f14491g = obj2;
    }
}
