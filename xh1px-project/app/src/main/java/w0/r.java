package w0;

import f6.AbstractC0713c;
import n6.InterfaceC1163b;
import u0.InterfaceC1624o;
import x0.C1775d;

/* loaded from: classes.dex */
public final class r implements y, InterfaceC1624o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15628b;

    public /* synthetic */ r(int i4, Object obj) {
        this.f15627a = i4;
        this.f15628b = obj;
    }

    @Override // u0.InterfaceC1624o
    public final Object a(String str, InterfaceC1163b interfaceC1163b, AbstractC0713c abstractC0713c) {
        switch (this.f15627a) {
            case 0:
                return ((x) this.f15628b).a(str, interfaceC1163b, abstractC0713c);
            default:
                return ((C1775d) this.f15628b).a(str, interfaceC1163b, abstractC0713c);
        }
    }

    @Override // w0.y
    public final D0.a c() {
        switch (this.f15627a) {
            case 0:
                return ((x) this.f15628b).f15647a;
            default:
                return ((C1775d) this.f15628b).f16084a;
        }
    }
}
