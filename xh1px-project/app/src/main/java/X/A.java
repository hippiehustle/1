package X;

import L7.AbstractC0166y;
import androidx.datastore.core.CorruptionException;
import com.buzbuz.smartautoclicker.core.database.ScenarioDatabase;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.io.Serializable;
import java.util.List;
import l2.C1001a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class A extends AbstractC0720j implements InterfaceC1163b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6635h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f6636i;
    public final /* synthetic */ Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6637l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6638m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(H h8, InterfaceC0622h interfaceC0622h, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.j = h8;
        this.f6637l = interfaceC0622h;
        this.f6638m = (AbstractC0720j) interfaceC1164c;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [f6.j, n6.c] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f6635h) {
            case 0:
                return new A((o6.u) this.f6637l, (H) this.j, (o6.s) this.f6638m, (InterfaceC0617c) obj).v(Z5.y.f7506a);
            case 1:
                return new A((H) this.j, (InterfaceC0622h) this.f6637l, (InterfaceC1164c) this.f6638m, (InterfaceC0617c) obj).v(Z5.y.f7506a);
            default:
                return new A((c2.z) this.k, (C1001a) this.f6637l, (List) this.j, (InterfaceC1164c) this.f6638m, (InterfaceC0617c) obj).v(Z5.y.f7506a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Type inference failed for: r8v3, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        o6.u uVar;
        o6.s sVar;
        C0334b c0334b;
        Object obj2;
        int i4;
        Object C8;
        switch (this.f6635h) {
            case 0:
                o6.s sVar2 = (o6.s) this.f6638m;
                o6.u uVar2 = (o6.u) this.f6637l;
                H h8 = (H) this.j;
                int i8 = this.f6636i;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                try {
                } catch (CorruptionException unused) {
                    Object obj3 = uVar2.f13642d;
                    this.k = sVar2;
                    this.f6636i = 3;
                    obj = h8.k(obj3, true, this);
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                sVar2 = (o6.s) ((Serializable) this.k);
                                Z5.a.d(obj);
                                sVar2.f13640d = ((Number) obj).intValue();
                                return Z5.y.f7506a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar = (o6.s) ((Serializable) this.k);
                        Z5.a.d(obj);
                        sVar.f13640d = ((Number) obj).intValue();
                        return Z5.y.f7506a;
                    }
                    uVar = (o6.u) ((Serializable) this.k);
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    this.k = uVar2;
                    this.f6636i = 1;
                    obj = h8.j(this);
                    if (obj != enumC0646a) {
                        uVar = uVar2;
                    } else {
                        return enumC0646a;
                    }
                }
                uVar.f13642d = obj;
                b0 h9 = h8.h();
                this.k = sVar2;
                this.f6636i = 2;
                obj = h9.a();
                if (obj != enumC0646a) {
                    sVar = sVar2;
                    sVar.f13640d = ((Number) obj).intValue();
                    return Z5.y.f7506a;
                }
                return enumC0646a;
            case 1:
                H h10 = (H) this.j;
                int i9 = this.f6636i;
                EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                Object obj4 = this.k;
                                Z5.a.d(obj);
                                return obj4;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0334b = (C0334b) this.k;
                        Z5.a.d(obj);
                        obj2 = c0334b.f6711b;
                        if (obj2 == null) {
                            i4 = obj2.hashCode();
                        } else {
                            i4 = 0;
                        }
                        if (i4 != c0334b.f6712c) {
                            if (!o6.j.a(c0334b.f6711b, obj)) {
                                this.k = obj;
                                this.f6636i = 3;
                                if (h10.k(obj, true, this) == enumC0646a2) {
                                    return enumC0646a2;
                                }
                            }
                            return obj;
                        }
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    this.f6636i = 1;
                    obj = H.f(h10, true, this);
                    if (obj == enumC0646a2) {
                        return enumC0646a2;
                    }
                }
                c0334b = (C0334b) obj;
                InterfaceC0622h interfaceC0622h = (InterfaceC0622h) this.f6637l;
                C c6 = new C((AbstractC0720j) this.f6638m, c0334b, null);
                this.k = c0334b;
                this.f6636i = 2;
                obj = AbstractC0166y.A(interfaceC0622h, c6, this);
                if (obj == enumC0646a2) {
                    return enumC0646a2;
                }
                obj2 = c0334b.f6711b;
                if (obj2 == null) {
                }
                if (i4 != c0334b.f6712c) {
                }
            default:
                c2.z zVar = (c2.z) this.k;
                C1001a c1001a = (C1001a) this.f6637l;
                int i10 = this.f6636i;
                Object obj5 = EnumC0646a.f10656d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            Z5.a.d(obj);
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    S1.F r8 = ((ScenarioDatabase) zVar.f9602c.f()).r();
                    T1.K w8 = h4.g.w(c1001a);
                    this.f6636i = 1;
                    switch (r8.f5221a) {
                        case 0:
                            C8 = D2.f.C(this, new S1.C(r8, w8, 1), r8.f5222b, false, true);
                            if (C8 != EnumC0646a.f10656d) {
                                C8 = Z5.y.f7506a;
                                break;
                            }
                            break;
                        default:
                            C8 = D2.f.C(this, new S1.I(r8, w8, 0), r8.f5222b, false, true);
                            if (C8 != EnumC0646a.f10656d) {
                                C8 = Z5.y.f7506a;
                                break;
                            }
                            break;
                    }
                    if (C8 == obj5) {
                        return obj5;
                    }
                }
                long j = c1001a.f12190a.f12187a;
                List list = (List) this.j;
                InterfaceC1164c interfaceC1164c = (InterfaceC1164c) this.f6638m;
                this.f6636i = 2;
                if (c2.z.b(zVar, j, list, interfaceC1164c, this) == obj5) {
                    return obj5;
                }
                return Z5.y.f7506a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(c2.z zVar, C1001a c1001a, List list, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.k = zVar;
        this.f6637l = c1001a;
        this.j = list;
        this.f6638m = interfaceC1164c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(o6.u uVar, H h8, o6.s sVar, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.f6637l = uVar;
        this.j = h8;
        this.f6638m = sVar;
    }
}
