package O3;

import O7.InterfaceC0234g;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.content.ComponentName;
import android.os.Build;
import android.text.InputFilter;
import android.util.Log;
import b6.C0535c;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import g1.C0757A;
import g1.C0767a;
import g1.C0768b;
import g1.C0769c;
import g1.C0770d;
import g1.C0771e;
import g1.C0772f;
import g1.C0773g;
import g1.C0774h;
import g1.C0775i;
import g1.C0776j;
import g2.C0777a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class J implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f3879e;

    public /* synthetic */ J(InterfaceC0234g interfaceC0234g, int i4) {
        this.f3878d = i4;
        this.f3879e = interfaceC0234g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(InterfaceC0617c interfaceC0617c, Object obj) {
        S3.i iVar;
        int i4;
        List list;
        ArrayList N8;
        if (interfaceC0617c instanceof S3.i) {
            iVar = (S3.i) interfaceC0617c;
            int i8 = iVar.f5348h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f5348h = i8 - Integer.MIN_VALUE;
                Object obj2 = iVar.f5347g;
                i4 = iVar.f5348h;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj2);
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        if (bool.equals(Boolean.TRUE)) {
                            C0535c i9 = E2.d.i();
                            i9.add(g1.p.k);
                            i9.add(g1.t.k);
                            i9.add(g1.u.k);
                            i9.add(g1.v.k);
                            i9.add(g1.w.k);
                            i9.add(g1.x.k);
                            i9.add(g1.y.k);
                            i9.add(g1.z.k);
                            i9.add(C0757A.k);
                            i9.add(C0772f.k);
                            i9.add(C0773g.k);
                            i9.add(C0774h.k);
                            i9.add(C0775i.k);
                            i9.add(C0776j.k);
                            i9.add(g1.k.k);
                            i9.add(g1.l.k);
                            i9.add(g1.m.k);
                            i9.add(g1.n.k);
                            i9.add(g1.o.k);
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                i9.add(g1.q.k);
                                i9.add(g1.r.k);
                            }
                            if (i10 >= 28) {
                                i9.add(g1.s.k);
                            }
                            i9.addAll(E2.c.W());
                            N8 = E2.b.N(E2.d.f(i9));
                        } else {
                            C0535c i11 = E2.d.i();
                            i11.add(C0767a.k);
                            i11.add(C0768b.k);
                            i11.add(C0769c.k);
                            i11.add(C0770d.k);
                            if (Build.VERSION.SDK_INT >= 26) {
                                i11.add(C0771e.k);
                            }
                            i11.addAll(E2.c.W());
                            N8 = E2.b.N(E2.d.f(i11));
                        }
                        list = AbstractC0436k.L0(N8, new A0.i(9));
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        iVar.f5348h = 1;
                        Object n3 = this.f3879e.n(list, iVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (n3 == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                }
                return Z5.y.f7506a;
            }
        }
        iVar = new S3.i(this, interfaceC0617c);
        Object obj22 = iVar.f5347g;
        i4 = iVar.f5348h;
        if (i4 == 0) {
        }
        return Z5.y.f7506a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0144  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        I i4;
        int i8;
        K k;
        int i9;
        L l6;
        int i10;
        O o7;
        int i11;
        P p8;
        int i12;
        S s8;
        int i13;
        T t8;
        int i14;
        U u8;
        int i15;
        V v8;
        int i16;
        Object obj2;
        W w8;
        int i17;
        Object obj3;
        X x8;
        int i18;
        Z z8;
        int i19;
        O4.i iVar;
        int i20;
        O4.j jVar;
        int i21;
        O4.k kVar;
        int i22;
        O7.I i23;
        int i24;
        P1.r rVar;
        int i25;
        Object obj4;
        Q4.o oVar;
        int i26;
        Q4.q qVar;
        int i27;
        Q4.r rVar2;
        int i28;
        Q4.s sVar;
        int i29;
        R3.o oVar2;
        int i30;
        R3.q qVar2;
        int i31;
        Object yVar;
        D2.d dVar;
        Z5.j jVar2;
        Z5.j jVar3;
        D2.d dVar2;
        R3.s sVar2;
        int i32;
        R3.t tVar;
        int i33;
        R3.u uVar;
        int i34;
        R3.v vVar;
        int i35;
        R4.h hVar;
        int i36;
        S4.i iVar2;
        int i37;
        int i38 = this.f3878d;
        Object obj5 = null;
        boolean z9 = false;
        int i39 = 0;
        boolean z10 = false;
        boolean z11 = false;
        r5 = false;
        boolean z12 = false;
        boolean z13 = false;
        r5 = false;
        boolean z14 = false;
        boolean z15 = false;
        Z5.y yVar2 = Z5.y.f7506a;
        InterfaceC0234g interfaceC0234g = this.f3879e;
        Object obj6 = EnumC0646a.f10656d;
        switch (i38) {
            case 0:
                if (interfaceC0617c instanceof I) {
                    i4 = (I) interfaceC0617c;
                    int i40 = i4.f3876h;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        i4.f3876h = i40 - Integer.MIN_VALUE;
                        Object obj7 = i4.f3875g;
                        i8 = i4.f3876h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj7);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj7);
                        if (obj instanceof f2.f) {
                            i4.f3876h = 1;
                            if (interfaceC0234g.n(obj, i4) == obj6) {
                                return obj6;
                            }
                            return yVar2;
                        }
                        return yVar2;
                    }
                }
                i4 = new I(this, interfaceC0617c);
                Object obj72 = i4.f3875g;
                i8 = i4.f3876h;
                if (i8 == 0) {
                }
            case 1:
                if (interfaceC0617c instanceof K) {
                    k = (K) interfaceC0617c;
                    int i41 = k.f3881h;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        k.f3881h = i41 - Integer.MIN_VALUE;
                        Object obj8 = k.f3880g;
                        i9 = k.f3881h;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                Z5.a.d(obj8);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj8);
                        Object valueOf = Boolean.valueOf(((I3.a) obj).f2087b);
                        k.f3881h = 1;
                        if (interfaceC0234g.n(valueOf, k) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                k = new K(this, interfaceC0617c);
                Object obj82 = k.f3880g;
                i9 = k.f3881h;
                if (i9 == 0) {
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0617c instanceof L) {
                    l6 = (L) interfaceC0617c;
                    int i42 = l6.f3884h;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        l6.f3884h = i42 - Integer.MIN_VALUE;
                        Object obj9 = l6.f3883g;
                        i10 = l6.f3884h;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                Z5.a.d(obj9);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj9);
                        C0535c i43 = E2.d.i();
                        List<C0777a> list = ((I3.b) obj).f2089a;
                        if (list != null) {
                            for (C0777a c0777a : list) {
                                String str = c0777a.f11135c;
                                o6.j.b(str);
                                int m02 = I7.m.m0(str, '.', 4);
                                o6.j.b(str);
                                if (m02 != -1) {
                                    str = str.substring(m02);
                                    o6.j.d(str, "substring(...)");
                                }
                                i43.add(new C0222u(c0777a, str, String.valueOf(c0777a.f11136d)));
                            }
                        }
                        i43.add(C0221t.f3995a);
                        Object f8 = E2.d.f(i43);
                        l6.f3884h = 1;
                        if (interfaceC0234g.n(f8, l6) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                l6 = new L(this, interfaceC0617c);
                Object obj92 = l6.f3883g;
                i10 = l6.f3884h;
                if (i10 == 0) {
                }
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (interfaceC0617c instanceof O) {
                    o7 = (O) interfaceC0617c;
                    int i44 = o7.f3893h;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        o7.f3893h = i44 - Integer.MIN_VALUE;
                        Object obj10 = o7.f3892g;
                        i11 = o7.f3893h;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                Z5.a.d(obj10);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj10);
                        Object valueOf2 = Boolean.valueOf(((I3.a) obj).f2088c);
                        o7.f3893h = 1;
                        if (interfaceC0234g.n(valueOf2, o7) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                o7 = new O(this, interfaceC0617c);
                Object obj102 = o7.f3892g;
                i11 = o7.f3893h;
                if (i11 == 0) {
                }
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (interfaceC0617c instanceof P) {
                    p8 = (P) interfaceC0617c;
                    int i45 = p8.f3896h;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        p8.f3896h = i45 - Integer.MIN_VALUE;
                        Object obj11 = p8.f3895g;
                        i12 = p8.f3896h;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                Z5.a.d(obj11);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj11);
                        Object obj12 = ((f2.f) obj).f10701c;
                        p8.f3896h = 1;
                        if (interfaceC0234g.n(obj12, p8) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                p8 = new P(this, interfaceC0617c);
                Object obj112 = p8.f3895g;
                i12 = p8.f3896h;
                if (i12 == 0) {
                }
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0617c instanceof S) {
                    s8 = (S) interfaceC0617c;
                    int i46 = s8.f3901h;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        s8.f3901h = i46 - Integer.MIN_VALUE;
                        Object obj13 = s8.f3900g;
                        i13 = s8.f3901h;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                Z5.a.d(obj13);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj13);
                        String str2 = ((f2.f) obj).f10701c;
                        if (str2 == null || str2.length() == 0) {
                            z9 = true;
                        }
                        Object valueOf3 = Boolean.valueOf(z9);
                        s8.f3901h = 1;
                        if (interfaceC0234g.n(valueOf3, s8) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                s8 = new S(this, interfaceC0617c);
                Object obj132 = s8.f3900g;
                i13 = s8.f3901h;
                if (i13 == 0) {
                }
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC0617c instanceof T) {
                    t8 = (T) interfaceC0617c;
                    int i47 = t8.f3904h;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        t8.f3904h = i47 - Integer.MIN_VALUE;
                        Object obj14 = t8.f3903g;
                        i14 = t8.f3904h;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                Z5.a.d(obj14);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj14);
                        Object obj15 = ((f2.f) obj).f10705g;
                        t8.f3904h = 1;
                        if (interfaceC0234g.n(obj15, t8) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                t8 = new T(this, interfaceC0617c);
                Object obj142 = t8.f3903g;
                i14 = t8.f3904h;
                if (i14 == 0) {
                }
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC0617c instanceof U) {
                    u8 = (U) interfaceC0617c;
                    int i48 = u8.f3907h;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        u8.f3907h = i48 - Integer.MIN_VALUE;
                        Object obj16 = u8.f3906g;
                        i15 = u8.f3907h;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                Z5.a.d(obj16);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj16);
                        String str3 = ((f2.f) obj).f10705g;
                        if (str3 == null || str3.length() == 0) {
                            z15 = true;
                        }
                        Object valueOf4 = Boolean.valueOf(z15);
                        u8.f3907h = 1;
                        if (interfaceC0234g.n(valueOf4, u8) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                u8 = new U(this, interfaceC0617c);
                Object obj162 = u8.f3906g;
                i15 = u8.f3907h;
                if (i15 == 0) {
                }
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (interfaceC0617c instanceof V) {
                    v8 = (V) interfaceC0617c;
                    int i49 = v8.f3910h;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        v8.f3910h = i49 - Integer.MIN_VALUE;
                        Object obj17 = v8.f3909g;
                        i16 = v8.f3910h;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                Z5.a.d(obj17);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj17);
                        Integer num = ((f2.f) obj).f10707i;
                        if (num == null || (obj2 = num.toString()) == null) {
                            obj2 = "0";
                        }
                        v8.f3910h = 1;
                        if (interfaceC0234g.n(obj2, v8) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                v8 = new V(this, interfaceC0617c);
                Object obj172 = v8.f3909g;
                i16 = v8.f3910h;
                if (i16 == 0) {
                }
                break;
            case 9:
                if (interfaceC0617c instanceof W) {
                    w8 = (W) interfaceC0617c;
                    int i50 = w8.f3913h;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        w8.f3913h = i50 - Integer.MIN_VALUE;
                        Object obj18 = w8.f3912g;
                        i17 = w8.f3913h;
                        if (i17 == 0) {
                            if (i17 == 1) {
                                Z5.a.d(obj18);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj18);
                        ComponentName componentName = ((f2.f) obj).f10706h;
                        if (componentName != null) {
                            obj3 = componentName.flattenToString();
                        } else {
                            obj3 = null;
                        }
                        w8.f3913h = 1;
                        if (interfaceC0234g.n(obj3, w8) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                w8 = new W(this, interfaceC0617c);
                Object obj182 = w8.f3912g;
                i17 = w8.f3913h;
                if (i17 == 0) {
                }
            case 10:
                if (interfaceC0617c instanceof X) {
                    x8 = (X) interfaceC0617c;
                    int i51 = x8.f3916h;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        x8.f3916h = i51 - Integer.MIN_VALUE;
                        Object obj19 = x8.f3915g;
                        i18 = x8.f3916h;
                        if (i18 == 0) {
                            if (i18 == 1) {
                                Z5.a.d(obj19);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj19);
                        f2.f fVar = (f2.f) obj;
                        if (!fVar.f10704f && fVar.f10706h == null) {
                            z14 = true;
                        }
                        Object valueOf5 = Boolean.valueOf(z14);
                        x8.f3916h = 1;
                        if (interfaceC0234g.n(valueOf5, x8) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                x8 = new X(this, interfaceC0617c);
                Object obj192 = x8.f3915g;
                i18 = x8.f3916h;
                if (i18 == 0) {
                }
                break;
            case 11:
                if (interfaceC0617c instanceof Z) {
                    z8 = (Z) interfaceC0617c;
                    int i52 = z8.f3922h;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        z8.f3922h = i52 - Integer.MIN_VALUE;
                        Object obj20 = z8.f3921g;
                        i19 = z8.f3922h;
                        if (i19 == 0) {
                            if (i19 == 1) {
                                Z5.a.d(obj20);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj20);
                        Object obj21 = ((I3.a) obj).f2086a;
                        if (obj21 != null) {
                            z8.f3922h = 1;
                            if (interfaceC0234g.n(obj21, z8) == obj6) {
                                return obj6;
                            }
                            return yVar2;
                        }
                        return yVar2;
                    }
                }
                z8 = new Z(this, interfaceC0617c);
                Object obj202 = z8.f3921g;
                i19 = z8.f3922h;
                if (i19 == 0) {
                }
            case 12:
                if (interfaceC0617c instanceof O4.i) {
                    iVar = (O4.i) interfaceC0617c;
                    int i53 = iVar.f4023h;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        iVar.f4023h = i53 - Integer.MIN_VALUE;
                        Object obj22 = iVar.f4022g;
                        i20 = iVar.f4023h;
                        if (i20 == 0) {
                            if (i20 == 1) {
                                Z5.a.d(obj22);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj22);
                        if (obj instanceof M4.e) {
                            iVar.f4023h = 1;
                            if (interfaceC0234g.n(obj, iVar) == obj6) {
                                return obj6;
                            }
                            return yVar2;
                        }
                        return yVar2;
                    }
                }
                iVar = new O4.i(this, interfaceC0617c);
                Object obj222 = iVar.f4022g;
                i20 = iVar.f4023h;
                if (i20 == 0) {
                }
            case 13:
                if (interfaceC0617c instanceof O4.j) {
                    jVar = (O4.j) interfaceC0617c;
                    int i54 = jVar.f4026h;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        jVar.f4026h = i54 - Integer.MIN_VALUE;
                        Object obj23 = jVar.f4025g;
                        i21 = jVar.f4026h;
                        if (i21 == 0) {
                            if (i21 == 1) {
                                Z5.a.d(obj23);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj23);
                        if (((v2.i) obj) == v2.i.f15510d) {
                            z13 = true;
                        }
                        Object valueOf6 = Boolean.valueOf(z13);
                        jVar.f4026h = 1;
                        if (interfaceC0234g.n(valueOf6, jVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                jVar = new O4.j(this, interfaceC0617c);
                Object obj232 = jVar.f4025g;
                i21 = jVar.f4026h;
                if (i21 == 0) {
                }
            case 14:
                if (interfaceC0617c instanceof O4.k) {
                    kVar = (O4.k) interfaceC0617c;
                    int i55 = kVar.f4029h;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        kVar.f4029h = i55 - Integer.MIN_VALUE;
                        Object obj24 = kVar.f4028g;
                        i22 = kVar.f4029h;
                        if (i22 == 0) {
                            if (i22 == 1) {
                                Z5.a.d(obj24);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj24);
                        ((M4.e) obj).getClass();
                        Object obj25 = Boolean.TRUE;
                        kVar.f4029h = 1;
                        if (interfaceC0234g.n(obj25, kVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                kVar = new O4.k(this, interfaceC0617c);
                Object obj242 = kVar.f4028g;
                i22 = kVar.f4029h;
                if (i22 == 0) {
                }
            case 15:
                if (interfaceC0617c instanceof O7.I) {
                    i23 = (O7.I) interfaceC0617c;
                    int i56 = i23.f4076h;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        i23.f4076h = i56 - Integer.MIN_VALUE;
                        Object obj26 = i23.f4075g;
                        i24 = i23.f4076h;
                        if (i24 == 0) {
                            if (i24 == 1) {
                                Z5.a.d(obj26);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj26);
                        if (obj != null) {
                            i23.f4076h = 1;
                            if (interfaceC0234g.n(obj, i23) == obj6) {
                                return obj6;
                            }
                            return yVar2;
                        }
                        return yVar2;
                    }
                }
                i23 = new O7.I(this, interfaceC0617c);
                Object obj262 = i23.f4075g;
                i24 = i23.f4076h;
                if (i24 == 0) {
                }
            case 16:
                if (interfaceC0617c instanceof P1.r) {
                    rVar = (P1.r) interfaceC0617c;
                    int i57 = rVar.f4480h;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        rVar.f4480h = i57 - Integer.MIN_VALUE;
                        Object obj27 = rVar.f4479g;
                        i25 = rVar.f4480h;
                        if (i25 == 0) {
                            if (i25 == 1) {
                                Z5.a.d(obj27);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj27);
                        N1.d dVar3 = (N1.d) obj;
                        List list2 = P1.w.f4488i;
                        if (dVar3.f3715a == -1) {
                            obj4 = P1.c.f4455b;
                        } else if (dVar3.f3716b != -1) {
                            Log.i("QualityManager", "Smart AutoClicker has crashed during it's last session !");
                            obj4 = P1.a.f4453b;
                        } else {
                            Log.i("QualityManager", "Accessibility service permission was removed !");
                            obj4 = P1.b.f4454b;
                        }
                        rVar.f4480h = 1;
                        if (interfaceC0234g.n(obj4, rVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                rVar = new P1.r(this, interfaceC0617c);
                Object obj272 = rVar.f4479g;
                i25 = rVar.f4480h;
                if (i25 == 0) {
                }
            case 17:
                if (interfaceC0617c instanceof Q4.o) {
                    oVar = (Q4.o) interfaceC0617c;
                    int i58 = oVar.f4884h;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        oVar.f4884h = i58 - Integer.MIN_VALUE;
                        Object obj28 = oVar.f4883g;
                        i26 = oVar.f4884h;
                        if (i26 == 0) {
                            if (i26 == 1) {
                                Z5.a.d(obj28);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj28);
                        Object num2 = new Integer(((N4.c) obj).f3770d);
                        oVar.f4884h = 1;
                        if (interfaceC0234g.n(num2, oVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                oVar = new Q4.o(this, interfaceC0617c);
                Object obj282 = oVar.f4883g;
                i26 = oVar.f4884h;
                if (i26 == 0) {
                }
            case 18:
                if (interfaceC0617c instanceof Q4.q) {
                    qVar = (Q4.q) interfaceC0617c;
                    int i59 = qVar.f4889h;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        qVar.f4889h = i59 - Integer.MIN_VALUE;
                        Object obj29 = qVar.f4888g;
                        i27 = qVar.f4889h;
                        if (i27 == 0) {
                            if (i27 == 1) {
                                Z5.a.d(obj29);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj29);
                        Object num3 = new Integer(((N4.c) obj).f3769c);
                        qVar.f4889h = 1;
                        if (interfaceC0234g.n(num3, qVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                qVar = new Q4.q(this, interfaceC0617c);
                Object obj292 = qVar.f4888g;
                i27 = qVar.f4889h;
                if (i27 == 0) {
                }
            case 19:
                if (interfaceC0617c instanceof Q4.r) {
                    rVar2 = (Q4.r) interfaceC0617c;
                    int i60 = rVar2.f4892h;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        rVar2.f4892h = i60 - Integer.MIN_VALUE;
                        Object obj30 = rVar2.f4891g;
                        i28 = rVar2.f4892h;
                        if (i28 == 0) {
                            if (i28 == 1) {
                                Z5.a.d(obj30);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj30);
                        Object valueOf7 = Boolean.valueOf(((N4.c) obj).f3767a);
                        rVar2.f4892h = 1;
                        if (interfaceC0234g.n(valueOf7, rVar2) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                rVar2 = new Q4.r(this, interfaceC0617c);
                Object obj302 = rVar2.f4891g;
                i28 = rVar2.f4892h;
                if (i28 == 0) {
                }
            case 20:
                if (interfaceC0617c instanceof Q4.s) {
                    sVar = (Q4.s) interfaceC0617c;
                    int i61 = sVar.f4895h;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        sVar.f4895h = i61 - Integer.MIN_VALUE;
                        Object obj31 = sVar.f4894g;
                        i29 = sVar.f4895h;
                        if (i29 == 0) {
                            if (i29 == 1) {
                                Z5.a.d(obj31);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj31);
                        M4.g gVar = (M4.g) obj;
                        if (gVar != null && (gVar instanceof M4.f)) {
                            z12 = true;
                        }
                        Object valueOf8 = Boolean.valueOf(z12);
                        sVar.f4895h = 1;
                        if (interfaceC0234g.n(valueOf8, sVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                sVar = new Q4.s(this, interfaceC0617c);
                Object obj312 = sVar.f4894g;
                i29 = sVar.f4895h;
                if (i29 == 0) {
                }
                break;
            case 21:
                if (interfaceC0617c instanceof R3.o) {
                    oVar2 = (R3.o) interfaceC0617c;
                    int i62 = oVar2.f5074h;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        oVar2.f5074h = i62 - Integer.MIN_VALUE;
                        Object obj32 = oVar2.f5073g;
                        i30 = oVar2.f5074h;
                        if (i30 == 0) {
                            if (i30 == 1) {
                                Z5.a.d(obj32);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj32);
                        Object obj33 = ((C0777a) obj).f11135c;
                        oVar2.f5074h = 1;
                        if (interfaceC0234g.n(obj33, oVar2) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                oVar2 = new R3.o(this, interfaceC0617c);
                Object obj322 = oVar2.f5073g;
                i30 = oVar2.f5074h;
                if (i30 == 0) {
                }
            case 22:
                if (interfaceC0617c instanceof R3.q) {
                    qVar2 = (R3.q) interfaceC0617c;
                    int i63 = qVar2.f5079h;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        qVar2.f5079h = i63 - Integer.MIN_VALUE;
                        Object obj34 = qVar2.f5078g;
                        i31 = qVar2.f5079h;
                        if (i31 == 0) {
                            if (i31 == 1) {
                                Z5.a.d(obj34);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj34);
                        Object obj35 = ((C0777a) obj).f11136d;
                        if (obj35 != null && !(obj35 instanceof Boolean)) {
                            boolean z16 = obj35 instanceof Byte;
                            Class cls = Float.TYPE;
                            Class cls2 = Double.TYPE;
                            Class cls3 = Integer.TYPE;
                            Class cls4 = Short.TYPE;
                            Class cls5 = Byte.TYPE;
                            if (z16) {
                                jVar2 = new Z5.j(new K2.j(o6.v.f13643a.b(cls5)), 4098);
                            } else if (obj35 instanceof Short) {
                                jVar2 = new Z5.j(new K2.j(o6.v.f13643a.b(cls4)), 4098);
                            } else if (obj35 instanceof Integer) {
                                jVar2 = new Z5.j(new K2.j(o6.v.f13643a.b(cls3)), 4098);
                            } else if (obj35 instanceof Long) {
                                jVar2 = new Z5.j(new K2.j(o6.v.f13643a.b(Long.TYPE)), 4098);
                            } else {
                                if (obj35 instanceof Double) {
                                    jVar3 = new Z5.j(new K2.j(o6.v.f13643a.b(cls2)), 12290);
                                } else if (obj35 instanceof Float) {
                                    jVar3 = new Z5.j(new K2.j(o6.v.f13643a.b(cls)), 12290);
                                } else if (obj35 instanceof Character) {
                                    jVar3 = new Z5.j(new InputFilter.LengthFilter(1), 1);
                                } else if (obj35 instanceof String) {
                                    jVar2 = new Z5.j(null, 1);
                                } else {
                                    throw new IllegalArgumentException("Unsupported value type");
                                }
                                jVar2 = jVar3;
                            }
                            Class<?> cls6 = obj35.getClass();
                            o6.w wVar = o6.v.f13643a;
                            InterfaceC1642c b4 = wVar.b(cls6);
                            D2.d dVar4 = R3.x.f5104a;
                            if (b4.equals(wVar.b(Boolean.TYPE))) {
                                dVar2 = R3.x.f5104a;
                            } else if (b4.equals(wVar.b(cls5))) {
                                dVar2 = R3.x.f5105b;
                            } else if (b4.equals(wVar.b(Character.TYPE))) {
                                dVar2 = R3.x.f5106c;
                            } else if (b4.equals(wVar.b(cls2))) {
                                dVar2 = R3.x.f5107d;
                            } else if (b4.equals(wVar.b(cls))) {
                                dVar2 = R3.x.f5108e;
                            } else if (b4.equals(wVar.b(cls3))) {
                                dVar2 = R3.x.f5109f;
                            } else if (b4.equals(wVar.b(cls4))) {
                                dVar2 = R3.x.f5110g;
                            } else if (b4.equals(wVar.b(String.class))) {
                                dVar2 = R3.x.f5111h;
                            } else {
                                throw new IllegalArgumentException("Unsupported extra type");
                            }
                            yVar = new R3.z(dVar2, ((Number) jVar2.f7486e).intValue(), (InputFilter) jVar2.f7485d, obj35.toString(), obj35);
                        } else {
                            D2.d dVar5 = R3.x.f5104a;
                            if (o6.j.a(obj35, Boolean.TRUE)) {
                                dVar = R3.x.f5112i;
                            } else {
                                dVar = R3.x.j;
                            }
                            yVar = new R3.y(dVar5, dVar);
                        }
                        qVar2.f5079h = 1;
                        if (interfaceC0234g.n(yVar, qVar2) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                qVar2 = new R3.q(this, interfaceC0617c);
                Object obj342 = qVar2.f5078g;
                i31 = qVar2.f5079h;
                if (i31 == 0) {
                }
                break;
            case 23:
                if (interfaceC0617c instanceof R3.s) {
                    sVar2 = (R3.s) interfaceC0617c;
                    int i64 = sVar2.f5085h;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        sVar2.f5085h = i64 - Integer.MIN_VALUE;
                        Object obj36 = sVar2.f5084g;
                        i32 = sVar2.f5085h;
                        if (i32 == 0) {
                            if (i32 == 1) {
                                Z5.a.d(obj36);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj36);
                        String str4 = ((C0777a) obj).f11135c;
                        if (str4 == null || str4.length() == 0) {
                            z11 = true;
                        }
                        Object valueOf9 = Boolean.valueOf(z11);
                        sVar2.f5085h = 1;
                        if (interfaceC0234g.n(valueOf9, sVar2) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                sVar2 = new R3.s(this, interfaceC0617c);
                Object obj362 = sVar2.f5084g;
                i32 = sVar2.f5085h;
                if (i32 == 0) {
                }
                break;
            case 24:
                if (interfaceC0617c instanceof R3.t) {
                    tVar = (R3.t) interfaceC0617c;
                    int i65 = tVar.f5088h;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        tVar.f5088h = i65 - Integer.MIN_VALUE;
                        Object obj37 = tVar.f5087g;
                        i33 = tVar.f5088h;
                        if (i33 == 0) {
                            if (i33 == 1) {
                                Z5.a.d(obj37);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj37);
                        if (((C0777a) obj).f11136d == null) {
                            z10 = true;
                        }
                        Object valueOf10 = Boolean.valueOf(z10);
                        tVar.f5088h = 1;
                        if (interfaceC0234g.n(valueOf10, tVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                tVar = new R3.t(this, interfaceC0617c);
                Object obj372 = tVar.f5087g;
                i33 = tVar.f5088h;
                if (i33 == 0) {
                }
            case 25:
                if (interfaceC0617c instanceof R3.u) {
                    uVar = (R3.u) interfaceC0617c;
                    int i66 = uVar.f5091h;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        uVar.f5091h = i66 - Integer.MIN_VALUE;
                        Object obj38 = uVar.f5090g;
                        i34 = uVar.f5091h;
                        if (i34 == 0) {
                            if (i34 == 1) {
                                Z5.a.d(obj38);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj38);
                        Object valueOf11 = Boolean.valueOf(((I3.a) obj).f2088c);
                        uVar.f5091h = 1;
                        if (interfaceC0234g.n(valueOf11, uVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                uVar = new R3.u(this, interfaceC0617c);
                Object obj382 = uVar.f5090g;
                i34 = uVar.f5091h;
                if (i34 == 0) {
                }
            case 26:
                if (interfaceC0617c instanceof R3.v) {
                    vVar = (R3.v) interfaceC0617c;
                    int i67 = vVar.f5094h;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        vVar.f5094h = i67 - Integer.MIN_VALUE;
                        Object obj39 = vVar.f5093g;
                        i35 = vVar.f5094h;
                        if (i35 == 0) {
                            if (i35 == 1) {
                                Z5.a.d(obj39);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj39);
                        Object obj40 = ((I3.a) obj).f2086a;
                        if (obj40 != null) {
                            vVar.f5094h = 1;
                            if (interfaceC0234g.n(obj40, vVar) == obj6) {
                                return obj6;
                            }
                            return yVar2;
                        }
                        return yVar2;
                    }
                }
                vVar = new R3.v(this, interfaceC0617c);
                Object obj392 = vVar.f5093g;
                i35 = vVar.f5094h;
                if (i35 == 0) {
                }
            case 27:
                if (interfaceC0617c instanceof R4.h) {
                    hVar = (R4.h) interfaceC0617c;
                    int i68 = hVar.f5132h;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        hVar.f5132h = i68 - Integer.MIN_VALUE;
                        Object obj41 = hVar.f5131g;
                        i36 = hVar.f5132h;
                        if (i36 == 0) {
                            if (i36 == 1) {
                                Z5.a.d(obj41);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj41);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj42 : (List) obj) {
                            if (((M4.c) obj42).f3486c) {
                                arrayList.add(obj42);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i69 = i39 + 1;
                            if (i39 >= 0) {
                                M4.c cVar = (M4.c) next;
                                arrayList2.add(new R4.a(cVar.f3484a, cVar.f3485b, i39));
                                i39 = i69;
                            } else {
                                AbstractC0437l.c0();
                                throw null;
                            }
                        }
                        hVar.f5132h = 1;
                        if (interfaceC0234g.n(arrayList2, hVar) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                hVar = new R4.h(this, interfaceC0617c);
                Object obj412 = hVar.f5131g;
                i36 = hVar.f5132h;
                if (i36 == 0) {
                }
            case 28:
                return a(interfaceC0617c, obj);
            default:
                if (interfaceC0617c instanceof S4.i) {
                    iVar2 = (S4.i) interfaceC0617c;
                    int i70 = iVar2.f5383h;
                    if ((i70 & Integer.MIN_VALUE) != 0) {
                        iVar2.f5383h = i70 - Integer.MIN_VALUE;
                        Object obj43 = iVar2.f5382g;
                        i37 = iVar2.f5383h;
                        if (i37 == 0) {
                            if (i37 == 1) {
                                Z5.a.d(obj43);
                                return yVar2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj43);
                        Object obj44 = (M4.g) obj;
                        if (obj44 instanceof M4.f) {
                            obj5 = (M4.f) obj44;
                        }
                        iVar2.f5383h = 1;
                        if (interfaceC0234g.n(obj5, iVar2) == obj6) {
                            return obj6;
                        }
                        return yVar2;
                    }
                }
                iVar2 = new S4.i(this, interfaceC0617c);
                Object obj432 = iVar2.f5382g;
                i37 = iVar2.f5383h;
                if (i37 == 0) {
                }
        }
    }

    public /* synthetic */ J(InterfaceC0234g interfaceC0234g, Object obj, int i4) {
        this.f3878d = i4;
        this.f3879e = interfaceC0234g;
    }
}
