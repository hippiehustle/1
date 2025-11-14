package a0;

import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.InterfaceC1164c;
import o6.j;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f7663h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7664i;
    public final /* synthetic */ AbstractC0720j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0408c(InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0408c) p((InterfaceC0617c) obj2, (C0407b) obj)).v(y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0408c c0408c = new C0408c(this.j, interfaceC0617c);
        c0408c.f7664i = obj;
        return c0408c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f7663h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0407b c0407b = (C0407b) this.f7664i;
            this.f7663h = 1;
            obj = this.j.l(c0407b, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        C0407b c0407b2 = (C0407b) obj;
        j.c(c0407b2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) c0407b2.f7662b.f6634e).set(true);
        return c0407b2;
    }
}
