package X;

import L7.AbstractC0166y;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349q extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public C0334b f6764h;

    /* renamed from: i, reason: collision with root package name */
    public int f6765i;
    public /* synthetic */ Object j;
    public final /* synthetic */ H k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349q(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.k = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0349q) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0349q c0349q = new C0349q(this.k, interfaceC0617c);
        c0349q.j = obj;
        return c0349q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r3.n(r12, r11) == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if ((r0 instanceof X.S) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[RETURN] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g;
        c0 c0Var;
        O7.r rVar;
        int i4 = this.f6765i;
        Z5.y yVar = Z5.y.f7506a;
        H h8 = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = this.f6764h;
                interfaceC0234g = (InterfaceC0234g) this.j;
                Z5.a.d(obj);
                rVar = new O7.r(new W5.a(1, new A.i(new A.i(new A.i(new C0345m(h8, null), 23, h8.k.f571e), 25, new AbstractC0720j(2, null)), new C0347o(c0Var, null))), new S3.h(h8, null));
                this.j = null;
                this.f6764h = null;
                this.f6765i = 3;
                if (O7.V.l(interfaceC0234g, rVar, this) != enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            }
            InterfaceC0234g interfaceC0234g2 = (InterfaceC0234g) this.j;
            Z5.a.d(obj);
            interfaceC0234g = interfaceC0234g2;
        } else {
            Z5.a.d(obj);
            InterfaceC0234g interfaceC0234g3 = (InterfaceC0234g) this.j;
            this.j = interfaceC0234g3;
            this.f6765i = 1;
            Object A2 = AbstractC0166y.A(h8.f6657f.f4940d, new B(h8, null), this);
            if (A2 != enumC0646a) {
                interfaceC0234g = interfaceC0234g3;
                obj = A2;
            }
            return enumC0646a;
        }
        c0Var = (c0) obj;
        if (c0Var instanceof C0334b) {
            Object obj2 = ((C0334b) c0Var).f6711b;
            this.j = interfaceC0234g;
            this.f6764h = (C0334b) c0Var;
            this.f6765i = 2;
        } else if (!(c0Var instanceof d0)) {
            if (c0Var instanceof U) {
                throw ((U) c0Var).f6697b;
            }
        } else {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        rVar = new O7.r(new W5.a(1, new A.i(new A.i(new A.i(new C0345m(h8, null), 23, h8.k.f571e), 25, new AbstractC0720j(2, null)), new C0347o(c0Var, null))), new S3.h(h8, null));
        this.j = null;
        this.f6764h = null;
        this.f6765i = 3;
        if (O7.V.l(interfaceC0234g, rVar, this) != enumC0646a) {
        }
    }
}
