package L3;

import O7.C0230c;
import O7.C0231d;
import O7.C0251y;
import O7.InterfaceC0234g;
import O7.X;
import O7.b0;
import P7.AbstractC0285b;
import X.C0346n;
import a0.C0407b;
import a6.AbstractC0437l;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.buzbuz.smartautoclicker.core.database.ScenarioDatabase;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import j2.C0902b;
import j2.C0905e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k4.T;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import n6.InterfaceC1164c;
import o4.C1252A;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class M implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2812f;

    public M(C0231d c0231d, o6.u uVar, InterfaceC0234g interfaceC0234g) {
        this.f2810d = 4;
        this.f2812f = uVar;
        this.f2811e = interfaceC0234g;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i4, InterfaceC0617c interfaceC0617c) {
        b0 b0Var;
        int i8;
        if (interfaceC0617c instanceof b0) {
            b0Var = (b0) interfaceC0617c;
            int i9 = b0Var.f4125i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                b0Var.f4125i = i9 - Integer.MIN_VALUE;
                Object obj = b0Var.f4123g;
                i8 = b0Var.f4125i;
                Z5.y yVar = Z5.y.f7506a;
                if (i8 == 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                if (i4 > 0) {
                    o6.r rVar = (o6.r) this.f2812f;
                    if (!rVar.f13639d) {
                        rVar.f13639d = true;
                        InterfaceC0234g interfaceC0234g = (InterfaceC0234g) this.f2811e;
                        b0Var.f4125i = 1;
                        Object n3 = interfaceC0234g.n(X.f4109d, b0Var);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (n3 == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                }
                return yVar;
            }
        }
        b0Var = new b0(this, interfaceC0617c);
        Object obj2 = b0Var.f4123g;
        i8 = b0Var.f4125i;
        Z5.y yVar2 = Z5.y.f7506a;
        if (i8 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, n6.c] */
    /* JADX WARN: Type inference failed for: r5v10, types: [Q2.j] */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        L l6;
        int i4;
        D2.d dVar;
        L4.b bVar;
        int i8;
        boolean z8;
        M3.D d2;
        int i9;
        EnumC0646a enumC0646a;
        InterfaceC0234g interfaceC0234g;
        int i10;
        Bitmap bitmap;
        N1.b bVar2;
        int i11;
        C0230c c0230c;
        int i12;
        C0251y c0251y;
        int i13;
        boolean z9;
        Object obj2;
        Object obj3;
        M m6;
        O7.B b4;
        Object obj4;
        int i14;
        M m8;
        O7.J j;
        int i15;
        EnumC0646a enumC0646a2;
        Object obj5;
        InterfaceC0234g interfaceC0234g2;
        c2.j jVar;
        int i16;
        T t8;
        Object obj6;
        int i17;
        EnumC0646a enumC0646a3;
        InterfaceC0234g interfaceC0234g3;
        int i18;
        l4.n nVar;
        int i19;
        C0902b c0902b;
        Q2.i iVar;
        C1252A c1252a;
        int i20;
        D2.d dVar2;
        switch (this.f2810d) {
            case 0:
                S s8 = (S) this.f2812f;
                if (interfaceC0617c instanceof L) {
                    l6 = (L) interfaceC0617c;
                    int i21 = l6.f2808h;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        l6.f2808h = i21 - Integer.MIN_VALUE;
                        Object obj7 = l6.f2807g;
                        i4 = l6.f2808h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj7);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj7);
                            InterfaceC0234g interfaceC0234g4 = (InterfaceC0234g) this.f2811e;
                            int ordinal = ((f2.c) obj).f10685f.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        dVar = s8.f2827d;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    dVar = s8.f2828e;
                                }
                            } else {
                                dVar = s8.f2826c;
                            }
                            l6.f2808h = 1;
                            Object n3 = interfaceC0234g4.n(dVar, l6);
                            EnumC0646a enumC0646a4 = EnumC0646a.f10656d;
                            if (n3 == enumC0646a4) {
                                return enumC0646a4;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                l6 = new L(this, interfaceC0617c);
                Object obj72 = l6.f2807g;
                i4 = l6.f2808h;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            case 1:
                if (interfaceC0617c instanceof L4.b) {
                    bVar = (L4.b) interfaceC0617c;
                    int i22 = bVar.f2899h;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        bVar.f2899h = i22 - Integer.MIN_VALUE;
                        Object obj8 = bVar.f2898g;
                        i8 = bVar.f2899h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj8);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj8);
                            InterfaceC0234g interfaceC0234g5 = (InterfaceC0234g) this.f2811e;
                            List list = (List) obj;
                            List list2 = ((L4.j) this.f2812f).f2920c.f1387a;
                            ArrayList arrayList = new ArrayList();
                            int i23 = 0;
                            for (Object obj9 : list2) {
                                int i24 = i23 + 1;
                                M4.c cVar = null;
                                if (i23 >= 0) {
                                    F4.k kVar = (F4.k) obj9;
                                    if (i23 <= 2) {
                                        if (i23 != 0 && i23 > list.size()) {
                                            z8 = false;
                                        } else {
                                            z8 = true;
                                        }
                                        o6.j.e(kVar, "<this>");
                                        cVar = new M4.c(kVar.f1395a, kVar.f1396b, z8);
                                    }
                                    if (cVar != null) {
                                        arrayList.add(cVar);
                                    }
                                    i23 = i24;
                                } else {
                                    AbstractC0437l.c0();
                                    throw null;
                                }
                            }
                            bVar.f2899h = 1;
                            Object n8 = interfaceC0234g5.n(arrayList, bVar);
                            EnumC0646a enumC0646a5 = EnumC0646a.f10656d;
                            if (n8 == enumC0646a5) {
                                return enumC0646a5;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                bVar = new L4.b(this, interfaceC0617c);
                Object obj82 = bVar.f2898g;
                i8 = bVar.f2899h;
                if (i8 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0617c instanceof M3.D) {
                    d2 = (M3.D) interfaceC0617c;
                    int i25 = d2.f3344h;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        d2.f3344h = i25 - Integer.MIN_VALUE;
                        Object obj10 = d2.f3343g;
                        i9 = d2.f3344h;
                        enumC0646a = EnumC0646a.f10656d;
                        if (i9 == 0) {
                            if (i9 != 1) {
                                if (i9 == 2) {
                                    Z5.a.d(obj10);
                                    return Z5.y.f7506a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = d2.k;
                            interfaceC0234g = d2.j;
                            Z5.a.d(obj10);
                        } else {
                            Z5.a.d(obj10);
                            interfaceC0234g = (InterfaceC0234g) this.f2811e;
                            C0902b c0902b2 = (C0902b) obj;
                            if (c0902b2 != null) {
                                q1.e eVar = ((M3.H) this.f2812f).f3355b;
                                d2.j = interfaceC0234g;
                                d2.k = 0;
                                d2.f3344h = 1;
                                Bitmap w8 = AbstractC1638C.w(eVar, c0902b2);
                                if (w8 != enumC0646a) {
                                    obj10 = w8;
                                    i10 = 0;
                                } else {
                                    return enumC0646a;
                                }
                            } else {
                                i10 = 0;
                                bitmap = null;
                                d2.j = null;
                                d2.k = i10;
                                d2.f3344h = 2;
                                if (interfaceC0234g.n(bitmap, d2) == enumC0646a) {
                                    return enumC0646a;
                                }
                                return Z5.y.f7506a;
                            }
                        }
                        bitmap = (Bitmap) obj10;
                        d2.j = null;
                        d2.k = i10;
                        d2.f3344h = 2;
                        if (interfaceC0234g.n(bitmap, d2) == enumC0646a) {
                        }
                        return Z5.y.f7506a;
                    }
                }
                d2 = new M3.D(this, interfaceC0617c);
                Object obj102 = d2.f3343g;
                i9 = d2.f3344h;
                enumC0646a = EnumC0646a.f10656d;
                if (i9 == 0) {
                }
                bitmap = (Bitmap) obj102;
                d2.j = null;
                d2.k = i10;
                d2.f3344h = 2;
                if (interfaceC0234g.n(bitmap, d2) == enumC0646a) {
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (interfaceC0617c instanceof N1.b) {
                    bVar2 = (N1.b) interfaceC0617c;
                    int i26 = bVar2.f3708h;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        bVar2.f3708h = i26 - Integer.MIN_VALUE;
                        Object obj11 = bVar2.f3707g;
                        i11 = bVar2.f3708h;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                Z5.a.d(obj11);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj11);
                            InterfaceC0234g interfaceC0234g6 = (InterfaceC0234g) this.f2811e;
                            N1.d a3 = N1.c.a((N1.c) this.f2812f, (C0407b) obj);
                            bVar2.f3708h = 1;
                            Object n9 = interfaceC0234g6.n(a3, bVar2);
                            EnumC0646a enumC0646a6 = EnumC0646a.f10656d;
                            if (n9 == enumC0646a6) {
                                return enumC0646a6;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                bVar2 = new N1.b(this, interfaceC0617c);
                Object obj112 = bVar2.f3707g;
                i11 = bVar2.f3708h;
                if (i11 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.u uVar = (o6.u) this.f2812f;
                if (interfaceC0617c instanceof C0230c) {
                    c0230c = (C0230c) interfaceC0617c;
                    int i27 = c0230c.f4128i;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c0230c.f4128i = i27 - Integer.MIN_VALUE;
                        Object obj12 = c0230c.f4126g;
                        i12 = c0230c.f4128i;
                        Z5.y yVar = Z5.y.f7506a;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                Z5.a.d(obj12);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj12);
                        Object obj13 = uVar.f13642d;
                        if (obj13 == AbstractC0285b.f4640b || !o6.j.a(obj13, obj)) {
                            uVar.f13642d = obj;
                            InterfaceC0234g interfaceC0234g7 = (InterfaceC0234g) this.f2811e;
                            c0230c.f4128i = 1;
                            Object n10 = interfaceC0234g7.n(obj, c0230c);
                            EnumC0646a enumC0646a7 = EnumC0646a.f10656d;
                            if (n10 == enumC0646a7) {
                                return enumC0646a7;
                            }
                            return yVar;
                        }
                        return yVar;
                    }
                }
                c0230c = new C0230c(this, interfaceC0617c);
                Object obj122 = c0230c.f4126g;
                i12 = c0230c.f4128i;
                Z5.y yVar2 = Z5.y.f7506a;
                if (i12 == 0) {
                }
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0617c instanceof C0251y) {
                    c0251y = (C0251y) interfaceC0617c;
                    int i28 = c0251y.f4199i;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        c0251y.f4199i = i28 - Integer.MIN_VALUE;
                        Object obj14 = c0251y.f4198h;
                        i13 = c0251y.f4199i;
                        z9 = true;
                        EnumC0646a enumC0646a8 = EnumC0646a.f10656d;
                        if (i13 == 0) {
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    m6 = c0251y.f4197g;
                                    Z5.a.d(obj14);
                                    if (z9) {
                                        return Z5.y.f7506a;
                                    }
                                    throw new AbortFlowException(m6);
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj15 = c0251y.k;
                            M m9 = c0251y.f4197g;
                            Z5.a.d(obj14);
                            obj3 = obj15;
                            m6 = m9;
                            obj2 = obj14;
                        } else {
                            Z5.a.d(obj14);
                            C0346n c0346n = (C0346n) this.f2812f;
                            c0251y.f4197g = this;
                            c0251y.k = obj;
                            c0251y.f4199i = 1;
                            Object l8 = c0346n.l(obj, c0251y);
                            if (l8 != enumC0646a8) {
                                obj2 = l8;
                                obj3 = obj;
                                m6 = this;
                            } else {
                                return enumC0646a8;
                            }
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            InterfaceC0234g interfaceC0234g8 = (InterfaceC0234g) m6.f2811e;
                            c0251y.f4197g = m6;
                            c0251y.k = null;
                            c0251y.f4199i = 2;
                            if (interfaceC0234g8.n(obj3, c0251y) == enumC0646a8) {
                                return enumC0646a8;
                            }
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                    }
                }
                c0251y = new C0251y(this, interfaceC0617c);
                Object obj142 = c0251y.f4198h;
                i13 = c0251y.f4199i;
                z9 = true;
                EnumC0646a enumC0646a82 = EnumC0646a.f10656d;
                if (i13 == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
                if (z9) {
                }
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC0617c instanceof O7.B) {
                    b4 = (O7.B) interfaceC0617c;
                    int i29 = b4.f4058i;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        b4.f4058i = i29 - Integer.MIN_VALUE;
                        obj4 = b4.f4057h;
                        i14 = b4.f4058i;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                obj = b4.k;
                                m8 = b4.f4056g;
                                Z5.a.d(obj4);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj4);
                            InterfaceC1164c interfaceC1164c = (InterfaceC1164c) this.f2811e;
                            b4.f4056g = this;
                            b4.k = obj;
                            b4.f4058i = 1;
                            obj4 = interfaceC1164c.l(obj, b4);
                            EnumC0646a enumC0646a9 = EnumC0646a.f10656d;
                            if (obj4 != enumC0646a9) {
                                m8 = this;
                            } else {
                                return enumC0646a9;
                            }
                        }
                        if (((Boolean) obj4).booleanValue()) {
                            return Z5.y.f7506a;
                        }
                        ((o6.u) m8.f2812f).f13642d = obj;
                        throw new AbortFlowException(m8);
                    }
                }
                b4 = new O7.B(this, interfaceC0617c);
                obj4 = b4.f4057h;
                i14 = b4.f4058i;
                if (i14 == 0) {
                }
                if (((Boolean) obj4).booleanValue()) {
                }
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC0617c instanceof O7.J) {
                    j = (O7.J) interfaceC0617c;
                    int i30 = j.f4079h;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        j.f4079h = i30 - Integer.MIN_VALUE;
                        Object obj16 = j.f4078g;
                        i15 = j.f4079h;
                        enumC0646a2 = EnumC0646a.f10656d;
                        if (i15 == 0) {
                            if (i15 != 1) {
                                if (i15 == 2) {
                                    Z5.a.d(obj16);
                                    return Z5.y.f7506a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0234g2 = j.k;
                            obj5 = j.j;
                            Z5.a.d(obj16);
                        } else {
                            Z5.a.d(obj16);
                            InterfaceC0234g interfaceC0234g9 = (InterfaceC0234g) this.f2811e;
                            j.j = obj;
                            j.k = interfaceC0234g9;
                            j.f4079h = 1;
                            if (this.f2812f.l(obj, j) != enumC0646a2) {
                                obj5 = obj;
                                interfaceC0234g2 = interfaceC0234g9;
                            } else {
                                return enumC0646a2;
                            }
                        }
                        j.j = null;
                        j.k = null;
                        j.f4079h = 2;
                        if (interfaceC0234g2.n(obj5, j) == enumC0646a2) {
                            return enumC0646a2;
                        }
                        return Z5.y.f7506a;
                    }
                }
                j = new O7.J(this, interfaceC0617c);
                Object obj162 = j.f4078g;
                i15 = j.f4079h;
                enumC0646a2 = EnumC0646a.f10656d;
                if (i15 == 0) {
                }
                j.j = null;
                j.k = null;
                j.f4079h = 2;
                if (interfaceC0234g2.n(obj5, j) == enumC0646a2) {
                }
                return Z5.y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return a(((Number) obj).intValue(), interfaceC0617c);
            case 9:
                if (interfaceC0617c instanceof c2.j) {
                    jVar = (c2.j) interfaceC0617c;
                    int i31 = jVar.f9541h;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        jVar.f9541h = i31 - Integer.MIN_VALUE;
                        Object obj17 = jVar.f9540g;
                        i16 = jVar.f9541h;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                Z5.a.d(obj17);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj17);
                            InterfaceC0234g interfaceC0234g10 = (InterfaceC0234g) this.f2811e;
                            Boolean valueOf = Boolean.valueOf(o6.j.a((ScenarioDatabase) obj, ((c2.z) this.f2812f).f9601b));
                            jVar.f9541h = 1;
                            Object n11 = interfaceC0234g10.n(valueOf, jVar);
                            EnumC0646a enumC0646a10 = EnumC0646a.f10656d;
                            if (n11 == enumC0646a10) {
                                return enumC0646a10;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                jVar = new c2.j(this, interfaceC0617c);
                Object obj172 = jVar.f9540g;
                i16 = jVar.f9541h;
                if (i16 == 0) {
                }
                return Z5.y.f7506a;
            case 10:
                if (interfaceC0617c instanceof T) {
                    t8 = (T) interfaceC0617c;
                    int i32 = t8.f12053h;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        t8.f12053h = i32 - Integer.MIN_VALUE;
                        obj6 = t8.f12052g;
                        i17 = t8.f12053h;
                        enumC0646a3 = EnumC0646a.f10656d;
                        if (i17 == 0) {
                            if (i17 != 1) {
                                if (i17 == 2) {
                                    Z5.a.d(obj6);
                                    return Z5.y.f7506a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i18 = t8.k;
                            interfaceC0234g3 = t8.j;
                            Z5.a.d(obj6);
                        } else {
                            Z5.a.d(obj6);
                            interfaceC0234g3 = (InterfaceC0234g) this.f2811e;
                            q1.e eVar2 = ((k4.X) this.f2812f).f12064b;
                            t8.j = interfaceC0234g3;
                            t8.k = 0;
                            t8.f12053h = 1;
                            obj6 = AbstractC1638C.w(eVar2, (C0902b) obj);
                            if (obj6 != enumC0646a3) {
                                i18 = 0;
                            } else {
                                return enumC0646a3;
                            }
                        }
                        t8.j = null;
                        t8.k = i18;
                        t8.f12053h = 2;
                        if (interfaceC0234g3.n(obj6, t8) == enumC0646a3) {
                            return enumC0646a3;
                        }
                        return Z5.y.f7506a;
                    }
                }
                t8 = new T(this, interfaceC0617c);
                obj6 = t8.f12052g;
                i17 = t8.f12053h;
                enumC0646a3 = EnumC0646a.f10656d;
                if (i17 == 0) {
                }
                t8.j = null;
                t8.k = i18;
                t8.f12053h = 2;
                if (interfaceC0234g3.n(obj6, t8) == enumC0646a3) {
                }
                return Z5.y.f7506a;
            case 11:
                if (interfaceC0617c instanceof l4.n) {
                    nVar = (l4.n) interfaceC0617c;
                    int i33 = nVar.f12282h;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        nVar.f12282h = i33 - Integer.MIN_VALUE;
                        Object obj18 = nVar.f12281g;
                        i19 = nVar.f12282h;
                        if (i19 == 0) {
                            if (i19 == 1) {
                                Z5.a.d(obj18);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj18);
                            InterfaceC0234g interfaceC0234g11 = (InterfaceC0234g) this.f2811e;
                            Z5.j jVar2 = (Z5.j) obj;
                            Rect rect = null;
                            if (jVar2 != null && (c0902b = (C0902b) jVar2.f7485d) != null) {
                                Point point = ((l4.p) this.f2812f).f12287b.f7104e.f7094a;
                                Bitmap bitmap2 = (Bitmap) jVar2.f7486e;
                                int i34 = c0902b.f11796h;
                                if (i34 != 1) {
                                    if (i34 != 3) {
                                        iVar = Q2.i.f4804f;
                                    } else {
                                        iVar = Q2.i.f4802d;
                                    }
                                } else {
                                    iVar = Q2.i.f4803e;
                                }
                                Rect rect2 = c0902b.f11794f;
                                if (i34 != 1) {
                                    if (i34 != 2) {
                                        if (i34 == 3) {
                                            rect = c0902b.j;
                                        }
                                    } else {
                                        rect = new Rect(0, 0, point.x, point.y);
                                    }
                                } else {
                                    rect = rect2;
                                }
                                rect = new Q2.j(bitmap2, iVar, rect2, rect);
                            }
                            nVar.f12282h = 1;
                            Object n12 = interfaceC0234g11.n(rect, nVar);
                            EnumC0646a enumC0646a11 = EnumC0646a.f10656d;
                            if (n12 == enumC0646a11) {
                                return enumC0646a11;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                nVar = new l4.n(this, interfaceC0617c);
                Object obj182 = nVar.f12281g;
                i19 = nVar.f12282h;
                if (i19 == 0) {
                }
                return Z5.y.f7506a;
            default:
                o4.O o7 = (o4.O) this.f2812f;
                if (interfaceC0617c instanceof C1252A) {
                    c1252a = (C1252A) interfaceC0617c;
                    int i35 = c1252a.f13502h;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        c1252a.f13502h = i35 - Integer.MIN_VALUE;
                        Object obj19 = c1252a.f13501g;
                        i20 = c1252a.f13502h;
                        if (i20 == 0) {
                            if (i20 == 1) {
                                Z5.a.d(obj19);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj19);
                            InterfaceC0234g interfaceC0234g12 = (InterfaceC0234g) this.f2811e;
                            int ordinal2 = ((C0905e) obj).f11812e.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        if (ordinal2 != 3) {
                                            if (ordinal2 == 4) {
                                                dVar2 = o7.f13542d;
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            dVar2 = o7.f13541c;
                                        }
                                    } else {
                                        dVar2 = o7.f13544f;
                                    }
                                } else {
                                    dVar2 = o7.f13545g;
                                }
                            } else {
                                dVar2 = o7.f13543e;
                            }
                            c1252a.f13502h = 1;
                            Object n13 = interfaceC0234g12.n(dVar2, c1252a);
                            EnumC0646a enumC0646a12 = EnumC0646a.f10656d;
                            if (n13 == enumC0646a12) {
                                return enumC0646a12;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c1252a = new C1252A(this, interfaceC0617c);
                Object obj192 = c1252a.f13501g;
                i20 = c1252a.f13502h;
                if (i20 == 0) {
                }
                return Z5.y.f7506a;
        }
    }

    public /* synthetic */ M(Serializable serializable, InterfaceC0234g interfaceC0234g, int i4) {
        this.f2810d = i4;
        this.f2812f = serializable;
        this.f2811e = interfaceC0234g;
    }

    public /* synthetic */ M(Object obj, int i4, Object obj2) {
        this.f2810d = i4;
        this.f2811e = obj;
        this.f2812f = obj2;
    }
}
