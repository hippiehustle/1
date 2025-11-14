package r2;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.EnumC0164w;
import L7.k0;
import O7.V;
import O7.i0;
import Z5.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.buzbuz.smartautoclicker.core.detection.NativeDetector;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import i1.C0879a;
import java.util.List;
import l2.C1001a;
import r1.C1428b;
import s2.n;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0160s f14293a;

    /* renamed from: b, reason: collision with root package name */
    public final Y1.d f14294b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.e f14295c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.b f14296d;

    /* renamed from: e, reason: collision with root package name */
    public final a2.h f14297e;

    /* renamed from: f, reason: collision with root package name */
    public final C1428b f14298f;

    /* renamed from: g, reason: collision with root package name */
    public final x2.f f14299g;

    /* renamed from: h, reason: collision with root package name */
    public final C0879a f14300h;

    /* renamed from: i, reason: collision with root package name */
    public n f14301i;
    public NativeDetector j;
    public Q7.d k;

    /* renamed from: l, reason: collision with root package name */
    public k0 f14302l;

    /* renamed from: m, reason: collision with root package name */
    public k0 f14303m;

    /* renamed from: n, reason: collision with root package name */
    public final C1429a f14304n;

    /* renamed from: o, reason: collision with root package name */
    public final i0 f14305o;

    /* renamed from: p, reason: collision with root package name */
    public final i0 f14306p;

    /* renamed from: q, reason: collision with root package name */
    public v2.j f14307q;

    public j(AbstractC0160s abstractC0160s, Y1.d dVar, q1.e eVar, u2.b bVar, a2.h hVar, C1428b c1428b, x2.f fVar, C0879a c0879a) {
        o6.j.e(dVar, "displayConfigManager");
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(hVar, "displayRecorder");
        o6.j.e(c1428b, "actionExecutor");
        o6.j.e(fVar, "settingsRepository");
        o6.j.e(c0879a, "appComponentsProvider");
        this.f14293a = abstractC0160s;
        this.f14294b = dVar;
        this.f14295c = eVar;
        this.f14296d = bVar;
        this.f14297e = hVar;
        this.f14298f = c1428b;
        this.f14299g = fVar;
        this.f14300h = c0879a;
        this.f14304n = new C1429a(0, this);
        i0 c6 = V.c(k.f14308d);
        this.f14305o = c6;
        this.f14306p = c6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r11 == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r1.a(r11, r0) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (0 == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (L7.AbstractC0166y.g(20, r0) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        if (r5 == r7) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0088 -> B:18:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, AbstractC0713c abstractC0713c) {
        C1432d c1432d;
        int i4;
        k0 k0Var;
        jVar.getClass();
        if (abstractC0713c instanceof C1432d) {
            c1432d = (C1432d) abstractC0713c;
            int i8 = c1432d.f14274i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1432d.f14274i = i8 - Integer.MIN_VALUE;
                Object obj = c1432d.f14272g;
                i4 = c1432d.f14274i;
                y yVar = y.f7506a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                Z5.a.d(obj);
                            }
                        } else {
                            Z5.a.d(obj);
                            Bitmap bitmap = (Bitmap) obj;
                            if (bitmap != null) {
                                n nVar = jVar.f14301i;
                                if (nVar != null) {
                                    c1432d.f14274i = 3;
                                }
                            }
                            c1432d.f14274i = 4;
                        }
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    i0 i0Var = jVar.f14305o;
                    c1432d.f14274i = 1;
                    i0Var.n(k.f14311g, c1432d);
                }
                k0Var = jVar.f14302l;
                if (k0Var == null && k0Var.a()) {
                    a2.h hVar = jVar.f14297e;
                    c1432d.f14274i = 2;
                    obj = hVar.a(c1432d);
                } else {
                    return yVar;
                }
            }
        }
        c1432d = new C1432d(jVar, abstractC0713c);
        Object obj2 = c1432d.f14272g;
        i4 = c1432d.f14274i;
        y yVar2 = y.f7506a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        k0Var = jVar.f14302l;
        if (k0Var == null) {
        }
        return yVar2;
    }

    public final void b(Context context, C1001a c1001a, List list, List list2, v2.j jVar) {
        NativeDetector nativeDetector;
        o6.j.e(context, "context");
        o6.j.e(c1001a, "scenario");
        o6.j.e(list, "imageEvents");
        o6.j.e(list2, "triggerEvents");
        i0 i0Var = this.f14305o;
        if (i0Var.f() != k.f14310f) {
            Log.w("DetectorEngine", "startDetection: Screen record is not started.");
            return;
        }
        try {
            System.loadLibrary("smartautoclicker");
            nativeDetector = new NativeDetector();
        } catch (UnsatisfiedLinkError unused) {
            nativeDetector = null;
        }
        if (nativeDetector == null) {
            Log.e("DetectorEngine", "startDetection: native library not found.");
            i0Var.getClass();
            i0Var.h(null, k.f14312h);
            return;
        }
        i0Var.getClass();
        i0Var.h(null, k.f14309e);
        Log.i("DetectorEngine", "startDetection");
        Q7.d dVar = this.k;
        if (dVar != null) {
            k0 q6 = AbstractC0166y.q(dVar, null, EnumC0164w.f3249e, new C1434f(this, c1001a, list, nativeDetector, jVar, context, list2, null), 1);
            this.f14302l = q6;
            q6.start();
        }
    }

    public final void c() {
        i0 i0Var = this.f14305o;
        if (i0Var.f() != k.f14311g) {
            Log.w("DetectorEngine", "stopDetection: detection is not started.");
            return;
        }
        i0Var.getClass();
        k0 k0Var = null;
        i0Var.h(null, k.f14309e);
        Q7.d dVar = this.k;
        if (dVar != null) {
            k0Var = AbstractC0166y.q(dVar, null, null, new C1436h(this, null), 3);
        }
        this.f14303m = k0Var;
    }

    public final void d() {
        Log.i("DetectorEngine", "stopScreenRecord");
        i0 i0Var = this.f14305o;
        i0Var.getClass();
        i0Var.h(null, k.f14309e);
        Q7.d dVar = this.k;
        if (dVar != null) {
            AbstractC0166y.q(dVar, null, null, new i(this, null), 3);
        }
    }

    public final void e() {
        i0 i0Var = this.f14305o;
        if (i0Var.f() == k.f14311g) {
            c();
            d();
        } else if (i0Var.f() == k.f14310f) {
            d();
        }
    }
}
