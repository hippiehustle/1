package r2;

import L7.InterfaceC0163v;
import Z5.y;
import a6.AbstractC0436k;
import a6.s;
import android.content.Context;
import android.graphics.Point;
import com.buzbuz.smartautoclicker.core.detection.NativeDetector;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import g0.b0;
import h1.AbstractC0812e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k2.C0952b;
import k2.C0953c;
import l2.C1001a;
import n6.InterfaceC1164c;
import s2.n;
import t0.C1536c;

/* renamed from: r2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1434f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14275h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f14276i;
    public final /* synthetic */ C1001a j;
    public final /* synthetic */ List k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NativeDetector f14277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v2.j f14278m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f14279n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f14280o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1434f(j jVar, C1001a c1001a, List list, NativeDetector nativeDetector, v2.j jVar2, Context context, List list2, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14276i = jVar;
        this.j = c1001a;
        this.k = list;
        this.f14277l = nativeDetector;
        this.f14278m = jVar2;
        this.f14279n = context;
        this.f14280o = list2;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1434f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1434f(this.f14276i, this.j, this.k, this.f14277l, this.f14278m, this.f14279n, this.f14280o, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
    
        if (r1.D(r2, r4, r3, r25) == r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0163, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006e, code lost:
    
        if (r1.b(r11, r25) == r9) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
    /* JADX WARN: Type inference failed for: r16v0, types: [o6.i, r2.e] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        String str;
        int i4 = this.f14275h;
        Context context = this.f14279n;
        NativeDetector nativeDetector = this.f14277l;
        List list = this.k;
        C1001a c1001a = this.j;
        j jVar = this.f14276i;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Z5.a.d(obj);
                        return y.f7506a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                str = jVar.f14300h.f11750a;
                if (str == null) {
                    n nVar = new n(str, nativeDetector, jVar.f14296d, c1001a.f12193d, this.k, this.f14280o, new o6.i(4, jVar.f14295c, q1.e.class, "getImageConditionBitmap", "getImageConditionBitmap(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), jVar.f14298f, ((Boolean) jVar.f14299g.j.f4088d.f()).booleanValue(), new B0.e(27, jVar), this.f14278m);
                    jVar.f14301i = nVar;
                    o6.j.e(context, "context");
                    b0 b0Var = nVar.f14487c;
                    b0Var.getClass();
                    C1536c c1536c = (C1536c) b0Var.f10988e;
                    c1536c.getClass();
                    if (!((ConcurrentHashMap) c1536c.f14808e).isEmpty()) {
                        AbstractC0812e.c((Y1.c) c1536c.f14809f, context);
                    }
                    C1536c c1536c2 = (C1536c) b0Var.f10990g;
                    c1536c2.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C0953c c0953c : (List) c1536c2.f14808e) {
                        if (c0953c.f11974g) {
                            for (j2.g gVar : c0953c.f11973f) {
                                if (gVar instanceof j2.f) {
                                    LinkedHashMap linkedHashMap = (LinkedHashMap) c1536c2.f14809f;
                                    Long valueOf = Long.valueOf(gVar.c());
                                    long j = ((j2.f) gVar).f11817d;
                                    long j5 = Long.MAX_VALUE;
                                    if (Long.MAX_VALUE - j >= currentTimeMillis) {
                                        j5 = currentTimeMillis + j;
                                    }
                                    linkedHashMap.put(valueOf, Long.valueOf(j5));
                                }
                            }
                        }
                    }
                    this.f14275h = 3;
                    if (j.a(jVar, this) == enumC0646a) {
                        return enumC0646a;
                    }
                    return y.f7506a;
                }
                o6.j.i("_originalAppId");
                throw null;
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            jVar.f14295c.f13923a.evictAll();
            a2.h hVar = jVar.f14297e;
            u2.b bVar = jVar.f14296d;
            double d2 = c1001a.f12192c;
            o6.j.e(list, "screenEvents");
            bVar.f15315c = d2;
            Point b4 = bVar.b();
            Iterator it = list.iterator();
            List list2 = s.f7766d;
            while (it.hasNext()) {
                list2 = AbstractC0436k.C0(list2, ((C0952b) it.next()).f11964f);
            }
            bVar.a(b4, list2);
            this.f14275h = 1;
        }
        jVar.j = nativeDetector;
        nativeDetector.d();
        v2.j jVar2 = this.f14278m;
        jVar.f14307q = jVar2;
        if (jVar2 != null) {
            this.f14275h = 2;
        }
        str = jVar.f14300h.f11750a;
        if (str == null) {
        }
    }
}
