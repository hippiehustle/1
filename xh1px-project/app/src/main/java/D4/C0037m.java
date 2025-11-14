package D4;

import O7.C0235h;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.V;
import O7.i0;
import O7.k0;
import P7.AbstractC0285b;
import a.AbstractC0405a;
import d4.C0604j;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import g0.b0;
import i.AbstractC0863b;
import java.util.List;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l2.C1001a;
import l3.C1018q;
import l3.C1020s;
import n6.InterfaceC1165d;
import o2.C1229a;
import q2.C1365k;
import u0.C1621l;

/* renamed from: D4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037m extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f970h;

    /* renamed from: i, reason: collision with root package name */
    public int f971i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f972l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037m(InterfaceC0617c interfaceC0617c, Object obj, int i4) {
        super(3, interfaceC0617c);
        this.f970h = i4;
        this.f972l = obj;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f970h) {
            case 0:
                C0037m c0037m = new C0037m((s) this.f972l, (InterfaceC0617c) obj3, 0);
                c0037m.j = (InterfaceC0234g) obj;
                c0037m.k = (List) obj2;
                return c0037m.v(Z5.y.f7506a);
            case 1:
                C0037m c0037m2 = new C0037m((P) this.f972l, (InterfaceC0617c) obj3, 1);
                c0037m2.j = (InterfaceC0234g) obj;
                c0037m2.k = (C0030f) obj2;
                return c0037m2.v(Z5.y.f7506a);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0037m c0037m3 = new C0037m(this.f972l, (InterfaceC0617c) obj3, 2);
                c0037m3.j = (InterfaceC0234g) obj;
                c0037m3.k = obj2;
                return c0037m3.v(Z5.y.f7506a);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0037m c0037m4 = new C0037m(this.f972l, (InterfaceC0617c) obj3, 3);
                c0037m4.j = (InterfaceC0234g) obj;
                c0037m4.k = (Object[]) obj2;
                return c0037m4.v(Z5.y.f7506a);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C0037m c0037m5 = new C0037m((InterfaceC0617c) obj3, (S4.k) this.f972l, 4);
                c0037m5.j = (InterfaceC0234g) obj;
                c0037m5.k = obj2;
                return c0037m5.v(Z5.y.f7506a);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                C0037m c0037m6 = new C0037m((InterfaceC0617c) obj3, (U3.A) this.f972l, 5);
                c0037m6.j = (InterfaceC0234g) obj;
                c0037m6.k = obj2;
                return c0037m6.v(Z5.y.f7506a);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                C0037m c0037m7 = new C0037m((InterfaceC0617c) obj3, (C0604j) this.f972l, 6);
                c0037m7.j = (InterfaceC0234g) obj;
                c0037m7.k = obj2;
                return c0037m7.v(Z5.y.f7506a);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                C0037m c0037m8 = new C0037m((InterfaceC0617c) obj3, (g3.e) this.f972l, 7);
                c0037m8.j = (InterfaceC0234g) obj;
                c0037m8.k = obj2;
                return c0037m8.v(Z5.y.f7506a);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                C0037m c0037m9 = new C0037m((InterfaceC0617c) obj3, (C1020s) this.f972l, 8);
                c0037m9.j = (InterfaceC0234g) obj;
                c0037m9.k = obj2;
                return c0037m9.v(Z5.y.f7506a);
            case 9:
                C0037m c0037m10 = new C0037m((InterfaceC0617c) obj3, (p4.B) this.f972l, 9);
                c0037m10.j = (InterfaceC0234g) obj;
                c0037m10.k = obj2;
                return c0037m10.v(Z5.y.f7506a);
            case 10:
                C0037m c0037m11 = new C0037m((InterfaceC0617c) obj3, (C1365k) this.f972l, 10);
                c0037m11.j = (InterfaceC0234g) obj;
                c0037m11.k = obj2;
                return c0037m11.v(Z5.y.f7506a);
            case 11:
                C0037m c0037m12 = new C0037m((InterfaceC0617c) obj3, (r4.n) this.f972l, 11);
                c0037m12.j = (InterfaceC0234g) obj;
                c0037m12.k = obj2;
                return c0037m12.v(Z5.y.f7506a);
            case 12:
                C0037m c0037m13 = new C0037m((s2.n) this.f972l, (InterfaceC0617c) obj3, 12);
                c0037m13.j = (C0953c) obj;
                c0037m13.k = (s2.k) obj2;
                return c0037m13.v(Z5.y.f7506a);
            case 13:
                C0037m c0037m14 = new C0037m((s2.n) this.f972l, (InterfaceC0617c) obj3, 13);
                c0037m14.j = (C0952b) obj;
                c0037m14.k = (s2.k) obj2;
                return c0037m14.v(Z5.y.f7506a);
            case 14:
                C0037m c0037m15 = new C0037m((v2.h) this.f972l, (InterfaceC0617c) obj3, 14);
                c0037m15.j = (C0999a) obj;
                c0037m15.k = (v2.i) obj2;
                return c0037m15.v(Z5.y.f7506a);
            default:
                C0037m c0037m16 = new C0037m((InterfaceC0617c) obj3, (v2.h) this.f972l, 15);
                c0037m16.j = (InterfaceC0234g) obj;
                c0037m16.k = obj2;
                return c0037m16.v(Z5.y.f7506a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x03a7, code lost:
    
        if (r14 == r8) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03e4, code lost:
    
        if (r14 == r8) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0439, code lost:
    
        if (L7.AbstractC0166y.h(r0, r13) == r8) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0424, code lost:
    
        if (r0.n(r1, r13) == r8) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x049a, code lost:
    
        if (L7.AbstractC0166y.h(r0, r13) == r8) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0485, code lost:
    
        if (r0.n(r1, r13) == r8) goto L261;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, n6.d] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g;
        InterfaceC0234g interfaceC0234g2;
        i0 i0Var;
        InterfaceC0233f interfaceC0233f;
        InterfaceC0233f interfaceC0233f2;
        S4.l lVar;
        W0.d dVar;
        InterfaceC0233f a3;
        A4.c cVar;
        int i4 = this.f970h;
        int i8 = 3;
        boolean z8 = false;
        z8 = false;
        int i9 = 2;
        Z5.y yVar = Z5.y.f7506a;
        ?? r62 = this.f972l;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        InterfaceC0617c interfaceC0617c = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 1;
        switch (i4) {
            case 0:
                InterfaceC0234g interfaceC0234g3 = (InterfaceC0234g) this.j;
                List list = (List) this.k;
                int i11 = this.f971i;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                Z5.a.d(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj);
                        i0 i0Var2 = ((s) r62).f986e;
                        this.j = null;
                        this.k = null;
                        this.f971i = 3;
                        i0Var2.n(a6.s.f7766d, this);
                        if (yVar != enumC0646a) {
                            return yVar;
                        }
                        return enumC0646a;
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    if (!list.isEmpty()) {
                        this.j = null;
                        this.k = null;
                        this.f971i = 1;
                        break;
                    } else {
                        return yVar;
                    }
                }
                int i12 = J7.a.f2503g;
                long l6 = J7.f.l(3, J7.c.SECONDS);
                this.j = null;
                this.k = null;
                this.f971i = 2;
                break;
            case 1:
                InterfaceC0234g interfaceC0234g4 = (InterfaceC0234g) this.j;
                C0030f c0030f = (C0030f) this.k;
                int i13 = this.f971i;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                Z5.a.d(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj);
                        i0 i0Var3 = ((P) r62).f933e;
                        this.j = null;
                        this.k = null;
                        this.f971i = 3;
                        i0Var3.n(null, this);
                        if (yVar != enumC0646a) {
                            return yVar;
                        }
                        return enumC0646a;
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    this.j = null;
                    this.k = null;
                    this.f971i = 1;
                    break;
                }
                int i14 = J7.a.f2503g;
                long l8 = J7.f.l(3, J7.c.SECONDS);
                this.j = null;
                this.k = null;
                this.f971i = 2;
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                int i15 = this.f971i;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            Z5.a.d(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0234g = (InterfaceC0234g) this.j;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    interfaceC0234g = (InterfaceC0234g) this.j;
                    Object obj2 = this.k;
                    this.j = interfaceC0234g;
                    this.f971i = 1;
                    obj = ((O7.G) r62).l(obj2, this);
                    break;
                }
                this.j = null;
                this.f971i = 2;
                if (interfaceC0234g.n(obj, this) != enumC0646a) {
                    return yVar;
                }
                return enumC0646a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                int i16 = this.f971i;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            Z5.a.d(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0234g2 = (InterfaceC0234g) this.j;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    interfaceC0234g2 = (InterfaceC0234g) this.j;
                    Object[] objArr = (Object[]) this.k;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.j = interfaceC0234g2;
                    this.f971i = 1;
                    obj = r62.j(obj3, obj4, this);
                    break;
                }
                this.j = null;
                this.f971i = 2;
                if (interfaceC0234g2.n(obj, this) != enumC0646a) {
                    return yVar;
                }
                return enumC0646a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                S4.k kVar = (S4.k) r62;
                int i17 = this.f971i;
                if (i17 != 0) {
                    if (i17 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g5 = (InterfaceC0234g) this.j;
                M4.f fVar = (M4.f) this.k;
                if (fVar == null) {
                    interfaceC0233f2 = new C0235h(null);
                } else {
                    int i18 = fVar.f3489a;
                    AbstractC0405a abstractC0405a = fVar.f3491c;
                    if (abstractC0405a.equals(M4.b.f3483f)) {
                        M4.d dVar2 = fVar.f3490b;
                        if (dVar2 != null) {
                            lVar = new S4.l(dVar2.f3487a, dVar2.f3488b);
                        } else {
                            lVar = null;
                        }
                        interfaceC0233f2 = new C0235h(new S4.m(i18, lVar, 8));
                    } else if (abstractC0405a instanceof M4.a) {
                        J2.b bVar = kVar.f5388b;
                        J2.a aVar = ((M4.a) abstractC0405a).f3482f;
                        bVar.getClass();
                        o6.j.e(aVar, "type");
                        J2.d dVar3 = (J2.d) bVar.f2386b.get(aVar);
                        if (dVar3 != null) {
                            i0Var = dVar3.f2394f;
                        } else {
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            interfaceC0233f = new R.g(i0Var, fVar, kVar, i10);
                        } else {
                            interfaceC0233f = new C0235h(new S4.m(i18, z9 ? 1 : 0, 14));
                        }
                        interfaceC0233f2 = interfaceC0233f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (V.l(interfaceC0234g5, interfaceC0233f2, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                int i19 = this.f971i;
                if (i19 != 0) {
                    if (i19 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g6 = (InterfaceC0234g) this.j;
                C4.e eVar = new C4.e(new U3.r(((U3.A) r62).f6086c, (D2.k) this.k, 0), 12);
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (V.l(interfaceC0234g6, eVar, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                C0604j c0604j = (C0604j) r62;
                int i20 = this.f971i;
                if (i20 != 0) {
                    if (i20 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g7 = (InterfaceC0234g) this.j;
                if (((Boolean) this.k).booleanValue()) {
                    dVar = c0604j.f10392e;
                } else {
                    dVar = c0604j.f10391d;
                }
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (V.l(interfaceC0234g7, dVar, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                int i21 = this.f971i;
                if (i21 != 0) {
                    if (i21 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g8 = (InterfaceC0234g) this.j;
                p2.e eVar2 = (p2.e) this.k;
                C1229a c1229a = ((g3.e) r62).f11148a;
                long j = eVar2.f13699a.f12187a;
                n2.j jVar = c1229a.f13440a.f12410a;
                C1621l c6 = AbstractC0863b.c(jVar.f12901a, false, new String[]{"dumb_action_table"}, new n2.h(j, jVar, i8));
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (!(interfaceC0234g8 instanceof k0)) {
                    Object x8 = c6.x(new C1018q(interfaceC0234g8, i9), this);
                    if (x8 != enumC0646a) {
                        x8 = yVar;
                    }
                    if (x8 != enumC0646a) {
                        x8 = yVar;
                    }
                    if (x8 == enumC0646a) {
                        return enumC0646a;
                    }
                    return yVar;
                }
                throw ((k0) interfaceC0234g8).f4156d;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                int i22 = this.f971i;
                if (i22 != 0) {
                    if (i22 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g9 = (InterfaceC0234g) this.j;
                C4.e eVar3 = new C4.e(new U3.r(((C1020s) r62).f12243c, (D2.k) this.k, 1), 12);
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (V.l(interfaceC0234g9, eVar3, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case 9:
                int i23 = this.f971i;
                if (i23 != 0) {
                    if (i23 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g10 = (InterfaceC0234g) this.j;
                C4.e eVar4 = new C4.e(new U3.r(((p4.B) r62).f13731c, (D2.k) this.k, 2), 12);
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (V.l(interfaceC0234g10, eVar4, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case 10:
                int i24 = this.f971i;
                if (i24 != 0) {
                    if (i24 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g11 = (InterfaceC0234g) this.j;
                Long l9 = (Long) this.k;
                if (l9 == null) {
                    a3 = new C0235h(null);
                } else {
                    a3 = ((C1365k) r62).f13962a.a(l9.longValue());
                }
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (V.l(interfaceC0234g11, a3, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case 11:
                H3.n nVar = ((r4.n) r62).f14405b;
                int i25 = this.f971i;
                if (i25 != 0) {
                    if (i25 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g12 = (InterfaceC0234g) this.j;
                if (o6.j.a((Boolean) this.k, Boolean.TRUE)) {
                    cVar = nVar.f1950e.f1994q;
                } else {
                    cVar = nVar.f1950e.f1993p;
                }
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (V.l(interfaceC0234g12, cVar, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case 12:
                C0953c c0953c = (C0953c) this.j;
                s2.k kVar2 = (s2.k) this.k;
                int i26 = this.f971i;
                if (i26 != 0) {
                    if (i26 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                b0 b0Var = (b0) ((s2.n) r62).f14491g;
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (b0Var.b(c0953c, kVar2, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case 13:
                C0952b c0952b = (C0952b) this.j;
                s2.k kVar3 = (s2.k) this.k;
                int i27 = this.f971i;
                if (i27 != 0) {
                    if (i27 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                b0 b0Var2 = (b0) ((s2.n) r62).f14491g;
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (b0Var2.b(c0952b, kVar3, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            case 14:
                C0999a c0999a = (C0999a) this.j;
                v2.i iVar = (v2.i) this.k;
                int i28 = this.f971i;
                if (i28 != 0) {
                    if (i28 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    if (c0999a == null) {
                        return Boolean.FALSE;
                    }
                    b2.r rVar = ((v2.h) r62).f15501a;
                    long j5 = c0999a.f12187a;
                    this.j = null;
                    this.k = iVar;
                    this.f971i = 1;
                    obj = rVar.f(j5, this);
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                C1001a c1001a = (C1001a) obj;
                if (c1001a == null) {
                    return Boolean.FALSE;
                }
                if (iVar == v2.i.f15512f && c1001a.f12194e) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            default:
                int i29 = this.f971i;
                if (i29 != 0) {
                    if (i29 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                InterfaceC0234g interfaceC0234g13 = (InterfaceC0234g) this.j;
                C0999a c0999a2 = (C0999a) this.k;
                b2.r rVar2 = ((v2.h) r62).f15501a;
                long j8 = c0999a2.f12187a;
                C1.f fVar2 = rVar2.f9111a.f9604e;
                H3.g gVar = new H3.g(V.u(fVar2, new c2.d(interfaceC0617c, j8, z8 ? 1 : 0)), i8);
                H3.g gVar2 = new H3.g(V.u(fVar2, new c2.d(z12 ? 1 : 0, j8, i9)), 4);
                C3.b bVar2 = new C3.b(i8, z11 ? 1 : 0, i10);
                this.j = null;
                this.k = null;
                this.f971i = 1;
                if (!(interfaceC0234g13 instanceof k0)) {
                    Object a4 = AbstractC0285b.a(interfaceC0234g13, this, new C0037m((Object) bVar2, (InterfaceC0617c) (z10 ? 1 : 0), i8), new InterfaceC0233f[]{gVar, gVar2});
                    if (a4 != enumC0646a) {
                        a4 = yVar;
                    }
                    if (a4 != enumC0646a) {
                        a4 = yVar;
                    }
                    if (a4 == enumC0646a) {
                        return enumC0646a;
                    }
                    return yVar;
                }
                throw ((k0) interfaceC0234g13).f4156d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037m(Object obj, InterfaceC0617c interfaceC0617c, int i4) {
        super(3, interfaceC0617c);
        this.f970h = i4;
        this.f972l = obj;
    }
}
