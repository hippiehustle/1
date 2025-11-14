package M3;

import O7.InterfaceC0234g;
import Z3.C0366a;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import i.AbstractC0862a;
import i2.C0880a;
import j2.C0902b;
import j3.C0938x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.C0959f;
import k3.C0963j;
import k4.C0978j;
import kotlin.NoWhenBranchMatchedException;
import m3.C1082v;
import o3.C1248s;
import p2.C1304a;
import q4.C1390O;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class V implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f3404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f3405f;

    public /* synthetic */ V(InterfaceC0234g interfaceC0234g, Context context, int i4) {
        this.f3403d = i4;
        this.f3404e = interfaceC0234g;
        this.f3405f = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /* JADX WARN: Type inference failed for: r12v3, types: [a6.s] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v66, types: [a6.s] */
    /* JADX WARN: Type inference failed for: r13v69, types: [java.util.ArrayList] */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        U u8;
        int i4;
        Object obj2;
        Z3.K k;
        int i8;
        String string;
        Integer num;
        C0938x c0938x;
        int i9;
        C0963j c0963j;
        int i10;
        k4.S s8;
        int i11;
        l4.o oVar;
        int i12;
        C1082v c1082v;
        int i13;
        m4.j jVar;
        int i14;
        ArrayList arrayList;
        C1248s c1248s;
        int i15;
        ArrayList arrayList2;
        List<p2.d> list;
        q3.k kVar;
        int i16;
        Object obj3;
        List list2;
        C1390O c1390o;
        int i17;
        ArrayList arrayList3;
        switch (this.f3403d) {
            case 0:
                if (interfaceC0617c instanceof U) {
                    u8 = (U) interfaceC0617c;
                    int i18 = u8.f3401h;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        u8.f3401h = i18 - Integer.MIN_VALUE;
                        Object obj4 = u8.f3400g;
                        i4 = u8.f3401h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj4);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj4);
                            List list3 = ((I3.b) obj).f2089a;
                            if (list3 != null) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj5 : list3) {
                                    if (((C0902b) obj5).f11797i) {
                                        arrayList4.add(obj5);
                                    }
                                }
                                obj2 = new ArrayList(AbstractC0438m.d0(arrayList4, 10));
                                Iterator it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    obj2.add(AbstractC1638C.T((C0902b) it.next(), this.f3405f, true, !r1.d()));
                                }
                            } else {
                                obj2 = a6.s.f7766d;
                            }
                            u8.f3401h = 1;
                            Object n3 = this.f3404e.n(obj2, u8);
                            Object obj6 = EnumC0646a.f10656d;
                            if (n3 == obj6) {
                                return obj6;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                u8 = new U(this, interfaceC0617c);
                Object obj42 = u8.f3400g;
                i4 = u8.f3401h;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            case 1:
                if (interfaceC0617c instanceof Z3.K) {
                    k = (Z3.K) interfaceC0617c;
                    int i19 = k.f7343h;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        k.f7343h = i19 - Integer.MIN_VALUE;
                        Object obj7 = k.f7342g;
                        i8 = k.f7343h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj7);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj7);
                            f2.o oVar2 = (f2.o) obj;
                            List list4 = oVar2.f10756g;
                            Iterator it2 = list4.iterator();
                            int i20 = 0;
                            int i21 = 0;
                            int i22 = 0;
                            while (it2.hasNext()) {
                                int ordinal = ((C0880a) it2.next()).f11756d.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal == 2) {
                                            i21++;
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        i22++;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            boolean z8 = !oVar2.f10754e;
                            boolean isEmpty = list4.isEmpty();
                            Context context = this.f3405f;
                            if (isEmpty) {
                                string = context.getString(R.string.field_select_toggle_events_title_empty);
                                o6.j.d(string, "getString(...)");
                            } else {
                                string = context.getString(R.string.field_select_toggle_events_title, Integer.valueOf(list4.size()));
                                o6.j.d(string, "getString(...)");
                            }
                            String str = string;
                            if (list4.isEmpty()) {
                                num = new Integer(R.string.field_select_toggle_events_desc_empty);
                            } else {
                                num = null;
                            }
                            C0366a c0366a = new C0366a(z8, str, i20, i21, i22, num);
                            k.f7343h = 1;
                            Object n8 = this.f3404e.n(c0366a, k);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n8 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                k = new Z3.K(this, interfaceC0617c);
                Object obj72 = k.f7342g;
                i8 = k.f7343h;
                if (i8 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0617c instanceof C0938x) {
                    c0938x = (C0938x) interfaceC0617c;
                    int i23 = c0938x.f11904h;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c0938x.f11904h = i23 - Integer.MIN_VALUE;
                        Object obj8 = c0938x.f11903g;
                        i9 = c0938x.f11904h;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                Z5.a.d(obj8);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj8);
                            C1304a c1304a = (C1304a) obj;
                            String string2 = this.f3405f.getString(R.string.item_desc_dumb_click_on_position, new Integer(c1304a.f13683h.x), new Integer(c1304a.f13683h.y));
                            c0938x.f11904h = 1;
                            Object n9 = this.f3404e.n(string2, c0938x);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n9 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c0938x = new C0938x(this, interfaceC0617c);
                Object obj82 = c0938x.f11903g;
                i9 = c0938x.f11904h;
                if (i9 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (interfaceC0617c instanceof C0963j) {
                    c0963j = (C0963j) interfaceC0617c;
                    int i24 = c0963j.f11994h;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c0963j.f11994h = i24 - Integer.MIN_VALUE;
                        Object obj9 = c0963j.f11993g;
                        i10 = c0963j.f11994h;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                Z5.a.d(obj9);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj9);
                            List list5 = (List) obj;
                            ArrayList arrayList5 = new ArrayList(AbstractC0438m.d0(list5, 10));
                            Iterator it3 = list5.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(new C0959f(AbstractC0862a.z((p2.d) it3.next(), this.f3405f, 6)));
                            }
                            c0963j.f11994h = 1;
                            Object n10 = this.f3404e.n(arrayList5, c0963j);
                            EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                            if (n10 == enumC0646a3) {
                                return enumC0646a3;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c0963j = new C0963j(this, interfaceC0617c);
                Object obj92 = c0963j.f11993g;
                i10 = c0963j.f11994h;
                if (i10 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (interfaceC0617c instanceof k4.S) {
                    s8 = (k4.S) interfaceC0617c;
                    int i25 = s8.f12050h;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        s8.f12050h = i25 - Integer.MIN_VALUE;
                        Object obj10 = s8.f12049g;
                        i11 = s8.f12050h;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                Z5.a.d(obj10);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj10);
                            C0902b c0902b = (C0902b) obj;
                            int i26 = c0902b.f11796h;
                            Rect rect = c0902b.j;
                            if (rect == null) {
                                rect = c0902b.f11794f;
                            }
                            String string3 = this.f3405f.getString(R.string.field_select_detection_area_desc, Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                            o6.j.d(string3, "getString(...)");
                            C0978j c0978j = new C0978j(string3, i26);
                            s8.f12050h = 1;
                            Object n11 = this.f3404e.n(c0978j, s8);
                            EnumC0646a enumC0646a4 = EnumC0646a.f10656d;
                            if (n11 == enumC0646a4) {
                                return enumC0646a4;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                s8 = new k4.S(this, interfaceC0617c);
                Object obj102 = s8.f12049g;
                i11 = s8.f12050h;
                if (i11 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0617c instanceof l4.o) {
                    oVar = (l4.o) interfaceC0617c;
                    int i27 = oVar.f12285h;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        oVar.f12285h = i27 - Integer.MIN_VALUE;
                        Object obj11 = oVar.f12284g;
                        i12 = oVar.f12285h;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                Z5.a.d(obj11);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj11);
                            Iterable iterable = ((I3.b) obj).f2089a;
                            if (iterable == null) {
                                iterable = a6.s.f7766d;
                            }
                            ArrayList arrayList6 = new ArrayList(AbstractC0438m.d0(iterable, 10));
                            int i28 = 0;
                            for (Object obj12 : iterable) {
                                int i29 = i28 + 1;
                                if (i28 >= 0) {
                                    C0902b c0902b2 = (C0902b) obj12;
                                    arrayList6.add(new G1.a(c0902b2.f11789a, AbstractC1638C.T(c0902b2, this.f3405f, false, !((Boolean) r12.f2090b.get(i28)).booleanValue())));
                                    i28 = i29;
                                } else {
                                    AbstractC0437l.c0();
                                    throw null;
                                }
                            }
                            oVar.f12285h = 1;
                            Object n12 = this.f3404e.n(arrayList6, oVar);
                            EnumC0646a enumC0646a5 = EnumC0646a.f10656d;
                            if (n12 == enumC0646a5) {
                                return enumC0646a5;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                oVar = new l4.o(this, interfaceC0617c);
                Object obj112 = oVar.f12284g;
                i12 = oVar.f12285h;
                if (i12 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC0617c instanceof C1082v) {
                    c1082v = (C1082v) interfaceC0617c;
                    int i30 = c1082v.f12484h;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        c1082v.f12484h = i30 - Integer.MIN_VALUE;
                        Object obj13 = c1082v.f12483g;
                        i13 = c1082v.f12484h;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                Z5.a.d(obj13);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj13);
                            p2.c cVar = (p2.c) obj;
                            Point point = cVar.f13697h;
                            Point point2 = cVar.f13698i;
                            String string4 = this.f3405f.getString(R.string.item_desc_dumb_swipe_positions, new Integer(point.x), new Integer(cVar.f13697h.y), new Integer(point2.x), new Integer(point2.y));
                            c1082v.f12484h = 1;
                            Object n13 = this.f3404e.n(string4, c1082v);
                            EnumC0646a enumC0646a6 = EnumC0646a.f10656d;
                            if (n13 == enumC0646a6) {
                                return enumC0646a6;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1082v = new C1082v(this, interfaceC0617c);
                Object obj132 = c1082v.f12483g;
                i13 = c1082v.f12484h;
                if (i13 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC0617c instanceof m4.j) {
                    jVar = (m4.j) interfaceC0617c;
                    int i31 = jVar.f12516h;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        jVar.f12516h = i31 - Integer.MIN_VALUE;
                        Object obj14 = jVar.f12515g;
                        i14 = jVar.f12516h;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                Z5.a.d(obj14);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj14);
                            List list6 = ((I3.b) obj).f2089a;
                            if (list6 != null) {
                                arrayList = new ArrayList(AbstractC0438m.d0(list6, 10));
                                Iterator it4 = list6.iterator();
                                while (it4.hasNext()) {
                                    arrayList.add(D2.f.N((j2.g) it4.next(), this.f3405f, !r1.d()));
                                }
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                jVar.f12516h = 1;
                                Object n14 = this.f3404e.n(arrayList, jVar);
                                EnumC0646a enumC0646a7 = EnumC0646a.f10656d;
                                if (n14 == enumC0646a7) {
                                    return enumC0646a7;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                jVar = new m4.j(this, interfaceC0617c);
                Object obj142 = jVar.f12515g;
                i14 = jVar.f12516h;
                if (i14 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (interfaceC0617c instanceof C1248s) {
                    c1248s = (C1248s) interfaceC0617c;
                    int i32 = c1248s.f13484h;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        c1248s.f13484h = i32 - Integer.MIN_VALUE;
                        Object obj15 = c1248s.f13483g;
                        i15 = c1248s.f13484h;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                Z5.a.d(obj15);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj15);
                            p2.e eVar = (p2.e) obj;
                            if (eVar != null && (list = eVar.f13701c) != null) {
                                arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
                                for (p2.d dVar : list) {
                                    arrayList2.add(new G1.a(dVar.getId(), AbstractC0862a.z(dVar, this.f3405f, 4)));
                                }
                            } else {
                                arrayList2 = null;
                            }
                            c1248s.f13484h = 1;
                            Object n15 = this.f3404e.n(arrayList2, c1248s);
                            EnumC0646a enumC0646a8 = EnumC0646a.f10656d;
                            if (n15 == enumC0646a8) {
                                return enumC0646a8;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1248s = new C1248s(this, interfaceC0617c);
                Object obj152 = c1248s.f13483g;
                i15 = c1248s.f13484h;
                if (i15 == 0) {
                }
                return Z5.y.f7506a;
            case 9:
                if (interfaceC0617c instanceof q3.k) {
                    kVar = (q3.k) interfaceC0617c;
                    int i33 = kVar.f14002h;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        kVar.f14002h = i33 - Integer.MIN_VALUE;
                        Object obj16 = kVar.f14001g;
                        i16 = kVar.f14002h;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                Z5.a.d(obj16);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj16);
                            p2.e eVar2 = (p2.e) obj;
                            if (eVar2 != null && (list2 = eVar2.f13701c) != null) {
                                obj3 = new ArrayList(AbstractC0438m.d0(list2, 10));
                                Iterator it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    obj3.add(AbstractC0862a.z((p2.d) it5.next(), this.f3405f, 6));
                                }
                            } else {
                                obj3 = a6.s.f7766d;
                            }
                            kVar.f14002h = 1;
                            Object n16 = this.f3404e.n(obj3, kVar);
                            Object obj17 = EnumC0646a.f10656d;
                            if (n16 == obj17) {
                                return obj17;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                kVar = new q3.k(this, interfaceC0617c);
                Object obj162 = kVar.f14001g;
                i16 = kVar.f14002h;
                if (i16 == 0) {
                }
                return Z5.y.f7506a;
            default:
                if (interfaceC0617c instanceof C1390O) {
                    c1390o = (C1390O) interfaceC0617c;
                    int i34 = c1390o.f14052h;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        c1390o.f14052h = i34 - Integer.MIN_VALUE;
                        Object obj18 = c1390o.f14051g;
                        i17 = c1390o.f14052h;
                        if (i17 == 0) {
                            if (i17 == 1) {
                                Z5.a.d(obj18);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj18);
                            List list7 = ((I3.b) obj).f2089a;
                            if (list7 != null) {
                                arrayList3 = new ArrayList(AbstractC0438m.d0(list7, 10));
                                Iterator it6 = list7.iterator();
                                while (it6.hasNext()) {
                                    arrayList3.add(AbstractC1638C.T((C0902b) it6.next(), this.f3405f, true, !r1.d()));
                                }
                            } else {
                                arrayList3 = null;
                            }
                            if (arrayList3 != null) {
                                c1390o.f14052h = 1;
                                Object n17 = this.f3404e.n(arrayList3, c1390o);
                                EnumC0646a enumC0646a9 = EnumC0646a.f10656d;
                                if (n17 == enumC0646a9) {
                                    return enumC0646a9;
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1390o = new C1390O(this, interfaceC0617c);
                Object obj182 = c1390o.f14051g;
                i17 = c1390o.f14052h;
                if (i17 == 0) {
                }
                return Z5.y.f7506a;
        }
    }

    public /* synthetic */ V(InterfaceC0234g interfaceC0234g, androidx.lifecycle.Z z8, Context context, int i4) {
        this.f3403d = i4;
        this.f3404e = interfaceC0234g;
        this.f3405f = context;
    }
}
