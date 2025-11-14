package b2;

import O7.InterfaceC0234g;
import S1.C0297h;
import S1.F;
import S1.w;
import T1.C0310i;
import Z5.y;
import a6.AbstractC0438m;
import android.graphics.Rect;
import com.buzbuz.smartautoclicker.core.database.ScenarioDatabase;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import h6.AbstractC0837b;
import j2.C0902b;
import j3.C0906A;
import j3.C0908C;
import j3.C0909D;
import j3.C0910E;
import j3.C0911F;
import j3.C0912G;
import j3.C0913H;
import j3.C0935u;
import j3.C0936v;
import j3.C0940z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k3.C0959f;
import k3.C0962i;
import k3.C0965l;
import k4.C0983o;
import k4.C0984p;
import k4.L;
import k4.M;
import k4.O;
import k4.Q;
import k4.U;
import k4.V;
import k4.W;
import k4.Z;
import l3.C1015n;
import l3.C1016o;
import p2.C1304a;
import z3.EnumC1855a;

/* loaded from: classes.dex */
public final class p implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f9107e;

    public /* synthetic */ p(InterfaceC0234g interfaceC0234g, int i4) {
        this.f9106d = i4;
        this.f9107e = interfaceC0234g;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0156  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        o oVar;
        int i4;
        q qVar;
        int i8;
        c2.f fVar;
        int i9;
        c2.g gVar;
        int i10;
        c2.h hVar;
        int i11;
        c2.i iVar;
        int i12;
        d5.q qVar2;
        int i13;
        boolean z8;
        g3.c cVar;
        int i14;
        boolean z9;
        C0935u c0935u;
        int i15;
        boolean z10;
        C0936v c0936v;
        int i16;
        C0940z c0940z;
        int i17;
        C0906A c0906a;
        int i18;
        boolean z11;
        C0908C c0908c;
        int i19;
        C0909D c0909d;
        int i20;
        boolean z12;
        C0910E c0910e;
        int i21;
        C0911F c0911f;
        int i22;
        boolean z13;
        C0912G c0912g;
        int i23;
        C0913H c0913h;
        int i24;
        C0962i c0962i;
        int i25;
        int i26;
        C0983o c0983o;
        int i27;
        C0984p c0984p;
        int i28;
        Z z14;
        L l6;
        int i29;
        M m6;
        int i30;
        O o7;
        int i31;
        boolean z15;
        Q q6;
        int i32;
        U u8;
        int i33;
        V v8;
        int i34;
        W w8;
        int i35;
        C1015n c1015n;
        int i36;
        boolean z16;
        C1016o c1016o;
        int i37;
        switch (this.f9106d) {
            case 0:
                if (interfaceC0617c instanceof o) {
                    oVar = (o) interfaceC0617c;
                    int i38 = oVar.f9104h;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        oVar.f9104h = i38 - Integer.MIN_VALUE;
                        Object obj2 = oVar.f9103g;
                        i4 = oVar.f9104h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(AbstractC0837b.r((T1.r) it.next(), false));
                            }
                            oVar.f9104h = 1;
                            Object n3 = this.f9107e.n(arrayList, oVar);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n3 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return y.f7506a;
                    }
                }
                oVar = new o(this, interfaceC0617c);
                Object obj22 = oVar.f9103g;
                i4 = oVar.f9104h;
                if (i4 == 0) {
                }
                return y.f7506a;
            case 1:
                if (interfaceC0617c instanceof q) {
                    qVar = (q) interfaceC0617c;
                    int i39 = qVar.f9109h;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qVar.f9109h = i39 - Integer.MIN_VALUE;
                        Object obj3 = qVar.f9108g;
                        i8 = qVar.f9109h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            List list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(h2.a.B((C0310i) it2.next(), false));
                            }
                            qVar.f9109h = 1;
                            Object n8 = this.f9107e.n(arrayList2, qVar);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n8 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return y.f7506a;
                    }
                }
                qVar = new q(this, interfaceC0617c);
                Object obj32 = qVar.f9108g;
                i8 = qVar.f9109h;
                if (i8 == 0) {
                }
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0617c instanceof c2.f) {
                    fVar = (c2.f) interfaceC0617c;
                    int i40 = fVar.f9529h;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        fVar.f9529h = i40 - Integer.MIN_VALUE;
                        Object obj4 = fVar.f9528g;
                        i9 = fVar.f9529h;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                Z5.a.d(obj4);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj4);
                            F r8 = ((ScenarioDatabase) obj).r();
                            fVar.f9529h = 1;
                            Object n9 = this.f9107e.n(r8, fVar);
                            EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                            if (n9 == enumC0646a3) {
                                return enumC0646a3;
                            }
                        }
                        return y.f7506a;
                    }
                }
                fVar = new c2.f(this, interfaceC0617c);
                Object obj42 = fVar.f9528g;
                i9 = fVar.f9529h;
                if (i9 == 0) {
                }
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (interfaceC0617c instanceof c2.g) {
                    gVar = (c2.g) interfaceC0617c;
                    int i41 = gVar.f9532h;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        gVar.f9532h = i41 - Integer.MIN_VALUE;
                        Object obj5 = gVar.f9531g;
                        i10 = gVar.f9532h;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                Z5.a.d(obj5);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj5);
                            w q8 = ((ScenarioDatabase) obj).q();
                            gVar.f9532h = 1;
                            Object n10 = this.f9107e.n(q8, gVar);
                            EnumC0646a enumC0646a4 = EnumC0646a.f10656d;
                            if (n10 == enumC0646a4) {
                                return enumC0646a4;
                            }
                        }
                        return y.f7506a;
                    }
                }
                gVar = new c2.g(this, interfaceC0617c);
                Object obj52 = gVar.f9531g;
                i10 = gVar.f9532h;
                if (i10 == 0) {
                }
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (interfaceC0617c instanceof c2.h) {
                    hVar = (c2.h) interfaceC0617c;
                    int i42 = hVar.f9535h;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        hVar.f9535h = i42 - Integer.MIN_VALUE;
                        Object obj6 = hVar.f9534g;
                        i11 = hVar.f9535h;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                Z5.a.d(obj6);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj6);
                            S1.p p8 = ((ScenarioDatabase) obj).p();
                            hVar.f9535h = 1;
                            Object n11 = this.f9107e.n(p8, hVar);
                            EnumC0646a enumC0646a5 = EnumC0646a.f10656d;
                            if (n11 == enumC0646a5) {
                                return enumC0646a5;
                            }
                        }
                        return y.f7506a;
                    }
                }
                hVar = new c2.h(this, interfaceC0617c);
                Object obj62 = hVar.f9534g;
                i11 = hVar.f9535h;
                if (i11 == 0) {
                }
                return y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0617c instanceof c2.i) {
                    iVar = (c2.i) interfaceC0617c;
                    int i43 = iVar.f9538h;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        iVar.f9538h = i43 - Integer.MIN_VALUE;
                        Object obj7 = iVar.f9537g;
                        i12 = iVar.f9538h;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                Z5.a.d(obj7);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj7);
                            C0297h o8 = ((ScenarioDatabase) obj).o();
                            iVar.f9538h = 1;
                            Object n12 = this.f9107e.n(o8, iVar);
                            EnumC0646a enumC0646a6 = EnumC0646a.f10656d;
                            if (n12 == enumC0646a6) {
                                return enumC0646a6;
                            }
                        }
                        return y.f7506a;
                    }
                }
                iVar = new c2.i(this, interfaceC0617c);
                Object obj72 = iVar.f9537g;
                i12 = iVar.f9538h;
                if (i12 == 0) {
                }
                return y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC0617c instanceof d5.q) {
                    qVar2 = (d5.q) interfaceC0617c;
                    int i44 = qVar2.f10432h;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        qVar2.f10432h = i44 - Integer.MIN_VALUE;
                        Object obj8 = qVar2.f10431g;
                        i13 = qVar2.f10432h;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                Z5.a.d(obj8);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj8);
                            if (((EnumC1855a) obj) != EnumC1855a.f16627e) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z8);
                            qVar2.f10432h = 1;
                            Object n13 = this.f9107e.n(valueOf, qVar2);
                            EnumC0646a enumC0646a7 = EnumC0646a.f10656d;
                            if (n13 == enumC0646a7) {
                                return enumC0646a7;
                            }
                        }
                        return y.f7506a;
                    }
                }
                qVar2 = new d5.q(this, interfaceC0617c);
                Object obj82 = qVar2.f10431g;
                i13 = qVar2.f10432h;
                if (i13 == 0) {
                }
                return y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC0617c instanceof g3.c) {
                    cVar = (g3.c) interfaceC0617c;
                    int i45 = cVar.f11143h;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        cVar.f11143h = i45 - Integer.MIN_VALUE;
                        Object obj9 = cVar.f11142g;
                        i14 = cVar.f11143h;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                Z5.a.d(obj9);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj9);
                            if (((p2.e) obj) == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            Boolean valueOf2 = Boolean.valueOf(z9);
                            cVar.f11143h = 1;
                            Object n14 = this.f9107e.n(valueOf2, cVar);
                            EnumC0646a enumC0646a8 = EnumC0646a.f10656d;
                            if (n14 == enumC0646a8) {
                                return enumC0646a8;
                            }
                        }
                        return y.f7506a;
                    }
                }
                cVar = new g3.c(this, interfaceC0617c);
                Object obj92 = cVar.f11142g;
                i14 = cVar.f11143h;
                if (i14 == 0) {
                }
                return y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (interfaceC0617c instanceof C0935u) {
                    c0935u = (C0935u) interfaceC0617c;
                    int i46 = c0935u.f11896h;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        c0935u.f11896h = i46 - Integer.MIN_VALUE;
                        Object obj10 = c0935u.f11895g;
                        i15 = c0935u.f11896h;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                Z5.a.d(obj10);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj10);
                            C1304a c1304a = (C1304a) obj;
                            if (c1304a != null && c1304a.h()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Boolean valueOf3 = Boolean.valueOf(z10);
                            c0935u.f11896h = 1;
                            Object n15 = this.f9107e.n(valueOf3, c0935u);
                            EnumC0646a enumC0646a9 = EnumC0646a.f10656d;
                            if (n15 == enumC0646a9) {
                                return enumC0646a9;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0935u = new C0935u(this, interfaceC0617c);
                Object obj102 = c0935u.f11895g;
                i15 = c0935u.f11896h;
                if (i15 == 0) {
                }
                return y.f7506a;
            case 9:
                if (interfaceC0617c instanceof C0936v) {
                    c0936v = (C0936v) interfaceC0617c;
                    int i47 = c0936v.f11899h;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        c0936v.f11899h = i47 - Integer.MIN_VALUE;
                        Object obj11 = c0936v.f11898g;
                        i16 = c0936v.f11899h;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                Z5.a.d(obj11);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj11);
                            Boolean valueOf4 = Boolean.valueOf(!((C1304a) obj).d());
                            c0936v.f11899h = 1;
                            Object n16 = this.f9107e.n(valueOf4, c0936v);
                            EnumC0646a enumC0646a10 = EnumC0646a.f10656d;
                            if (n16 == enumC0646a10) {
                                return enumC0646a10;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0936v = new C0936v(this, interfaceC0617c);
                Object obj112 = c0936v.f11898g;
                i16 = c0936v.f11899h;
                if (i16 == 0) {
                }
                return y.f7506a;
            case 10:
                if (interfaceC0617c instanceof C0940z) {
                    c0940z = (C0940z) interfaceC0617c;
                    int i48 = c0940z.f11910h;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        c0940z.f11910h = i48 - Integer.MIN_VALUE;
                        Object obj12 = c0940z.f11909g;
                        i17 = c0940z.f11910h;
                        if (i17 == 0) {
                            if (i17 == 1) {
                                Z5.a.d(obj12);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj12);
                            String str = ((C1304a) obj).f13678c;
                            c0940z.f11910h = 1;
                            Object n17 = this.f9107e.n(str, c0940z);
                            EnumC0646a enumC0646a11 = EnumC0646a.f10656d;
                            if (n17 == enumC0646a11) {
                                return enumC0646a11;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0940z = new C0940z(this, interfaceC0617c);
                Object obj122 = c0940z.f11909g;
                i17 = c0940z.f11910h;
                if (i17 == 0) {
                }
                return y.f7506a;
            case 11:
                if (interfaceC0617c instanceof C0906A) {
                    c0906a = (C0906A) interfaceC0617c;
                    int i49 = c0906a.f11820h;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        c0906a.f11820h = i49 - Integer.MIN_VALUE;
                        Object obj13 = c0906a.f11819g;
                        i18 = c0906a.f11820h;
                        if (i18 == 0) {
                            if (i18 == 1) {
                                Z5.a.d(obj13);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj13);
                            if (((C1304a) obj).f13678c.length() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            Boolean valueOf5 = Boolean.valueOf(z11);
                            c0906a.f11820h = 1;
                            Object n18 = this.f9107e.n(valueOf5, c0906a);
                            EnumC0646a enumC0646a12 = EnumC0646a.f10656d;
                            if (n18 == enumC0646a12) {
                                return enumC0646a12;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0906a = new C0906A(this, interfaceC0617c);
                Object obj132 = c0906a.f11819g;
                i18 = c0906a.f11820h;
                if (i18 == 0) {
                }
                return y.f7506a;
            case 12:
                if (interfaceC0617c instanceof C0908C) {
                    c0908c = (C0908C) interfaceC0617c;
                    int i50 = c0908c.f11825h;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        c0908c.f11825h = i50 - Integer.MIN_VALUE;
                        Object obj14 = c0908c.f11824g;
                        i19 = c0908c.f11825h;
                        if (i19 == 0) {
                            if (i19 == 1) {
                                Z5.a.d(obj14);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj14);
                            String valueOf6 = String.valueOf(((C1304a) obj).f13684i);
                            c0908c.f11825h = 1;
                            Object n19 = this.f9107e.n(valueOf6, c0908c);
                            EnumC0646a enumC0646a13 = EnumC0646a.f10656d;
                            if (n19 == enumC0646a13) {
                                return enumC0646a13;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0908c = new C0908C(this, interfaceC0617c);
                Object obj142 = c0908c.f11824g;
                i19 = c0908c.f11825h;
                if (i19 == 0) {
                }
                return y.f7506a;
            case 13:
                if (interfaceC0617c instanceof C0909D) {
                    c0909d = (C0909D) interfaceC0617c;
                    int i51 = c0909d.f11828h;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        c0909d.f11828h = i51 - Integer.MIN_VALUE;
                        Object obj15 = c0909d.f11827g;
                        i20 = c0909d.f11828h;
                        if (i20 == 0) {
                            if (i20 == 1) {
                                Z5.a.d(obj15);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj15);
                            if (((C1304a) obj).f13684i <= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            Boolean valueOf7 = Boolean.valueOf(z12);
                            c0909d.f11828h = 1;
                            Object n20 = this.f9107e.n(valueOf7, c0909d);
                            EnumC0646a enumC0646a14 = EnumC0646a.f10656d;
                            if (n20 == enumC0646a14) {
                                return enumC0646a14;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0909d = new C0909D(this, interfaceC0617c);
                Object obj152 = c0909d.f11827g;
                i20 = c0909d.f11828h;
                if (i20 == 0) {
                }
                return y.f7506a;
            case 14:
                if (interfaceC0617c instanceof C0910E) {
                    c0910e = (C0910E) interfaceC0617c;
                    int i52 = c0910e.f11831h;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        c0910e.f11831h = i52 - Integer.MIN_VALUE;
                        Object obj16 = c0910e.f11830g;
                        i21 = c0910e.f11831h;
                        if (i21 == 0) {
                            if (i21 == 1) {
                                Z5.a.d(obj16);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj16);
                            String valueOf8 = String.valueOf(((C1304a) obj).f13680e);
                            c0910e.f11831h = 1;
                            Object n21 = this.f9107e.n(valueOf8, c0910e);
                            EnumC0646a enumC0646a15 = EnumC0646a.f10656d;
                            if (n21 == enumC0646a15) {
                                return enumC0646a15;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0910e = new C0910E(this, interfaceC0617c);
                Object obj162 = c0910e.f11830g;
                i21 = c0910e.f11831h;
                if (i21 == 0) {
                }
                return y.f7506a;
            case 15:
                if (interfaceC0617c instanceof C0911F) {
                    c0911f = (C0911F) interfaceC0617c;
                    int i53 = c0911f.f11834h;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        c0911f.f11834h = i53 - Integer.MIN_VALUE;
                        Object obj17 = c0911f.f11833g;
                        i22 = c0911f.f11834h;
                        if (i22 == 0) {
                            if (i22 == 1) {
                                Z5.a.d(obj17);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj17);
                            if (((C1304a) obj).f13680e <= 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Boolean valueOf9 = Boolean.valueOf(z13);
                            c0911f.f11834h = 1;
                            Object n22 = this.f9107e.n(valueOf9, c0911f);
                            EnumC0646a enumC0646a16 = EnumC0646a.f10656d;
                            if (n22 == enumC0646a16) {
                                return enumC0646a16;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0911f = new C0911F(this, interfaceC0617c);
                Object obj172 = c0911f.f11833g;
                i22 = c0911f.f11834h;
                if (i22 == 0) {
                }
                return y.f7506a;
            case 16:
                if (interfaceC0617c instanceof C0912G) {
                    c0912g = (C0912G) interfaceC0617c;
                    int i54 = c0912g.f11837h;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        c0912g.f11837h = i54 - Integer.MIN_VALUE;
                        Object obj18 = c0912g.f11836g;
                        i23 = c0912g.f11837h;
                        if (i23 == 0) {
                            if (i23 == 1) {
                                Z5.a.d(obj18);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj18);
                            Boolean valueOf10 = Boolean.valueOf(((C1304a) obj).f13681f);
                            c0912g.f11837h = 1;
                            Object n23 = this.f9107e.n(valueOf10, c0912g);
                            EnumC0646a enumC0646a17 = EnumC0646a.f10656d;
                            if (n23 == enumC0646a17) {
                                return enumC0646a17;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0912g = new C0912G(this, interfaceC0617c);
                Object obj182 = c0912g.f11836g;
                i23 = c0912g.f11837h;
                if (i23 == 0) {
                }
                return y.f7506a;
            case 17:
                if (interfaceC0617c instanceof C0913H) {
                    c0913h = (C0913H) interfaceC0617c;
                    int i55 = c0913h.f11840h;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        c0913h.f11840h = i55 - Integer.MIN_VALUE;
                        Object obj19 = c0913h.f11839g;
                        i24 = c0913h.f11840h;
                        if (i24 == 0) {
                            if (i24 == 1) {
                                Z5.a.d(obj19);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj19);
                            String valueOf11 = String.valueOf(((C1304a) obj).f13682g);
                            c0913h.f11840h = 1;
                            Object n24 = this.f9107e.n(valueOf11, c0913h);
                            EnumC0646a enumC0646a18 = EnumC0646a.f10656d;
                            if (n24 == enumC0646a18) {
                                return enumC0646a18;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0913h = new C0913H(this, interfaceC0617c);
                Object obj192 = c0913h.f11839g;
                i24 = c0913h.f11840h;
                if (i24 == 0) {
                }
                return y.f7506a;
            case 18:
                if (interfaceC0617c instanceof C0962i) {
                    c0962i = (C0962i) interfaceC0617c;
                    int i56 = c0962i.f11991h;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        c0962i.f11991h = i56 - Integer.MIN_VALUE;
                        Object obj20 = c0962i.f11990g;
                        i25 = c0962i.f11991h;
                        if (i25 == 0) {
                            if (i25 == 1) {
                                Z5.a.d(obj20);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj20);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj21 : (List) obj) {
                                C0965l c0965l = ((C0959f) obj21).f11988a;
                                int hashCode = Boolean.hashCode(c0965l.f12002e) + Integer.hashCode(c0965l.f11998a) + c0965l.f12000c.hashCode() + c0965l.f11999b.hashCode();
                                String str2 = c0965l.f12001d;
                                if (str2 != null) {
                                    i26 = str2.hashCode();
                                } else {
                                    i26 = 0;
                                }
                                if (hashSet.add(new Integer(hashCode + i26))) {
                                    arrayList3.add(obj21);
                                }
                            }
                            c0962i.f11991h = 1;
                            Object n25 = this.f9107e.n(arrayList3, c0962i);
                            EnumC0646a enumC0646a19 = EnumC0646a.f10656d;
                            if (n25 == enumC0646a19) {
                                return enumC0646a19;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0962i = new C0962i(this, interfaceC0617c);
                Object obj202 = c0962i.f11990g;
                i25 = c0962i.f11991h;
                if (i25 == 0) {
                }
                return y.f7506a;
            case 19:
                if (interfaceC0617c instanceof C0983o) {
                    c0983o = (C0983o) interfaceC0617c;
                    int i57 = c0983o.f12111h;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        c0983o.f12111h = i57 - Integer.MIN_VALUE;
                        Object obj23 = c0983o.f12110g;
                        i27 = c0983o.f12111h;
                        if (i27 == 0) {
                            if (i27 == 1) {
                                Z5.a.d(obj23);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj23);
                            Object obj24 = ((I3.a) obj).f2086a;
                            if (obj24 != null) {
                                c0983o.f12111h = 1;
                                Object n26 = this.f9107e.n(obj24, c0983o);
                                EnumC0646a enumC0646a20 = EnumC0646a.f10656d;
                                if (n26 == enumC0646a20) {
                                    return enumC0646a20;
                                }
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0983o = new C0983o(this, interfaceC0617c);
                Object obj232 = c0983o.f12110g;
                i27 = c0983o.f12111h;
                if (i27 == 0) {
                }
                return y.f7506a;
            case 20:
                if (interfaceC0617c instanceof C0984p) {
                    c0984p = (C0984p) interfaceC0617c;
                    int i58 = c0984p.f12114h;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        c0984p.f12114h = i58 - Integer.MIN_VALUE;
                        Object obj25 = c0984p.f12113g;
                        i28 = c0984p.f12114h;
                        if (i28 == 0) {
                            if (i28 == 1) {
                                Z5.a.d(obj25);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj25);
                            C0902b c0902b = (C0902b) obj;
                            int i59 = c0902b.f11796h;
                            Rect rect = c0902b.f11794f;
                            if (i59 != 3) {
                                z14 = null;
                            } else {
                                Rect rect2 = c0902b.j;
                                if (rect2 == null) {
                                    rect2 = rect;
                                }
                                z14 = new Z(rect2, rect);
                            }
                            if (z14 != null) {
                                c0984p.f12114h = 1;
                                Object n27 = this.f9107e.n(z14, c0984p);
                                EnumC0646a enumC0646a21 = EnumC0646a.f10656d;
                                if (n27 == enumC0646a21) {
                                    return enumC0646a21;
                                }
                            }
                        }
                        return y.f7506a;
                    }
                }
                c0984p = new C0984p(this, interfaceC0617c);
                Object obj252 = c0984p.f12113g;
                i28 = c0984p.f12114h;
                if (i28 == 0) {
                }
                return y.f7506a;
            case 21:
                if (interfaceC0617c instanceof L) {
                    l6 = (L) interfaceC0617c;
                    int i60 = l6.f12034h;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        l6.f12034h = i60 - Integer.MIN_VALUE;
                        Object obj26 = l6.f12033g;
                        i29 = l6.f12034h;
                        if (i29 == 0) {
                            if (i29 == 1) {
                                Z5.a.d(obj26);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj26);
                            Boolean valueOf12 = Boolean.valueOf(((I3.a) obj).f2087b);
                            l6.f12034h = 1;
                            Object n28 = this.f9107e.n(valueOf12, l6);
                            EnumC0646a enumC0646a22 = EnumC0646a.f10656d;
                            if (n28 == enumC0646a22) {
                                return enumC0646a22;
                            }
                        }
                        return y.f7506a;
                    }
                }
                l6 = new L(this, interfaceC0617c);
                Object obj262 = l6.f12033g;
                i29 = l6.f12034h;
                if (i29 == 0) {
                }
                return y.f7506a;
            case 22:
                if (interfaceC0617c instanceof M) {
                    m6 = (M) interfaceC0617c;
                    int i61 = m6.f12037h;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        m6.f12037h = i61 - Integer.MIN_VALUE;
                        Object obj27 = m6.f12036g;
                        i30 = m6.f12037h;
                        if (i30 == 0) {
                            if (i30 == 1) {
                                Z5.a.d(obj27);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj27);
                            String str3 = ((C0902b) obj).f11791c;
                            m6.f12037h = 1;
                            Object n29 = this.f9107e.n(str3, m6);
                            EnumC0646a enumC0646a23 = EnumC0646a.f10656d;
                            if (n29 == enumC0646a23) {
                                return enumC0646a23;
                            }
                        }
                        return y.f7506a;
                    }
                }
                m6 = new M(this, interfaceC0617c);
                Object obj272 = m6.f12036g;
                i30 = m6.f12037h;
                if (i30 == 0) {
                }
                return y.f7506a;
            case 23:
                if (interfaceC0617c instanceof O) {
                    o7 = (O) interfaceC0617c;
                    int i62 = o7.f12042h;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        o7.f12042h = i62 - Integer.MIN_VALUE;
                        Object obj28 = o7.f12041g;
                        i31 = o7.f12042h;
                        if (i31 == 0) {
                            if (i31 == 1) {
                                Z5.a.d(obj28);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj28);
                            if (((C0902b) obj).f11791c.length() == 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            Boolean valueOf13 = Boolean.valueOf(z15);
                            o7.f12042h = 1;
                            Object n30 = this.f9107e.n(valueOf13, o7);
                            EnumC0646a enumC0646a24 = EnumC0646a.f10656d;
                            if (n30 == enumC0646a24) {
                                return enumC0646a24;
                            }
                        }
                        return y.f7506a;
                    }
                }
                o7 = new O(this, interfaceC0617c);
                Object obj282 = o7.f12041g;
                i31 = o7.f12042h;
                if (i31 == 0) {
                }
                return y.f7506a;
            case 24:
                if (interfaceC0617c instanceof Q) {
                    q6 = (Q) interfaceC0617c;
                    int i63 = q6.f12047h;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        q6.f12047h = i63 - Integer.MIN_VALUE;
                        Object obj29 = q6.f12046g;
                        i32 = q6.f12047h;
                        if (i32 == 0) {
                            if (i32 == 1) {
                                Z5.a.d(obj29);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj29);
                            Boolean valueOf14 = Boolean.valueOf(((C0902b) obj).f11797i);
                            q6.f12047h = 1;
                            Object n31 = this.f9107e.n(valueOf14, q6);
                            EnumC0646a enumC0646a25 = EnumC0646a.f10656d;
                            if (n31 == enumC0646a25) {
                                return enumC0646a25;
                            }
                        }
                        return y.f7506a;
                    }
                }
                q6 = new Q(this, interfaceC0617c);
                Object obj292 = q6.f12046g;
                i32 = q6.f12047h;
                if (i32 == 0) {
                }
                return y.f7506a;
            case 25:
                if (interfaceC0617c instanceof U) {
                    u8 = (U) interfaceC0617c;
                    int i64 = u8.f12056h;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        u8.f12056h = i64 - Integer.MIN_VALUE;
                        Object obj30 = u8.f12055g;
                        i33 = u8.f12056h;
                        if (i33 == 0) {
                            if (i33 == 1) {
                                Z5.a.d(obj30);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj30);
                            Boolean valueOf15 = Boolean.valueOf(((I3.a) obj).f2088c);
                            u8.f12056h = 1;
                            Object n32 = this.f9107e.n(valueOf15, u8);
                            EnumC0646a enumC0646a26 = EnumC0646a.f10656d;
                            if (n32 == enumC0646a26) {
                                return enumC0646a26;
                            }
                        }
                        return y.f7506a;
                    }
                }
                u8 = new U(this, interfaceC0617c);
                Object obj302 = u8.f12055g;
                i33 = u8.f12056h;
                if (i33 == 0) {
                }
                return y.f7506a;
            case 26:
                if (interfaceC0617c instanceof V) {
                    v8 = (V) interfaceC0617c;
                    int i65 = v8.f12059h;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        v8.f12059h = i65 - Integer.MIN_VALUE;
                        Object obj31 = v8.f12058g;
                        i34 = v8.f12059h;
                        if (i34 == 0) {
                            if (i34 == 1) {
                                Z5.a.d(obj31);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj31);
                            Object obj33 = ((I3.a) obj).f2086a;
                            if (obj33 != null) {
                                v8.f12059h = 1;
                                Object n33 = this.f9107e.n(obj33, v8);
                                EnumC0646a enumC0646a27 = EnumC0646a.f10656d;
                                if (n33 == enumC0646a27) {
                                    return enumC0646a27;
                                }
                            }
                        }
                        return y.f7506a;
                    }
                }
                v8 = new V(this, interfaceC0617c);
                Object obj312 = v8.f12058g;
                i34 = v8.f12059h;
                if (i34 == 0) {
                }
                return y.f7506a;
            case 27:
                if (interfaceC0617c instanceof W) {
                    w8 = (W) interfaceC0617c;
                    int i66 = w8.f12062h;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        w8.f12062h = i66 - Integer.MIN_VALUE;
                        Object obj34 = w8.f12061g;
                        i35 = w8.f12062h;
                        if (i35 == 0) {
                            if (i35 == 1) {
                                Z5.a.d(obj34);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj34);
                            Integer num = new Integer(((C0902b) obj).f11795g);
                            w8.f12062h = 1;
                            Object n34 = this.f9107e.n(num, w8);
                            EnumC0646a enumC0646a28 = EnumC0646a.f10656d;
                            if (n34 == enumC0646a28) {
                                return enumC0646a28;
                            }
                        }
                        return y.f7506a;
                    }
                }
                w8 = new W(this, interfaceC0617c);
                Object obj342 = w8.f12061g;
                i35 = w8.f12062h;
                if (i35 == 0) {
                }
                return y.f7506a;
            case 28:
                if (interfaceC0617c instanceof C1015n) {
                    c1015n = (C1015n) interfaceC0617c;
                    int i67 = c1015n.f12229h;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        c1015n.f12229h = i67 - Integer.MIN_VALUE;
                        Object obj35 = c1015n.f12228g;
                        i36 = c1015n.f12229h;
                        if (i36 == 0) {
                            if (i36 == 1) {
                                Z5.a.d(obj35);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj35);
                            p2.b bVar = (p2.b) obj;
                            if (bVar != null && bVar.h()) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            Boolean valueOf16 = Boolean.valueOf(z16);
                            c1015n.f12229h = 1;
                            Object n35 = this.f9107e.n(valueOf16, c1015n);
                            EnumC0646a enumC0646a29 = EnumC0646a.f10656d;
                            if (n35 == enumC0646a29) {
                                return enumC0646a29;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c1015n = new C1015n(this, interfaceC0617c);
                Object obj352 = c1015n.f12228g;
                i36 = c1015n.f12229h;
                if (i36 == 0) {
                }
                return y.f7506a;
            default:
                if (interfaceC0617c instanceof C1016o) {
                    c1016o = (C1016o) interfaceC0617c;
                    int i68 = c1016o.f12232h;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        c1016o.f12232h = i68 - Integer.MIN_VALUE;
                        Object obj36 = c1016o.f12231g;
                        i37 = c1016o.f12232h;
                        if (i37 == 0) {
                            if (i37 == 1) {
                                Z5.a.d(obj36);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj36);
                            String str4 = ((p2.b) obj).f13687c;
                            c1016o.f12232h = 1;
                            Object n36 = this.f9107e.n(str4, c1016o);
                            EnumC0646a enumC0646a30 = EnumC0646a.f10656d;
                            if (n36 == enumC0646a30) {
                                return enumC0646a30;
                            }
                        }
                        return y.f7506a;
                    }
                }
                c1016o = new C1016o(this, interfaceC0617c);
                Object obj362 = c1016o.f12231g;
                i37 = c1016o.f12232h;
                if (i37 == 0) {
                }
                return y.f7506a;
        }
    }
}
