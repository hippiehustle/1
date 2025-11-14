package T7;

import L7.H;
import Q7.r;
import Q7.t;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1165d f5909b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1165d f5910c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5911d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0720j f5912e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1165d f5913f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5914g;

    /* renamed from: h, reason: collision with root package name */
    public int f5915h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5916i;

    public c(e eVar, Object obj, InterfaceC1165d interfaceC1165d, InterfaceC1165d interfaceC1165d2, t tVar, AbstractC0720j abstractC0720j, InterfaceC1165d interfaceC1165d3) {
        this.f5916i = eVar;
        this.f5908a = obj;
        this.f5909b = interfaceC1165d;
        this.f5910c = interfaceC1165d2;
        this.f5911d = tVar;
        this.f5912e = abstractC0720j;
        this.f5913f = interfaceC1165d3;
    }

    public final void a() {
        H h8;
        Object obj = this.f5914g;
        if (obj instanceof r) {
            ((r) obj).h(this.f5915h, this.f5916i.f5921d);
            return;
        }
        if (obj instanceof H) {
            h8 = (H) obj;
        } else {
            h8 = null;
        }
        if (h8 != null) {
            h8.b();
        }
    }
}
