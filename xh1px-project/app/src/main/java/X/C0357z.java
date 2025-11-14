package X;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: X.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357z extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public Object f6795h;

    /* renamed from: i, reason: collision with root package name */
    public int f6796i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ H k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6797l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0357z(H h8, int i4, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.k = h8;
        this.f6797l = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0357z) p((InterfaceC0617c) obj2, bool)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0357z c0357z = new C0357z(this.k, this.f6797l, interfaceC0617c);
        c0357z.j = ((Boolean) obj).booleanValue();
        return c0357z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        boolean z8;
        Object obj2;
        int i4;
        int i8;
        int i9 = this.f6796i;
        H h8 = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    obj2 = this.f6795h;
                    Z5.a.d(obj);
                    i4 = ((Number) obj).intValue();
                    if (obj2 != null) {
                        i8 = obj2.hashCode();
                    } else {
                        i8 = 0;
                    }
                    return new C0334b(obj2, i8, i4);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z8 = this.j;
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            z8 = this.j;
            this.j = z8;
            this.f6796i = 1;
            obj = h8.j(this);
        }
        if (z8) {
            b0 h9 = h8.h();
            this.f6795h = obj;
            this.f6796i = 2;
            Integer a3 = h9.a();
            if (a3 != enumC0646a) {
                obj2 = obj;
                obj = a3;
                i4 = ((Number) obj).intValue();
                if (obj2 != null) {
                }
                return new C0334b(obj2, i8, i4);
            }
            return enumC0646a;
        }
        obj2 = obj;
        i4 = this.f6797l;
        if (obj2 != null) {
        }
        return new C0334b(obj2, i8, i4);
    }
}
