package O7;

import P7.AbstractC0284a;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class G extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4069h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4070i;
    public final /* synthetic */ InterfaceC0233f j;
    public final /* synthetic */ AbstractC0284a k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4071l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(InterfaceC0233f interfaceC0233f, M m6, Object obj, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = interfaceC0233f;
        this.k = (AbstractC0284a) m6;
        this.f4071l = obj;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((G) p((InterfaceC0617c) obj2, (X) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [O7.M, P7.a] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        G g8 = new G(this.j, this.k, this.f4071l, interfaceC0617c);
        g8.f4070i = obj;
        return g8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [O7.M, O7.g, P7.a] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4069h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            int ordinal = ((X) this.f4070i).ordinal();
            ?? r02 = this.k;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        Q7.t tVar = V.f4104a;
                        Object obj2 = this.f4071l;
                        if (obj2 == tVar) {
                            r02.s();
                        } else {
                            r02.t(obj2);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                this.f4069h = 1;
                Object x8 = this.j.x(r02, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            }
        }
        return Z5.y.f7506a;
    }
}
