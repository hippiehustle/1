package w7;

import java.util.ArrayDeque;
import x7.C1823e;
import x7.C1824f;
import x7.InterfaceC1820b;
import z7.InterfaceC1887d;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15959a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15960b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1820b f15961c;

    /* renamed from: d, reason: collision with root package name */
    public final C1823e f15962d;

    /* renamed from: e, reason: collision with root package name */
    public final C1824f f15963e;

    /* renamed from: f, reason: collision with root package name */
    public int f15964f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayDeque f15965g;

    /* renamed from: h, reason: collision with root package name */
    public F7.i f15966h;

    public I(boolean z8, boolean z9, InterfaceC1820b interfaceC1820b, C1823e c1823e, C1824f c1824f) {
        o6.j.e(interfaceC1820b, "typeSystemContext");
        o6.j.e(c1823e, "kotlinTypePreparator");
        o6.j.e(c1824f, "kotlinTypeRefiner");
        this.f15959a = z8;
        this.f15960b = z9;
        this.f15961c = interfaceC1820b;
        this.f15962d = c1823e;
        this.f15963e = c1824f;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f15965g;
        o6.j.b(arrayDeque);
        arrayDeque.clear();
        F7.i iVar = this.f15966h;
        o6.j.b(iVar);
        iVar.clear();
    }

    public boolean b(InterfaceC1887d interfaceC1887d, InterfaceC1887d interfaceC1887d2) {
        return true;
    }

    public final void c() {
        if (this.f15965g == null) {
            this.f15965g = new ArrayDeque(4);
        }
        if (this.f15966h == null) {
            int i4 = F7.i.f1630f;
            this.f15966h = F7.l.e();
        }
    }

    public final W d(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "type");
        return this.f15962d.a(interfaceC1887d);
    }

    public final AbstractC1759v e(InterfaceC1887d interfaceC1887d) {
        o6.j.e(interfaceC1887d, "type");
        this.f15963e.getClass();
        return (AbstractC1759v) interfaceC1887d;
    }
}
