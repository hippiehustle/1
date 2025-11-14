package L3;

import D4.C0040p;
import M3.T;
import M3.X;
import M3.Y;
import O7.InterfaceC0234g;
import a.AbstractC0405a;
import android.graphics.Point;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e2.AbstractC0640c;
import e2.C0638a;
import e2.C0639b;
import e6.EnumC0646a;
import java.util.List;
import java.util.Objects;
import k2.C0952b;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class E implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f2789e;

    public /* synthetic */ E(InterfaceC0234g interfaceC0234g, int i4) {
        this.f2788d = i4;
        this.f2789e = interfaceC0234g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARN: Type inference failed for: r3v15, types: [M4.f] */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.Object] */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        D d2;
        int i4;
        F f8;
        int i8;
        G g8;
        int i9;
        H h8;
        int i10;
        boolean z8;
        J j;
        int i11;
        K k;
        int i12;
        boolean z9;
        N n3;
        int i13;
        O o7;
        int i14;
        P p8;
        int i15;
        Q q6;
        int i16;
        L4.c cVar;
        int i17;
        AbstractC0405a aVar;
        L4.d dVar;
        int i18;
        N4.a aVar2;
        L4.e eVar;
        int i19;
        boolean z10;
        M1.k kVar;
        int i20;
        M1.j jVar;
        M3.A a3;
        int i21;
        M3.B b4;
        int i22;
        M3.C c6;
        int i23;
        M3.E e9;
        int i24;
        M3.F f9;
        int i25;
        M3.G g9;
        int i26;
        M3.L l6;
        int i27;
        M3.M m6;
        int i28;
        M3.N n8;
        int i29;
        M3.P p9;
        int i30;
        boolean z11;
        M3.S s8;
        int i31;
        String str;
        T t8;
        int i32;
        long j5;
        boolean z12;
        X x8;
        int i33;
        Y y4;
        int i34;
        N4.b bVar;
        int i35;
        O3.G g10;
        int i36;
        switch (this.f2788d) {
            case 0:
                if (interfaceC0617c instanceof D) {
                    d2 = (D) interfaceC0617c;
                    int i37 = d2.f2786h;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        d2.f2786h = i37 - Integer.MIN_VALUE;
                        Object obj2 = d2.f2785g;
                        i4 = d2.f2786h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            String str2 = ((C0638a) obj).f10597a;
                            d2.f2786h = 1;
                            Object n9 = this.f2789e.n(str2, d2);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n9 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                d2 = new D(this, interfaceC0617c);
                Object obj22 = d2.f2785g;
                i4 = d2.f2786h;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            case 1:
                if (interfaceC0617c instanceof F) {
                    f8 = (F) interfaceC0617c;
                    int i38 = f8.f2791h;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        f8.f2791h = i38 - Integer.MIN_VALUE;
                        Object obj3 = f8.f2790g;
                        i8 = f8.f2791h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            Boolean valueOf = Boolean.valueOf(((I3.a) obj).f2088c);
                            f8.f2791h = 1;
                            Object n10 = this.f2789e.n(valueOf, f8);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n10 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                f8 = new F(this, interfaceC0617c);
                Object obj32 = f8.f2790g;
                i8 = f8.f2791h;
                if (i8 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0617c instanceof G) {
                    g8 = (G) interfaceC0617c;
                    int i39 = g8.f2794h;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        g8.f2794h = i39 - Integer.MIN_VALUE;
                        Object obj4 = g8.f2793g;
                        i9 = g8.f2794h;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                Z5.a.d(obj4);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj4);
                            String str3 = ((f2.c) obj).f10682c;
                            g8.f2794h = 1;
                            Object n11 = this.f2789e.n(str3, g8);
                            EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                            if (n11 == enumC0646a3) {
                                return enumC0646a3;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                g8 = new G(this, interfaceC0617c);
                Object obj42 = g8.f2793g;
                i9 = g8.f2794h;
                if (i9 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (interfaceC0617c instanceof H) {
                    h8 = (H) interfaceC0617c;
                    int i40 = h8.f2797h;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        h8.f2797h = i40 - Integer.MIN_VALUE;
                        Object obj5 = h8.f2796g;
                        i10 = h8.f2797h;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                Z5.a.d(obj5);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj5);
                            String str4 = ((f2.c) obj).f10682c;
                            if (str4 != null && str4.length() != 0) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            Boolean valueOf2 = Boolean.valueOf(z8);
                            h8.f2797h = 1;
                            Object n12 = this.f2789e.n(valueOf2, h8);
                            EnumC0646a enumC0646a4 = EnumC0646a.f10656d;
                            if (n12 == enumC0646a4) {
                                return enumC0646a4;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                h8 = new H(this, interfaceC0617c);
                Object obj52 = h8.f2796g;
                i10 = h8.f2797h;
                if (i10 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (interfaceC0617c instanceof J) {
                    j = (J) interfaceC0617c;
                    int i41 = j.f2802h;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        j.f2802h = i41 - Integer.MIN_VALUE;
                        Object obj6 = j.f2801g;
                        i11 = j.f2802h;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                Z5.a.d(obj6);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj6);
                            String str5 = ((f2.c) obj).f10684e;
                            j.f2802h = 1;
                            Object n13 = this.f2789e.n(str5, j);
                            EnumC0646a enumC0646a5 = EnumC0646a.f10656d;
                            if (n13 == enumC0646a5) {
                                return enumC0646a5;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                j = new J(this, interfaceC0617c);
                Object obj62 = j.f2801g;
                i11 = j.f2802h;
                if (i11 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0617c instanceof K) {
                    k = (K) interfaceC0617c;
                    int i42 = k.f2805h;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        k.f2805h = i42 - Integer.MIN_VALUE;
                        Object obj7 = k.f2804g;
                        i12 = k.f2805h;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                Z5.a.d(obj7);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj7);
                            if (((f2.c) obj).f10684e.length() == 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            Boolean valueOf3 = Boolean.valueOf(z9);
                            k.f2805h = 1;
                            Object n14 = this.f2789e.n(valueOf3, k);
                            EnumC0646a enumC0646a6 = EnumC0646a.f10656d;
                            if (n14 == enumC0646a6) {
                                return enumC0646a6;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                k = new K(this, interfaceC0617c);
                Object obj72 = k.f2804g;
                i12 = k.f2805h;
                if (i12 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC0617c instanceof N) {
                    n3 = (N) interfaceC0617c;
                    int i43 = n3.f2814h;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        n3.f2814h = i43 - Integer.MIN_VALUE;
                        Object obj8 = n3.f2813g;
                        i13 = n3.f2814h;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                Z5.a.d(obj8);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj8);
                            Boolean valueOf4 = Boolean.valueOf(((f2.c) obj).f10686g instanceof C0639b);
                            n3.f2814h = 1;
                            Object n15 = this.f2789e.n(valueOf4, n3);
                            EnumC0646a enumC0646a7 = EnumC0646a.f10656d;
                            if (n15 == enumC0646a7) {
                                return enumC0646a7;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                n3 = new N(this, interfaceC0617c);
                Object obj82 = n3.f2813g;
                i13 = n3.f2814h;
                if (i13 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC0617c instanceof O) {
                    o7 = (O) interfaceC0617c;
                    int i44 = o7.f2817h;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        o7.f2817h = i44 - Integer.MIN_VALUE;
                        Object obj9 = o7.f2816g;
                        i14 = o7.f2817h;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                Z5.a.d(obj9);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj9);
                            AbstractC0640c abstractC0640c = ((f2.c) obj).f10686g;
                            o7.f2817h = 1;
                            Object n16 = this.f2789e.n(abstractC0640c, o7);
                            EnumC0646a enumC0646a8 = EnumC0646a.f10656d;
                            if (n16 == enumC0646a8) {
                                return enumC0646a8;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                o7 = new O(this, interfaceC0617c);
                Object obj92 = o7.f2816g;
                i14 = o7.f2817h;
                if (i14 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (interfaceC0617c instanceof P) {
                    p8 = (P) interfaceC0617c;
                    int i45 = p8.f2820h;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        p8.f2820h = i45 - Integer.MIN_VALUE;
                        Object obj10 = p8.f2819g;
                        i15 = p8.f2820h;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                Z5.a.d(obj10);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj10);
                            String valueOf5 = String.valueOf(((C0639b) obj).f10598a);
                            p8.f2820h = 1;
                            Object n17 = this.f2789e.n(valueOf5, p8);
                            EnumC0646a enumC0646a9 = EnumC0646a.f10656d;
                            if (n17 == enumC0646a9) {
                                return enumC0646a9;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                p8 = new P(this, interfaceC0617c);
                Object obj102 = p8.f2819g;
                i15 = p8.f2820h;
                if (i15 == 0) {
                }
                return Z5.y.f7506a;
            case 9:
                if (interfaceC0617c instanceof Q) {
                    q6 = (Q) interfaceC0617c;
                    int i46 = q6.f2823h;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        q6.f2823h = i46 - Integer.MIN_VALUE;
                        Object obj11 = q6.f2822g;
                        i16 = q6.f2823h;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                Z5.a.d(obj11);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj11);
                            Object obj12 = ((I3.a) obj).f2086a;
                            if (obj12 != null) {
                                q6.f2823h = 1;
                                Object n18 = this.f2789e.n(obj12, q6);
                                EnumC0646a enumC0646a10 = EnumC0646a.f10656d;
                                if (n18 == enumC0646a10) {
                                    return enumC0646a10;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                q6 = new Q(this, interfaceC0617c);
                Object obj112 = q6.f2822g;
                i16 = q6.f2823h;
                if (i16 == 0) {
                }
                return Z5.y.f7506a;
            case 10:
                if (interfaceC0617c instanceof L4.c) {
                    cVar = (L4.c) interfaceC0617c;
                    int i47 = cVar.f2902h;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        cVar.f2902h = i47 - Integer.MIN_VALUE;
                        Object obj13 = cVar.f2901g;
                        i17 = cVar.f2902h;
                        if (i17 == 0) {
                            if (i17 == 1) {
                                Z5.a.d(obj13);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj13);
                            F4.v vVar = (F4.v) obj;
                            Objects.toString(vVar);
                            M4.d dVar2 = null;
                            if (vVar != null) {
                                if (vVar instanceof F4.t) {
                                    dVar2 = new Object();
                                } else if (vVar instanceof F4.u) {
                                    F4.u uVar = (F4.u) vVar;
                                    int i48 = uVar.f1428a;
                                    F4.w wVar = uVar.f1429b;
                                    if (wVar != null) {
                                        dVar2 = new M4.d(wVar.f1432a, wVar.f1433b);
                                    }
                                    E2.d dVar3 = uVar.f1431d;
                                    if (o6.j.a(dVar3, F4.b.f1379e)) {
                                        aVar = M4.b.f3483f;
                                    } else if (dVar3 instanceof F4.a) {
                                        aVar = new M4.a(((F4.a) dVar3).f1378e);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2 = new M4.f(i48, dVar2, aVar);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            cVar.f2902h = 1;
                            Object n19 = this.f2789e.n(dVar2, cVar);
                            EnumC0646a enumC0646a11 = EnumC0646a.f10656d;
                            if (n19 == enumC0646a11) {
                                return enumC0646a11;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                cVar = new L4.c(this, interfaceC0617c);
                Object obj132 = cVar.f2901g;
                i17 = cVar.f2902h;
                if (i17 == 0) {
                }
                return Z5.y.f7506a;
            case 11:
                if (interfaceC0617c instanceof L4.d) {
                    dVar = (L4.d) interfaceC0617c;
                    int i49 = dVar.f2905h;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        dVar.f2905h = i49 - Integer.MIN_VALUE;
                        Object obj14 = dVar.f2904g;
                        i18 = dVar.f2905h;
                        if (i18 == 0) {
                            if (i18 == 1) {
                                Z5.a.d(obj14);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj14);
                            F4.h hVar = (F4.h) obj;
                            if (hVar != null) {
                                G4.a aVar3 = hVar.f1385b;
                                int i50 = aVar3.f1740a;
                                H4.c cVar2 = aVar3.f1741b;
                                aVar2 = new N4.a(i50, cVar2.f2007a, new C0040p(cVar2.f2012f, 13), cVar2.f2014h);
                            } else {
                                aVar2 = null;
                            }
                            dVar.f2905h = 1;
                            Object n20 = this.f2789e.n(aVar2, dVar);
                            EnumC0646a enumC0646a12 = EnumC0646a.f10656d;
                            if (n20 == enumC0646a12) {
                                return enumC0646a12;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                dVar = new L4.d(this, interfaceC0617c);
                Object obj142 = dVar.f2904g;
                i18 = dVar.f2905h;
                if (i18 == 0) {
                }
                return Z5.y.f7506a;
            case 12:
                if (interfaceC0617c instanceof L4.e) {
                    eVar = (L4.e) interfaceC0617c;
                    int i51 = eVar.f2908h;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        eVar.f2908h = i51 - Integer.MIN_VALUE;
                        Object obj15 = eVar.f2907g;
                        i19 = eVar.f2908h;
                        if (i19 == 0) {
                            if (i19 == 1) {
                                Z5.a.d(obj15);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj15);
                            N4.c cVar3 = (N4.c) obj;
                            if (cVar3 != null) {
                                z10 = o6.j.a(cVar3.f3768b, Boolean.TRUE);
                            } else {
                                z10 = false;
                            }
                            Boolean valueOf6 = Boolean.valueOf(z10);
                            eVar.f2908h = 1;
                            Object n21 = this.f2789e.n(valueOf6, eVar);
                            EnumC0646a enumC0646a13 = EnumC0646a.f10656d;
                            if (n21 == enumC0646a13) {
                                return enumC0646a13;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                eVar = new L4.e(this, interfaceC0617c);
                Object obj152 = eVar.f2907g;
                i19 = eVar.f2908h;
                if (i19 == 0) {
                }
                return Z5.y.f7506a;
            case 13:
                if (interfaceC0617c instanceof M1.k) {
                    kVar = (M1.k) interfaceC0617c;
                    int i52 = kVar.f3327h;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        kVar.f3327h = i52 - Integer.MIN_VALUE;
                        Object obj16 = kVar.f3326g;
                        i20 = kVar.f3327h;
                        if (i20 == 0) {
                            if (i20 == 1) {
                                Z5.a.d(obj16);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj16);
                            L1.b bVar2 = (L1.b) obj;
                            if (bVar2 != null) {
                                if (bVar2 instanceof L1.d) {
                                    jVar = new M1.j(bVar2, R.string.dialog_title_permission_overlay, R.string.message_permission_desc_overlay);
                                } else if (bVar2 instanceof L1.e) {
                                    jVar = new M1.j(bVar2, R.string.dialog_title_permission_notification, R.string.message_permission_desc_notification);
                                } else if (bVar2 instanceof L1.c) {
                                    jVar = new M1.j(bVar2, R.string.dialog_title_permission_accessibility, R.string.message_permission_desc_accessibility);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                jVar = null;
                            }
                            kVar.f3327h = 1;
                            Object n22 = this.f2789e.n(jVar, kVar);
                            EnumC0646a enumC0646a14 = EnumC0646a.f10656d;
                            if (n22 == enumC0646a14) {
                                return enumC0646a14;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                kVar = new M1.k(this, interfaceC0617c);
                Object obj162 = kVar.f3326g;
                i20 = kVar.f3327h;
                if (i20 == 0) {
                }
                return Z5.y.f7506a;
            case 14:
                if (interfaceC0617c instanceof M3.A) {
                    a3 = (M3.A) interfaceC0617c;
                    int i53 = a3.f3335h;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        a3.f3335h = i53 - Integer.MIN_VALUE;
                        Object obj17 = a3.f3334g;
                        i21 = a3.f3335h;
                        if (i21 == 0) {
                            if (i21 == 1) {
                                Z5.a.d(obj17);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj17);
                            if (obj instanceof C0952b) {
                                a3.f3335h = 1;
                                Object n23 = this.f2789e.n(obj, a3);
                                EnumC0646a enumC0646a15 = EnumC0646a.f10656d;
                                if (n23 == enumC0646a15) {
                                    return enumC0646a15;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                a3 = new M3.A(this, interfaceC0617c);
                Object obj172 = a3.f3334g;
                i21 = a3.f3335h;
                if (i21 == 0) {
                }
                return Z5.y.f7506a;
            case 15:
                if (interfaceC0617c instanceof M3.B) {
                    b4 = (M3.B) interfaceC0617c;
                    int i54 = b4.f3338h;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        b4.f3338h = i54 - Integer.MIN_VALUE;
                        Object obj18 = b4.f3337g;
                        i22 = b4.f3338h;
                        if (i22 == 0) {
                            if (i22 == 1) {
                                Z5.a.d(obj18);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj18);
                            if (obj instanceof f2.e) {
                                b4.f3338h = 1;
                                Object n24 = this.f2789e.n(obj, b4);
                                EnumC0646a enumC0646a16 = EnumC0646a.f10656d;
                                if (n24 == enumC0646a16) {
                                    return enumC0646a16;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                b4 = new M3.B(this, interfaceC0617c);
                Object obj182 = b4.f3337g;
                i22 = b4.f3338h;
                if (i22 == 0) {
                }
                return Z5.y.f7506a;
            case 16:
                if (interfaceC0617c instanceof M3.C) {
                    c6 = (M3.C) interfaceC0617c;
                    int i55 = c6.f3341h;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        c6.f3341h = i55 - Integer.MIN_VALUE;
                        Object obj19 = c6.f3340g;
                        i23 = c6.f3341h;
                        if (i23 == 0) {
                            if (i23 == 1) {
                                Z5.a.d(obj19);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj19);
                            Point point = ((f2.e) obj).f10698i;
                            if (point == null) {
                                point = new Point(0, 0);
                            }
                            c6.f3341h = 1;
                            Object n25 = this.f2789e.n(point, c6);
                            EnumC0646a enumC0646a17 = EnumC0646a.f10656d;
                            if (n25 == enumC0646a17) {
                                return enumC0646a17;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c6 = new M3.C(this, interfaceC0617c);
                Object obj192 = c6.f3340g;
                i23 = c6.f3341h;
                if (i23 == 0) {
                }
                return Z5.y.f7506a;
            case 17:
                if (interfaceC0617c instanceof M3.E) {
                    e9 = (M3.E) interfaceC0617c;
                    int i56 = e9.f3347h;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        e9.f3347h = i56 - Integer.MIN_VALUE;
                        Object obj20 = e9.f3346g;
                        i24 = e9.f3347h;
                        if (i24 == 0) {
                            if (i24 == 1) {
                                Z5.a.d(obj20);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj20);
                            Object obj21 = ((I3.a) obj).f2086a;
                            if (obj21 != null) {
                                e9.f3347h = 1;
                                Object n26 = this.f2789e.n(obj21, e9);
                                EnumC0646a enumC0646a18 = EnumC0646a.f10656d;
                                if (n26 == enumC0646a18) {
                                    return enumC0646a18;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                e9 = new M3.E(this, interfaceC0617c);
                Object obj202 = e9.f3346g;
                i24 = e9.f3347h;
                if (i24 == 0) {
                }
                return Z5.y.f7506a;
            case 18:
                if (interfaceC0617c instanceof M3.F) {
                    f9 = (M3.F) interfaceC0617c;
                    int i57 = f9.f3350h;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        f9.f3350h = i57 - Integer.MIN_VALUE;
                        Object obj23 = f9.f3349g;
                        i25 = f9.f3350h;
                        if (i25 == 0) {
                            if (i25 == 1) {
                                Z5.a.d(obj23);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj23);
                            List list = ((I3.b) obj).f2089a;
                            if (list != null) {
                                f9.f3350h = 1;
                                Object n27 = this.f2789e.n(list, f9);
                                EnumC0646a enumC0646a19 = EnumC0646a.f10656d;
                                if (n27 == enumC0646a19) {
                                    return enumC0646a19;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                f9 = new M3.F(this, interfaceC0617c);
                Object obj232 = f9.f3349g;
                i25 = f9.f3350h;
                if (i25 == 0) {
                }
                return Z5.y.f7506a;
            case 19:
                if (interfaceC0617c instanceof M3.G) {
                    g9 = (M3.G) interfaceC0617c;
                    int i58 = g9.f3353h;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        g9.f3353h = i58 - Integer.MIN_VALUE;
                        Object obj24 = g9.f3352g;
                        i26 = g9.f3353h;
                        if (i26 == 0) {
                            if (i26 == 1) {
                                Z5.a.d(obj24);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj24);
                            Object obj25 = ((I3.a) obj).f2086a;
                            if (obj25 != null) {
                                g9.f3353h = 1;
                                Object n28 = this.f2789e.n(obj25, g9);
                                EnumC0646a enumC0646a20 = EnumC0646a.f10656d;
                                if (n28 == enumC0646a20) {
                                    return enumC0646a20;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                g9 = new M3.G(this, interfaceC0617c);
                Object obj242 = g9.f3352g;
                i26 = g9.f3353h;
                if (i26 == 0) {
                }
                return Z5.y.f7506a;
            case 20:
                if (interfaceC0617c instanceof M3.L) {
                    l6 = (M3.L) interfaceC0617c;
                    int i59 = l6.f3379h;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        l6.f3379h = i59 - Integer.MIN_VALUE;
                        Object obj26 = l6.f3378g;
                        i27 = l6.f3379h;
                        if (i27 == 0) {
                            if (i27 == 1) {
                                Z5.a.d(obj26);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj26);
                            if (obj instanceof f2.e) {
                                l6.f3379h = 1;
                                Object n29 = this.f2789e.n(obj, l6);
                                EnumC0646a enumC0646a21 = EnumC0646a.f10656d;
                                if (n29 == enumC0646a21) {
                                    return enumC0646a21;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                l6 = new M3.L(this, interfaceC0617c);
                Object obj262 = l6.f3378g;
                i27 = l6.f3379h;
                if (i27 == 0) {
                }
                return Z5.y.f7506a;
            case 21:
                if (interfaceC0617c instanceof M3.M) {
                    m6 = (M3.M) interfaceC0617c;
                    int i60 = m6.f3382h;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        m6.f3382h = i60 - Integer.MIN_VALUE;
                        Object obj27 = m6.f3381g;
                        i28 = m6.f3382h;
                        if (i28 == 0) {
                            if (i28 == 1) {
                                Z5.a.d(obj27);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj27);
                            Boolean valueOf7 = Boolean.valueOf(((I3.a) obj).f2087b);
                            m6.f3382h = 1;
                            Object n30 = this.f2789e.n(valueOf7, m6);
                            EnumC0646a enumC0646a22 = EnumC0646a.f10656d;
                            if (n30 == enumC0646a22) {
                                return enumC0646a22;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                m6 = new M3.M(this, interfaceC0617c);
                Object obj272 = m6.f3381g;
                i28 = m6.f3382h;
                if (i28 == 0) {
                }
                return Z5.y.f7506a;
            case 22:
                if (interfaceC0617c instanceof M3.N) {
                    n8 = (M3.N) interfaceC0617c;
                    int i61 = n8.f3385h;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        n8.f3385h = i61 - Integer.MIN_VALUE;
                        Object obj28 = n8.f3384g;
                        i29 = n8.f3385h;
                        if (i29 == 0) {
                            if (i29 == 1) {
                                Z5.a.d(obj28);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj28);
                            String str6 = ((f2.e) obj).f10692c;
                            n8.f3385h = 1;
                            Object n31 = this.f2789e.n(str6, n8);
                            EnumC0646a enumC0646a23 = EnumC0646a.f10656d;
                            if (n31 == enumC0646a23) {
                                return enumC0646a23;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                n8 = new M3.N(this, interfaceC0617c);
                Object obj282 = n8.f3384g;
                i29 = n8.f3385h;
                if (i29 == 0) {
                }
                return Z5.y.f7506a;
            case 23:
                if (interfaceC0617c instanceof M3.P) {
                    p9 = (M3.P) interfaceC0617c;
                    int i62 = p9.f3390h;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        p9.f3390h = i62 - Integer.MIN_VALUE;
                        Object obj29 = p9.f3389g;
                        i30 = p9.f3390h;
                        if (i30 == 0) {
                            if (i30 == 1) {
                                Z5.a.d(obj29);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj29);
                            String str7 = ((f2.e) obj).f10692c;
                            if (str7 != null && str7.length() != 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            Boolean valueOf8 = Boolean.valueOf(z11);
                            p9.f3390h = 1;
                            Object n32 = this.f2789e.n(valueOf8, p9);
                            EnumC0646a enumC0646a24 = EnumC0646a.f10656d;
                            if (n32 == enumC0646a24) {
                                return enumC0646a24;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                p9 = new M3.P(this, interfaceC0617c);
                Object obj292 = p9.f3389g;
                i30 = p9.f3390h;
                if (i30 == 0) {
                }
                return Z5.y.f7506a;
            case 24:
                if (interfaceC0617c instanceof M3.S) {
                    s8 = (M3.S) interfaceC0617c;
                    int i63 = s8.f3395h;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        s8.f3395h = i63 - Integer.MIN_VALUE;
                        Object obj30 = s8.f3394g;
                        i31 = s8.f3395h;
                        if (i31 == 0) {
                            if (i31 == 1) {
                                Z5.a.d(obj30);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj30);
                            Long l8 = ((f2.e) obj).f10694e;
                            if (l8 != null) {
                                str = l8.toString();
                            } else {
                                str = null;
                            }
                            s8.f3395h = 1;
                            Object n33 = this.f2789e.n(str, s8);
                            EnumC0646a enumC0646a25 = EnumC0646a.f10656d;
                            if (n33 == enumC0646a25) {
                                return enumC0646a25;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                s8 = new M3.S(this, interfaceC0617c);
                Object obj302 = s8.f3394g;
                i31 = s8.f3395h;
                if (i31 == 0) {
                }
                return Z5.y.f7506a;
            case 25:
                if (interfaceC0617c instanceof T) {
                    t8 = (T) interfaceC0617c;
                    int i64 = t8.f3398h;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        t8.f3398h = i64 - Integer.MIN_VALUE;
                        Object obj31 = t8.f3397g;
                        i32 = t8.f3398h;
                        if (i32 == 0) {
                            if (i32 == 1) {
                                Z5.a.d(obj31);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj31);
                            Long l9 = ((f2.e) obj).f10694e;
                            if (l9 != null) {
                                j5 = l9.longValue();
                            } else {
                                j5 = -1;
                            }
                            if (j5 <= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            Boolean valueOf9 = Boolean.valueOf(z12);
                            t8.f3398h = 1;
                            Object n34 = this.f2789e.n(valueOf9, t8);
                            EnumC0646a enumC0646a26 = EnumC0646a.f10656d;
                            if (n34 == enumC0646a26) {
                                return enumC0646a26;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                t8 = new T(this, interfaceC0617c);
                Object obj312 = t8.f3397g;
                i32 = t8.f3398h;
                if (i32 == 0) {
                }
                return Z5.y.f7506a;
            case 26:
                if (interfaceC0617c instanceof X) {
                    x8 = (X) interfaceC0617c;
                    int i65 = x8.f3410h;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        x8.f3410h = i65 - Integer.MIN_VALUE;
                        Object obj33 = x8.f3409g;
                        i33 = x8.f3410h;
                        if (i33 == 0) {
                            if (i33 == 1) {
                                Z5.a.d(obj33);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj33);
                            Boolean valueOf10 = Boolean.valueOf(((I3.a) obj).f2088c);
                            x8.f3410h = 1;
                            Object n35 = this.f2789e.n(valueOf10, x8);
                            EnumC0646a enumC0646a27 = EnumC0646a.f10656d;
                            if (n35 == enumC0646a27) {
                                return enumC0646a27;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                x8 = new X(this, interfaceC0617c);
                Object obj332 = x8.f3409g;
                i33 = x8.f3410h;
                if (i33 == 0) {
                }
                return Z5.y.f7506a;
            case 27:
                if (interfaceC0617c instanceof Y) {
                    y4 = (Y) interfaceC0617c;
                    int i66 = y4.f3413h;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        y4.f3413h = i66 - Integer.MIN_VALUE;
                        Object obj34 = y4.f3412g;
                        i34 = y4.f3413h;
                        if (i34 == 0) {
                            if (i34 == 1) {
                                Z5.a.d(obj34);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj34);
                            Object obj35 = ((I3.a) obj).f2086a;
                            if (obj35 != null) {
                                y4.f3413h = 1;
                                Object n36 = this.f2789e.n(obj35, y4);
                                EnumC0646a enumC0646a28 = EnumC0646a.f10656d;
                                if (n36 == enumC0646a28) {
                                    return enumC0646a28;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                y4 = new Y(this, interfaceC0617c);
                Object obj342 = y4.f3412g;
                i34 = y4.f3413h;
                if (i34 == 0) {
                }
                return Z5.y.f7506a;
            case 28:
                if (interfaceC0617c instanceof N4.b) {
                    bVar = (N4.b) interfaceC0617c;
                    int i67 = bVar.f3765h;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        bVar.f3765h = i67 - Integer.MIN_VALUE;
                        Object obj36 = bVar.f3764g;
                        i35 = bVar.f3765h;
                        if (i35 == 0) {
                            if (i35 == 1) {
                                Z5.a.d(obj36);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj36);
                            G4.b bVar3 = (G4.b) obj;
                            N4.c cVar4 = new N4.c(bVar3.f1742a, bVar3.f1743b, bVar3.f1744c, bVar3.f1745d);
                            bVar.f3765h = 1;
                            Object n37 = this.f2789e.n(cVar4, bVar);
                            EnumC0646a enumC0646a29 = EnumC0646a.f10656d;
                            if (n37 == enumC0646a29) {
                                return enumC0646a29;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                bVar = new N4.b(this, interfaceC0617c);
                Object obj362 = bVar.f3764g;
                i35 = bVar.f3765h;
                if (i35 == 0) {
                }
                return Z5.y.f7506a;
            default:
                if (interfaceC0617c instanceof O3.G) {
                    g10 = (O3.G) interfaceC0617c;
                    int i68 = g10.f3871h;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        g10.f3871h = i68 - Integer.MIN_VALUE;
                        Object obj37 = g10.f3870g;
                        i36 = g10.f3871h;
                        if (i36 == 0) {
                            if (i36 == 1) {
                                Z5.a.d(obj37);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj37);
                            if (o6.j.a(((f2.f) obj).f10703e, Boolean.FALSE)) {
                                g10.f3871h = 1;
                                Object n38 = this.f2789e.n(obj, g10);
                                EnumC0646a enumC0646a30 = EnumC0646a.f10656d;
                                if (n38 == enumC0646a30) {
                                    return enumC0646a30;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                g10 = new O3.G(this, interfaceC0617c);
                Object obj372 = g10.f3870g;
                i36 = g10.f3871h;
                if (i36 == 0) {
                }
                return Z5.y.f7506a;
        }
    }
}
