package l3;

import O7.InterfaceC0234g;
import a6.AbstractC0438m;
import android.graphics.PointF;
import d6.InterfaceC0617c;
import e2.C0638a;
import e2.C0639b;
import e6.EnumC0646a;
import h4.AbstractC0832f;
import j2.C0903c;
import j2.C0905e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m3.C1056A;
import m3.C1057B;
import m3.C1058C;
import m3.C1059D;
import m3.C1080t;
import m3.C1081u;
import m3.C1083w;
import m3.C1084x;
import m3.C1085y;
import m3.C1086z;
import n2.C1155c;
import n4.t;
import n4.v;
import n4.w;
import n4.x;
import n4.y;
import o3.C1230a;
import o3.C1246q;
import o3.C1247r;
import o3.C1249t;
import o3.C1250u;
import o4.u;
import p2.C1304a;

/* renamed from: l3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018q implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f12238e;

    public /* synthetic */ C1018q(InterfaceC0234g interfaceC0234g, int i4) {
        this.f12237d = i4;
        this.f12238e = interfaceC0234g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        C1017p c1017p;
        int i4;
        boolean z8;
        C1019r c1019r;
        int i8;
        boolean z9;
        m2.d dVar;
        int i9;
        m2.f fVar;
        int i10;
        p2.e eVar;
        m2.h hVar;
        int i11;
        C1080t c1080t;
        int i12;
        boolean z10;
        C1081u c1081u;
        int i13;
        C1083w c1083w;
        int i14;
        C1084x c1084x;
        int i15;
        boolean z11;
        C1085y c1085y;
        int i16;
        C1086z c1086z;
        int i17;
        boolean z12;
        C1056A c1056a;
        int i18;
        C1057B c1057b;
        int i19;
        boolean z13;
        C1058C c1058c;
        int i20;
        C1059D c1059d;
        int i21;
        n4.p pVar;
        int i22;
        n4.q qVar;
        int i23;
        n4.r rVar;
        int i24;
        t tVar;
        int i25;
        boolean z14;
        v vVar;
        int i26;
        w wVar;
        int i27;
        boolean z15;
        x xVar;
        int i28;
        y yVar;
        int i29;
        C1246q c1246q;
        int i30;
        C1247r c1247r;
        int i31;
        C1249t c1249t;
        int i32;
        Object obj2;
        u uVar;
        int i33;
        o4.v vVar2;
        int i34;
        o4.w wVar2;
        int i35;
        o4.x xVar2;
        int i36;
        switch (this.f12237d) {
            case 0:
                if (interfaceC0617c instanceof C1017p) {
                    c1017p = (C1017p) interfaceC0617c;
                    int i37 = c1017p.f12235h;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        c1017p.f12235h = i37 - Integer.MIN_VALUE;
                        Object obj3 = c1017p.f12234g;
                        i4 = c1017p.f12235h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            if (((p2.b) obj).f13687c.length() == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z8);
                            c1017p.f12235h = 1;
                            Object n3 = this.f12238e.n(valueOf, c1017p);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n3 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1017p = new C1017p(this, interfaceC0617c);
                Object obj32 = c1017p.f12234g;
                i4 = c1017p.f12235h;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            case 1:
                if (interfaceC0617c instanceof C1019r) {
                    c1019r = (C1019r) interfaceC0617c;
                    int i38 = c1019r.f12240h;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        c1019r.f12240h = i38 - Integer.MIN_VALUE;
                        Object obj4 = c1019r.f12239g;
                        i8 = c1019r.f12240h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj4);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj4);
                            if (((p2.b) obj).f13689e <= 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            Boolean valueOf2 = Boolean.valueOf(z9);
                            c1019r.f12240h = 1;
                            Object n8 = this.f12238e.n(valueOf2, c1019r);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n8 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1019r = new C1019r(this, interfaceC0617c);
                Object obj42 = c1019r.f12239g;
                i8 = c1019r.f12240h;
                if (i8 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0617c instanceof m2.d) {
                    dVar = (m2.d) interfaceC0617c;
                    int i39 = dVar.f12388h;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        dVar.f12388h = i39 - Integer.MIN_VALUE;
                        Object obj5 = dVar.f12387g;
                        i9 = dVar.f12388h;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                Z5.a.d(obj5);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj5);
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(h4.g.u((C1155c) it.next()));
                            }
                            dVar.f12388h = 1;
                            Object n9 = this.f12238e.n(arrayList, dVar);
                            EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                            if (n9 == enumC0646a3) {
                                return enumC0646a3;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                dVar = new m2.d(this, interfaceC0617c);
                Object obj52 = dVar.f12387g;
                i9 = dVar.f12388h;
                if (i9 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (interfaceC0617c instanceof m2.f) {
                    fVar = (m2.f) interfaceC0617c;
                    int i40 = fVar.f12394h;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        fVar.f12394h = i40 - Integer.MIN_VALUE;
                        Object obj6 = fVar.f12393g;
                        i10 = fVar.f12394h;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                Z5.a.d(obj6);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj6);
                            n2.s sVar = (n2.s) obj;
                            if (sVar != null) {
                                eVar = AbstractC0832f.E(sVar);
                            } else {
                                eVar = null;
                            }
                            fVar.f12394h = 1;
                            Object n10 = this.f12238e.n(eVar, fVar);
                            EnumC0646a enumC0646a4 = EnumC0646a.f10656d;
                            if (n10 == enumC0646a4) {
                                return enumC0646a4;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                fVar = new m2.f(this, interfaceC0617c);
                Object obj62 = fVar.f12393g;
                i10 = fVar.f12394h;
                if (i10 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (interfaceC0617c instanceof m2.h) {
                    hVar = (m2.h) interfaceC0617c;
                    int i41 = hVar.f12400h;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        hVar.f12400h = i41 - Integer.MIN_VALUE;
                        Object obj7 = hVar.f12399g;
                        i11 = hVar.f12400h;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                Z5.a.d(obj7);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj7);
                            List list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(AbstractC0832f.E((n2.s) it2.next()));
                            }
                            hVar.f12400h = 1;
                            Object n11 = this.f12238e.n(arrayList2, hVar);
                            EnumC0646a enumC0646a5 = EnumC0646a.f10656d;
                            if (n11 == enumC0646a5) {
                                return enumC0646a5;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                hVar = new m2.h(this, interfaceC0617c);
                Object obj72 = hVar.f12399g;
                i11 = hVar.f12400h;
                if (i11 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0617c instanceof C1080t) {
                    c1080t = (C1080t) interfaceC0617c;
                    int i42 = c1080t.f12478h;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        c1080t.f12478h = i42 - Integer.MIN_VALUE;
                        Object obj8 = c1080t.f12477g;
                        i12 = c1080t.f12478h;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                Z5.a.d(obj8);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj8);
                            p2.c cVar = (p2.c) obj;
                            if (cVar != null && cVar.h()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Boolean valueOf3 = Boolean.valueOf(z10);
                            c1080t.f12478h = 1;
                            Object n12 = this.f12238e.n(valueOf3, c1080t);
                            EnumC0646a enumC0646a6 = EnumC0646a.f10656d;
                            if (n12 == enumC0646a6) {
                                return enumC0646a6;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1080t = new C1080t(this, interfaceC0617c);
                Object obj82 = c1080t.f12477g;
                i12 = c1080t.f12478h;
                if (i12 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC0617c instanceof C1081u) {
                    c1081u = (C1081u) interfaceC0617c;
                    int i43 = c1081u.f12481h;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        c1081u.f12481h = i43 - Integer.MIN_VALUE;
                        Object obj9 = c1081u.f12480g;
                        i13 = c1081u.f12481h;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                Z5.a.d(obj9);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj9);
                            Boolean valueOf4 = Boolean.valueOf(!((p2.c) obj).d());
                            c1081u.f12481h = 1;
                            Object n13 = this.f12238e.n(valueOf4, c1081u);
                            EnumC0646a enumC0646a7 = EnumC0646a.f10656d;
                            if (n13 == enumC0646a7) {
                                return enumC0646a7;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1081u = new C1081u(this, interfaceC0617c);
                Object obj92 = c1081u.f12480g;
                i13 = c1081u.f12481h;
                if (i13 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC0617c instanceof C1083w) {
                    c1083w = (C1083w) interfaceC0617c;
                    int i44 = c1083w.f12487h;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        c1083w.f12487h = i44 - Integer.MIN_VALUE;
                        Object obj10 = c1083w.f12486g;
                        i14 = c1083w.f12487h;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                Z5.a.d(obj10);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj10);
                            String str = ((p2.c) obj).f13692c;
                            c1083w.f12487h = 1;
                            Object n14 = this.f12238e.n(str, c1083w);
                            EnumC0646a enumC0646a8 = EnumC0646a.f10656d;
                            if (n14 == enumC0646a8) {
                                return enumC0646a8;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1083w = new C1083w(this, interfaceC0617c);
                Object obj102 = c1083w.f12486g;
                i14 = c1083w.f12487h;
                if (i14 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (interfaceC0617c instanceof C1084x) {
                    c1084x = (C1084x) interfaceC0617c;
                    int i45 = c1084x.f12490h;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        c1084x.f12490h = i45 - Integer.MIN_VALUE;
                        Object obj11 = c1084x.f12489g;
                        i15 = c1084x.f12490h;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                Z5.a.d(obj11);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj11);
                            if (((p2.c) obj).f13692c.length() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            Boolean valueOf5 = Boolean.valueOf(z11);
                            c1084x.f12490h = 1;
                            Object n15 = this.f12238e.n(valueOf5, c1084x);
                            EnumC0646a enumC0646a9 = EnumC0646a.f10656d;
                            if (n15 == enumC0646a9) {
                                return enumC0646a9;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1084x = new C1084x(this, interfaceC0617c);
                Object obj112 = c1084x.f12489g;
                i15 = c1084x.f12490h;
                if (i15 == 0) {
                }
                return Z5.y.f7506a;
            case 9:
                if (interfaceC0617c instanceof C1085y) {
                    c1085y = (C1085y) interfaceC0617c;
                    int i46 = c1085y.f12493h;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        c1085y.f12493h = i46 - Integer.MIN_VALUE;
                        Object obj12 = c1085y.f12492g;
                        i16 = c1085y.f12493h;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                Z5.a.d(obj12);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj12);
                            String valueOf6 = String.valueOf(((p2.c) obj).j);
                            c1085y.f12493h = 1;
                            Object n16 = this.f12238e.n(valueOf6, c1085y);
                            EnumC0646a enumC0646a10 = EnumC0646a.f10656d;
                            if (n16 == enumC0646a10) {
                                return enumC0646a10;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1085y = new C1085y(this, interfaceC0617c);
                Object obj122 = c1085y.f12492g;
                i16 = c1085y.f12493h;
                if (i16 == 0) {
                }
                return Z5.y.f7506a;
            case 10:
                if (interfaceC0617c instanceof C1086z) {
                    c1086z = (C1086z) interfaceC0617c;
                    int i47 = c1086z.f12496h;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        c1086z.f12496h = i47 - Integer.MIN_VALUE;
                        Object obj13 = c1086z.f12495g;
                        i17 = c1086z.f12496h;
                        if (i17 == 0) {
                            if (i17 == 1) {
                                Z5.a.d(obj13);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj13);
                            if (((p2.c) obj).j <= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            Boolean valueOf7 = Boolean.valueOf(z12);
                            c1086z.f12496h = 1;
                            Object n17 = this.f12238e.n(valueOf7, c1086z);
                            EnumC0646a enumC0646a11 = EnumC0646a.f10656d;
                            if (n17 == enumC0646a11) {
                                return enumC0646a11;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1086z = new C1086z(this, interfaceC0617c);
                Object obj132 = c1086z.f12495g;
                i17 = c1086z.f12496h;
                if (i17 == 0) {
                }
                return Z5.y.f7506a;
            case 11:
                if (interfaceC0617c instanceof C1056A) {
                    c1056a = (C1056A) interfaceC0617c;
                    int i48 = c1056a.f12414h;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        c1056a.f12414h = i48 - Integer.MIN_VALUE;
                        Object obj14 = c1056a.f12413g;
                        i18 = c1056a.f12414h;
                        if (i18 == 0) {
                            if (i18 == 1) {
                                Z5.a.d(obj14);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj14);
                            String valueOf8 = String.valueOf(((p2.c) obj).f13694e);
                            c1056a.f12414h = 1;
                            Object n18 = this.f12238e.n(valueOf8, c1056a);
                            EnumC0646a enumC0646a12 = EnumC0646a.f10656d;
                            if (n18 == enumC0646a12) {
                                return enumC0646a12;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1056a = new C1056A(this, interfaceC0617c);
                Object obj142 = c1056a.f12413g;
                i18 = c1056a.f12414h;
                if (i18 == 0) {
                }
                return Z5.y.f7506a;
            case 12:
                if (interfaceC0617c instanceof C1057B) {
                    c1057b = (C1057B) interfaceC0617c;
                    int i49 = c1057b.f12417h;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        c1057b.f12417h = i49 - Integer.MIN_VALUE;
                        Object obj15 = c1057b.f12416g;
                        i19 = c1057b.f12417h;
                        if (i19 == 0) {
                            if (i19 == 1) {
                                Z5.a.d(obj15);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj15);
                            if (((p2.c) obj).f13694e <= 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Boolean valueOf9 = Boolean.valueOf(z13);
                            c1057b.f12417h = 1;
                            Object n19 = this.f12238e.n(valueOf9, c1057b);
                            EnumC0646a enumC0646a13 = EnumC0646a.f10656d;
                            if (n19 == enumC0646a13) {
                                return enumC0646a13;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1057b = new C1057B(this, interfaceC0617c);
                Object obj152 = c1057b.f12416g;
                i19 = c1057b.f12417h;
                if (i19 == 0) {
                }
                return Z5.y.f7506a;
            case 13:
                if (interfaceC0617c instanceof C1058C) {
                    c1058c = (C1058C) interfaceC0617c;
                    int i50 = c1058c.f12420h;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        c1058c.f12420h = i50 - Integer.MIN_VALUE;
                        Object obj16 = c1058c.f12419g;
                        i20 = c1058c.f12420h;
                        if (i20 == 0) {
                            if (i20 == 1) {
                                Z5.a.d(obj16);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj16);
                            Boolean valueOf10 = Boolean.valueOf(((p2.c) obj).f13695f);
                            c1058c.f12420h = 1;
                            Object n20 = this.f12238e.n(valueOf10, c1058c);
                            EnumC0646a enumC0646a14 = EnumC0646a.f10656d;
                            if (n20 == enumC0646a14) {
                                return enumC0646a14;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1058c = new C1058C(this, interfaceC0617c);
                Object obj162 = c1058c.f12419g;
                i20 = c1058c.f12420h;
                if (i20 == 0) {
                }
                return Z5.y.f7506a;
            case 14:
                if (interfaceC0617c instanceof C1059D) {
                    c1059d = (C1059D) interfaceC0617c;
                    int i51 = c1059d.f12423h;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        c1059d.f12423h = i51 - Integer.MIN_VALUE;
                        Object obj17 = c1059d.f12422g;
                        i21 = c1059d.f12423h;
                        if (i21 == 0) {
                            if (i21 == 1) {
                                Z5.a.d(obj17);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj17);
                            String valueOf11 = String.valueOf(((p2.c) obj).f13696g);
                            c1059d.f12423h = 1;
                            Object n21 = this.f12238e.n(valueOf11, c1059d);
                            EnumC0646a enumC0646a15 = EnumC0646a.f10656d;
                            if (n21 == enumC0646a15) {
                                return enumC0646a15;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1059d = new C1059D(this, interfaceC0617c);
                Object obj172 = c1059d.f12422g;
                i21 = c1059d.f12423h;
                if (i21 == 0) {
                }
                return Z5.y.f7506a;
            case 15:
                if (interfaceC0617c instanceof n4.p) {
                    pVar = (n4.p) interfaceC0617c;
                    int i52 = pVar.f12960h;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        pVar.f12960h = i52 - Integer.MIN_VALUE;
                        Object obj18 = pVar.f12959g;
                        i22 = pVar.f12960h;
                        if (i22 == 0) {
                            if (i22 == 1) {
                                Z5.a.d(obj18);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj18);
                            if (obj instanceof C0903c) {
                                pVar.f12960h = 1;
                                Object n22 = this.f12238e.n(obj, pVar);
                                EnumC0646a enumC0646a16 = EnumC0646a.f10656d;
                                if (n22 == enumC0646a16) {
                                    return enumC0646a16;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                pVar = new n4.p(this, interfaceC0617c);
                Object obj182 = pVar.f12959g;
                i22 = pVar.f12960h;
                if (i22 == 0) {
                }
                return Z5.y.f7506a;
            case 16:
                if (interfaceC0617c instanceof n4.q) {
                    qVar = (n4.q) interfaceC0617c;
                    int i53 = qVar.f12963h;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        qVar.f12963h = i53 - Integer.MIN_VALUE;
                        Object obj19 = qVar.f12962g;
                        i23 = qVar.f12963h;
                        if (i23 == 0) {
                            if (i23 == 1) {
                                Z5.a.d(obj19);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj19);
                            Boolean valueOf12 = Boolean.valueOf(((I3.a) obj).f2087b);
                            qVar.f12963h = 1;
                            Object n23 = this.f12238e.n(valueOf12, qVar);
                            EnumC0646a enumC0646a17 = EnumC0646a.f10656d;
                            if (n23 == enumC0646a17) {
                                return enumC0646a17;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                qVar = new n4.q(this, interfaceC0617c);
                Object obj192 = qVar.f12962g;
                i23 = qVar.f12963h;
                if (i23 == 0) {
                }
                return Z5.y.f7506a;
            case 17:
                if (interfaceC0617c instanceof n4.r) {
                    rVar = (n4.r) interfaceC0617c;
                    int i54 = rVar.f12966h;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        rVar.f12966h = i54 - Integer.MIN_VALUE;
                        Object obj20 = rVar.f12965g;
                        i24 = rVar.f12966h;
                        if (i24 == 0) {
                            if (i24 == 1) {
                                Z5.a.d(obj20);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj20);
                            String str2 = ((C0903c) obj).f11800c;
                            rVar.f12966h = 1;
                            Object n24 = this.f12238e.n(str2, rVar);
                            EnumC0646a enumC0646a18 = EnumC0646a.f10656d;
                            if (n24 == enumC0646a18) {
                                return enumC0646a18;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                rVar = new n4.r(this, interfaceC0617c);
                Object obj202 = rVar.f12965g;
                i24 = rVar.f12966h;
                if (i24 == 0) {
                }
                return Z5.y.f7506a;
            case 18:
                if (interfaceC0617c instanceof t) {
                    tVar = (t) interfaceC0617c;
                    int i55 = tVar.f12971h;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        tVar.f12971h = i55 - Integer.MIN_VALUE;
                        Object obj21 = tVar.f12970g;
                        i25 = tVar.f12971h;
                        if (i25 == 0) {
                            if (i25 == 1) {
                                Z5.a.d(obj21);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj21);
                            if (((C0903c) obj).f11800c.length() == 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            Boolean valueOf13 = Boolean.valueOf(z14);
                            tVar.f12971h = 1;
                            Object n25 = this.f12238e.n(valueOf13, tVar);
                            EnumC0646a enumC0646a19 = EnumC0646a.f10656d;
                            if (n25 == enumC0646a19) {
                                return enumC0646a19;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                tVar = new t(this, interfaceC0617c);
                Object obj212 = tVar.f12970g;
                i25 = tVar.f12971h;
                if (i25 == 0) {
                }
                return Z5.y.f7506a;
            case 19:
                if (interfaceC0617c instanceof v) {
                    vVar = (v) interfaceC0617c;
                    int i56 = vVar.f12976h;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        vVar.f12976h = i56 - Integer.MIN_VALUE;
                        Object obj22 = vVar.f12975g;
                        i26 = vVar.f12976h;
                        if (i26 == 0) {
                            if (i26 == 1) {
                                Z5.a.d(obj22);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj22);
                            String str3 = ((C0903c) obj).f11801d;
                            vVar.f12976h = 1;
                            Object n26 = this.f12238e.n(str3, vVar);
                            EnumC0646a enumC0646a20 = EnumC0646a.f10656d;
                            if (n26 == enumC0646a20) {
                                return enumC0646a20;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                vVar = new v(this, interfaceC0617c);
                Object obj222 = vVar.f12975g;
                i26 = vVar.f12976h;
                if (i26 == 0) {
                }
                return Z5.y.f7506a;
            case 20:
                if (interfaceC0617c instanceof w) {
                    wVar = (w) interfaceC0617c;
                    int i57 = wVar.f12979h;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        wVar.f12979h = i57 - Integer.MIN_VALUE;
                        Object obj23 = wVar.f12978g;
                        i27 = wVar.f12979h;
                        if (i27 == 0) {
                            if (i27 == 1) {
                                Z5.a.d(obj23);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj23);
                            if (((C0903c) obj).f11801d.length() == 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            Boolean valueOf14 = Boolean.valueOf(z15);
                            wVar.f12979h = 1;
                            Object n27 = this.f12238e.n(valueOf14, wVar);
                            EnumC0646a enumC0646a21 = EnumC0646a.f10656d;
                            if (n27 == enumC0646a21) {
                                return enumC0646a21;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                wVar = new w(this, interfaceC0617c);
                Object obj232 = wVar.f12978g;
                i27 = wVar.f12979h;
                if (i27 == 0) {
                }
                return Z5.y.f7506a;
            case 21:
                if (interfaceC0617c instanceof x) {
                    xVar = (x) interfaceC0617c;
                    int i58 = xVar.f12982h;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        xVar.f12982h = i58 - Integer.MIN_VALUE;
                        Object obj24 = xVar.f12981g;
                        i28 = xVar.f12982h;
                        if (i28 == 0) {
                            if (i28 == 1) {
                                Z5.a.d(obj24);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj24);
                            Boolean valueOf15 = Boolean.valueOf(((I3.a) obj).f2088c);
                            xVar.f12982h = 1;
                            Object n28 = this.f12238e.n(valueOf15, xVar);
                            EnumC0646a enumC0646a22 = EnumC0646a.f10656d;
                            if (n28 == enumC0646a22) {
                                return enumC0646a22;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                xVar = new x(this, interfaceC0617c);
                Object obj242 = xVar.f12981g;
                i28 = xVar.f12982h;
                if (i28 == 0) {
                }
                return Z5.y.f7506a;
            case 22:
                if (interfaceC0617c instanceof y) {
                    yVar = (y) interfaceC0617c;
                    int i59 = yVar.f12985h;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        yVar.f12985h = i59 - Integer.MIN_VALUE;
                        Object obj25 = yVar.f12984g;
                        i29 = yVar.f12985h;
                        if (i29 == 0) {
                            if (i29 == 1) {
                                Z5.a.d(obj25);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj25);
                            Object obj26 = ((I3.a) obj).f2086a;
                            if (obj26 != null) {
                                yVar.f12985h = 1;
                                Object n29 = this.f12238e.n(obj26, yVar);
                                EnumC0646a enumC0646a23 = EnumC0646a.f10656d;
                                if (n29 == enumC0646a23) {
                                    return enumC0646a23;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                yVar = new y(this, interfaceC0617c);
                Object obj252 = yVar.f12984g;
                i29 = yVar.f12985h;
                if (i29 == 0) {
                }
                return Z5.y.f7506a;
            case 23:
                if (interfaceC0617c instanceof C1246q) {
                    c1246q = (C1246q) interfaceC0617c;
                    int i60 = c1246q.f13478h;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        c1246q.f13478h = i60 - Integer.MIN_VALUE;
                        Object obj27 = c1246q.f13477g;
                        i30 = c1246q.f13478h;
                        if (i30 == 0) {
                            if (i30 == 1) {
                                Z5.a.d(obj27);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj27);
                            if (!((Boolean) ((Z5.j) obj).f7486e).booleanValue()) {
                                c1246q.f13478h = 1;
                                Object n30 = this.f12238e.n(obj, c1246q);
                                EnumC0646a enumC0646a24 = EnumC0646a.f10656d;
                                if (n30 == enumC0646a24) {
                                    return enumC0646a24;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1246q = new C1246q(this, interfaceC0617c);
                Object obj272 = c1246q.f13477g;
                i30 = c1246q.f13478h;
                if (i30 == 0) {
                }
                return Z5.y.f7506a;
            case 24:
                if (interfaceC0617c instanceof C1247r) {
                    c1247r = (C1247r) interfaceC0617c;
                    int i61 = c1247r.f13481h;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        c1247r.f13481h = i61 - Integer.MIN_VALUE;
                        Object obj28 = c1247r.f13480g;
                        i31 = c1247r.f13481h;
                        if (i31 == 0) {
                            if (i31 == 1) {
                                Z5.a.d(obj28);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj28);
                            Boolean valueOf16 = Boolean.valueOf(((C1230a) obj).f13443b);
                            c1247r.f13481h = 1;
                            Object n31 = this.f12238e.n(valueOf16, c1247r);
                            EnumC0646a enumC0646a25 = EnumC0646a.f10656d;
                            if (n31 == enumC0646a25) {
                                return enumC0646a25;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1247r = new C1247r(this, interfaceC0617c);
                Object obj282 = c1247r.f13480g;
                i31 = c1247r.f13481h;
                if (i31 == 0) {
                }
                return Z5.y.f7506a;
            case 25:
                if (interfaceC0617c instanceof C1249t) {
                    c1249t = (C1249t) interfaceC0617c;
                    int i62 = c1249t.f13487h;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        c1249t.f13487h = i62 - Integer.MIN_VALUE;
                        Object obj29 = c1249t.f13486g;
                        i32 = c1249t.f13487h;
                        if (i32 == 0) {
                            if (i32 == 1) {
                                Z5.a.d(obj29);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj29);
                            p2.d dVar2 = (p2.d) ((Z5.j) obj).f7485d;
                            if (dVar2 != null) {
                                if (dVar2 instanceof C1304a) {
                                    C1304a c1304a = (C1304a) dVar2;
                                    obj2 = new Q2.c(c1304a.f13684i, new PointF(c1304a.f13683h), 4);
                                } else if (dVar2 instanceof p2.c) {
                                    p2.c cVar2 = (p2.c) dVar2;
                                    obj2 = new Q2.p(cVar2.j, new PointF(cVar2.f13697h), new PointF(cVar2.f13698i));
                                } else if (dVar2 instanceof p2.b) {
                                    obj2 = new Q2.m(((p2.b) dVar2).f13689e);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                obj2 = null;
                            }
                            c1249t.f13487h = 1;
                            Object n32 = this.f12238e.n(obj2, c1249t);
                            EnumC0646a enumC0646a26 = EnumC0646a.f10656d;
                            if (n32 == enumC0646a26) {
                                return enumC0646a26;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1249t = new C1249t(this, interfaceC0617c);
                Object obj292 = c1249t.f13486g;
                i32 = c1249t.f13487h;
                if (i32 == 0) {
                }
                return Z5.y.f7506a;
            case 26:
                if (interfaceC0617c instanceof u) {
                    uVar = (u) interfaceC0617c;
                    int i63 = uVar.f13599h;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        uVar.f13599h = i63 - Integer.MIN_VALUE;
                        Object obj30 = uVar.f13598g;
                        i33 = uVar.f13599h;
                        if (i33 == 0) {
                            if (i33 == 1) {
                                Z5.a.d(obj30);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj30);
                            if (obj instanceof C0905e) {
                                uVar.f13599h = 1;
                                Object n33 = this.f12238e.n(obj, uVar);
                                EnumC0646a enumC0646a27 = EnumC0646a.f10656d;
                                if (n33 == enumC0646a27) {
                                    return enumC0646a27;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                uVar = new u(this, interfaceC0617c);
                Object obj302 = uVar.f13598g;
                i33 = uVar.f13599h;
                if (i33 == 0) {
                }
                return Z5.y.f7506a;
            case 27:
                if (interfaceC0617c instanceof o4.v) {
                    vVar2 = (o4.v) interfaceC0617c;
                    int i64 = vVar2.f13602h;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        vVar2.f13602h = i64 - Integer.MIN_VALUE;
                        Object obj31 = vVar2.f13601g;
                        i34 = vVar2.f13602h;
                        if (i34 == 0) {
                            if (i34 == 1) {
                                Z5.a.d(obj31);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj31);
                            if (obj instanceof C0639b) {
                                vVar2.f13602h = 1;
                                Object n34 = this.f12238e.n(obj, vVar2);
                                EnumC0646a enumC0646a28 = EnumC0646a.f10656d;
                                if (n34 == enumC0646a28) {
                                    return enumC0646a28;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                vVar2 = new o4.v(this, interfaceC0617c);
                Object obj312 = vVar2.f13601g;
                i34 = vVar2.f13602h;
                if (i34 == 0) {
                }
                return Z5.y.f7506a;
            case 28:
                if (interfaceC0617c instanceof o4.w) {
                    wVar2 = (o4.w) interfaceC0617c;
                    int i65 = wVar2.f13605h;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        wVar2.f13605h = i65 - Integer.MIN_VALUE;
                        Object obj33 = wVar2.f13604g;
                        i35 = wVar2.f13605h;
                        if (i35 == 0) {
                            if (i35 == 1) {
                                Z5.a.d(obj33);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj33);
                            if (obj instanceof C0638a) {
                                wVar2.f13605h = 1;
                                Object n35 = this.f12238e.n(obj, wVar2);
                                EnumC0646a enumC0646a29 = EnumC0646a.f10656d;
                                if (n35 == enumC0646a29) {
                                    return enumC0646a29;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                wVar2 = new o4.w(this, interfaceC0617c);
                Object obj332 = wVar2.f13604g;
                i35 = wVar2.f13605h;
                if (i35 == 0) {
                }
                return Z5.y.f7506a;
            default:
                if (interfaceC0617c instanceof o4.x) {
                    xVar2 = (o4.x) interfaceC0617c;
                    int i66 = xVar2.f13608h;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        xVar2.f13608h = i66 - Integer.MIN_VALUE;
                        Object obj34 = xVar2.f13607g;
                        i36 = xVar2.f13608h;
                        if (i36 == 0) {
                            if (i36 == 1) {
                                Z5.a.d(obj34);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj34);
                            Boolean valueOf17 = Boolean.valueOf(((I3.a) obj).f2087b);
                            xVar2.f13608h = 1;
                            Object n36 = this.f12238e.n(valueOf17, xVar2);
                            EnumC0646a enumC0646a30 = EnumC0646a.f10656d;
                            if (n36 == enumC0646a30) {
                                return enumC0646a30;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                xVar2 = new o4.x(this, interfaceC0617c);
                Object obj342 = xVar2.f13607g;
                i36 = xVar2.f13608h;
                if (i36 == 0) {
                }
                return Z5.y.f7506a;
        }
    }

    public C1018q(InterfaceC0234g interfaceC0234g, C1250u c1250u) {
        this.f12237d = 25;
        this.f12238e = interfaceC0234g;
    }
}
