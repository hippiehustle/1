package D4;

import O7.C0246t;
import O7.C0249w;
import O7.InterfaceC0234g;
import O7.V;
import P7.AbstractC0285b;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import h4.AbstractC0832f;
import i.AbstractC0863b;
import l2.C1001a;
import n6.InterfaceC1164c;

/* renamed from: D4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027c implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f942d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f943e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f944f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f945g;

    public /* synthetic */ C0027c(InterfaceC0234g interfaceC0234g, Object obj, Object obj2, int i4) {
        this.f942d = i4;
        this.f943e = interfaceC0234g;
        this.f945g = obj;
        this.f944f = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c6  */
    /* JADX WARN: Type inference failed for: r11v21, types: [f6.j, n6.c] */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        C0026b c0026b;
        int i4;
        boolean z8;
        K3.A a3;
        int i8;
        EnumC0646a enumC0646a;
        InterfaceC0234g interfaceC0234g;
        int i9;
        P2.a aVar;
        C0246t c0246t;
        Object obj2;
        int i10;
        C0027c c0027c;
        C0249w c0249w;
        int i11;
        S4.j jVar;
        int i12;
        S4.l lVar;
        boolean z9;
        t4.t tVar;
        int i13;
        switch (this.f942d) {
            case 0:
                if (interfaceC0617c instanceof C0026b) {
                    c0026b = (C0026b) interfaceC0617c;
                    int i14 = c0026b.f940h;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0026b.f940h = i14 - Integer.MIN_VALUE;
                        Object obj3 = c0026b.f939g;
                        i4 = c0026b.f940h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            InterfaceC0234g interfaceC0234g2 = (InterfaceC0234g) this.f943e;
                            if (((Boolean) obj).booleanValue() && AbstractC0863b.j(((C0028d) this.f945g).f946b, (Context) this.f944f)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z8);
                            c0026b.f940h = 1;
                            Object n3 = interfaceC0234g2.n(valueOf, c0026b);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n3 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c0026b = new C0026b(this, interfaceC0617c);
                Object obj32 = c0026b.f939g;
                i4 = c0026b.f940h;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            case 1:
                if (interfaceC0617c instanceof K3.A) {
                    a3 = (K3.A) interfaceC0617c;
                    int i15 = a3.f2632h;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        a3.f2632h = i15 - Integer.MIN_VALUE;
                        Object obj4 = a3.f2631g;
                        i8 = a3.f2632h;
                        enumC0646a = EnumC0646a.f10656d;
                        if (i8 == 0) {
                            if (i8 != 1) {
                                if (i8 == 2) {
                                    Z5.a.d(obj4);
                                    return Z5.y.f7506a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i9 = a3.k;
                            interfaceC0234g = a3.j;
                            Z5.a.d(obj4);
                        } else {
                            Z5.a.d(obj4);
                            interfaceC0234g = (InterfaceC0234g) this.f943e;
                            f2.a aVar2 = (f2.a) ((Z5.j) obj).f7485d;
                            if (aVar2 != null) {
                                K3.D d2 = (K3.D) this.f945g;
                                Context context = (Context) this.f944f;
                                a3.j = interfaceC0234g;
                                a3.k = 0;
                                a3.f2632h = 1;
                                Object e9 = K3.D.e(d2, aVar2, context, a3);
                                if (e9 != enumC0646a) {
                                    obj4 = e9;
                                    i9 = 0;
                                } else {
                                    return enumC0646a;
                                }
                            } else {
                                i9 = 0;
                                aVar = null;
                                a3.j = null;
                                a3.k = i9;
                                a3.f2632h = 2;
                                if (interfaceC0234g.n(aVar, a3) == enumC0646a) {
                                    return enumC0646a;
                                }
                                return Z5.y.f7506a;
                            }
                        }
                        aVar = (P2.a) obj4;
                        a3.j = null;
                        a3.k = i9;
                        a3.f2632h = 2;
                        if (interfaceC0234g.n(aVar, a3) == enumC0646a) {
                        }
                        return Z5.y.f7506a;
                    }
                }
                a3 = new K3.A(this, interfaceC0617c);
                Object obj42 = a3.f2631g;
                i8 = a3.f2632h;
                enumC0646a = EnumC0646a.f10656d;
                if (i8 == 0) {
                }
                aVar = (P2.a) obj42;
                a3.j = null;
                a3.k = i9;
                a3.f2632h = 2;
                if (interfaceC0234g.n(aVar, a3) == enumC0646a) {
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0617c instanceof C0246t) {
                    c0246t = (C0246t) interfaceC0617c;
                    int i16 = c0246t.k;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c0246t.k = i16 - Integer.MIN_VALUE;
                        obj2 = c0246t.f4184i;
                        i10 = c0246t.k;
                        Z5.y yVar = Z5.y.f7506a;
                        EnumC0646a enumC0646a3 = EnumC0646a.f10656d;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    obj = c0246t.f4183h;
                                    c0027c = c0246t.f4182g;
                                    Z5.a.d(obj2);
                                }
                            }
                            Z5.a.d(obj2);
                            return yVar;
                        }
                        Z5.a.d(obj2);
                        if (((o6.r) this.f945g).f13639d) {
                            InterfaceC0234g interfaceC0234g3 = (InterfaceC0234g) this.f943e;
                            c0246t.k = 1;
                            if (interfaceC0234g3.n(obj, c0246t) != enumC0646a3) {
                                return yVar;
                            }
                        } else {
                            ?? r11 = (AbstractC0720j) this.f944f;
                            c0246t.f4182g = this;
                            c0246t.f4183h = obj;
                            c0246t.k = 2;
                            obj2 = r11.l(obj, c0246t);
                            if (obj2 != enumC0646a3) {
                                c0027c = this;
                            }
                        }
                        return enumC0646a3;
                        if (((Boolean) obj2).booleanValue()) {
                            ((o6.r) c0027c.f945g).f13639d = true;
                            InterfaceC0234g interfaceC0234g4 = (InterfaceC0234g) c0027c.f943e;
                            c0246t.f4182g = null;
                            c0246t.f4183h = null;
                            c0246t.k = 3;
                            if (interfaceC0234g4.n(obj, c0246t) != enumC0646a3) {
                                return yVar;
                            }
                            return enumC0646a3;
                        }
                        return yVar;
                    }
                }
                c0246t = new C0246t(this, interfaceC0617c);
                obj2 = c0246t.f4184i;
                i10 = c0246t.k;
                Z5.y yVar2 = Z5.y.f7506a;
                EnumC0646a enumC0646a32 = EnumC0646a.f10656d;
                if (i10 == 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0234g interfaceC0234g5 = (InterfaceC0234g) this.f943e;
                if (interfaceC0617c instanceof C0249w) {
                    c0249w = (C0249w) interfaceC0617c;
                    int i17 = c0249w.f4193i;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c0249w.f4193i = i17 - Integer.MIN_VALUE;
                        Object obj5 = c0249w.f4191g;
                        i11 = c0249w.f4193i;
                        Z5.y yVar3 = Z5.y.f7506a;
                        if (i11 == 0) {
                            if (i11 == 1 || i11 == 2) {
                                Z5.a.d(obj5);
                                return yVar3;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj5);
                        o6.s sVar = (o6.s) this.f945g;
                        int i18 = sVar.f13640d + 1;
                        sVar.f13640d = i18;
                        EnumC0646a enumC0646a4 = EnumC0646a.f10656d;
                        if (i18 < 1) {
                            c0249w.f4193i = 1;
                            if (interfaceC0234g5.n(obj, c0249w) != enumC0646a4) {
                                return yVar3;
                            }
                        } else {
                            c0249w.f4193i = 2;
                            V.d(interfaceC0234g5, obj, this.f944f, c0249w);
                        }
                        return enumC0646a4;
                    }
                }
                c0249w = new C0249w(this, interfaceC0617c);
                Object obj52 = c0249w.f4191g;
                i11 = c0249w.f4193i;
                Z5.y yVar32 = Z5.y.f7506a;
                if (i11 == 0) {
                }
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Object c6 = AbstractC0285b.c((InterfaceC0622h) this.f943e, obj, this.f945g, (P7.E) this.f944f, interfaceC0617c);
                if (c6 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return c6;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                M4.f fVar = (M4.f) this.f945g;
                if (interfaceC0617c instanceof S4.j) {
                    jVar = (S4.j) interfaceC0617c;
                    int i19 = jVar.f5386h;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        jVar.f5386h = i19 - Integer.MIN_VALUE;
                        Object obj6 = jVar.f5385g;
                        i12 = jVar.f5386h;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                Z5.a.d(obj6);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj6);
                            InterfaceC0234g interfaceC0234g6 = (InterfaceC0234g) this.f943e;
                            Rect rect = (Rect) obj;
                            int i20 = fVar.f3489a;
                            M4.d dVar = fVar.f3490b;
                            if (dVar != null) {
                                lVar = new S4.l(dVar.f3487a, dVar.f3488b);
                            } else {
                                lVar = null;
                            }
                            S4.a aVar3 = new S4.a(((M4.a) fVar.f3491c).f3482f, rect);
                            if (rect.centerY() > ((S4.k) this.f944f).f5390d.f7104e.f7094a.y / 2) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            S4.m mVar = new S4.m(i20, lVar, aVar3, z9);
                            jVar.f5386h = 1;
                            Object n8 = interfaceC0234g6.n(mVar, jVar);
                            EnumC0646a enumC0646a5 = EnumC0646a.f10656d;
                            if (n8 == enumC0646a5) {
                                return enumC0646a5;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                jVar = new S4.j(this, interfaceC0617c);
                Object obj62 = jVar.f5385g;
                i12 = jVar.f5386h;
                if (i12 == 0) {
                }
                return Z5.y.f7506a;
            default:
                if (interfaceC0617c instanceof t4.t) {
                    tVar = (t4.t) interfaceC0617c;
                    int i21 = tVar.f15104h;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        tVar.f15104h = i21 - Integer.MIN_VALUE;
                        Object obj7 = tVar.f15103g;
                        i13 = tVar.f15104h;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                Z5.a.d(obj7);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj7);
                            InterfaceC0234g interfaceC0234g7 = (InterfaceC0234g) this.f943e;
                            t4.x xVar = (t4.x) this.f945g;
                            Context context2 = (Context) this.f944f;
                            Point point = xVar.f15113b.f7104e.f7094a;
                            int i22 = ((C1001a) obj).f12192c;
                            float max = Math.max(point.x, Math.max(point.y, 1));
                            float min = Math.min(point.x, point.y);
                            float e10 = AbstractC0832f.e(i22, 400.0f, max);
                            String string = context2.getString(R.string.field_scenario_quality_resolution, Integer.valueOf((int) e10), Integer.valueOf((int) ((e10 / max) * min)));
                            o6.j.d(string, "getString(...)");
                            t4.y yVar4 = new t4.y(string, e10, max);
                            tVar.f15104h = 1;
                            Object n9 = interfaceC0234g7.n(yVar4, tVar);
                            EnumC0646a enumC0646a6 = EnumC0646a.f10656d;
                            if (n9 == enumC0646a6) {
                                return enumC0646a6;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                tVar = new t4.t(this, interfaceC0617c);
                Object obj72 = tVar.f15103g;
                i13 = tVar.f15104h;
                if (i13 == 0) {
                }
                return Z5.y.f7506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0027c(o6.r rVar, InterfaceC0234g interfaceC0234g, InterfaceC1164c interfaceC1164c) {
        this.f942d = 2;
        this.f945g = rVar;
        this.f943e = interfaceC0234g;
        this.f944f = (AbstractC0720j) interfaceC1164c;
    }

    public C0027c(o6.s sVar, InterfaceC0234g interfaceC0234g, Object obj) {
        this.f942d = 3;
        this.f945g = sVar;
        this.f943e = interfaceC0234g;
        this.f944f = obj;
    }

    public C0027c(InterfaceC0234g interfaceC0234g, InterfaceC0622h interfaceC0622h) {
        this.f942d = 4;
        this.f943e = interfaceC0622h;
        this.f945g = Q7.b.m(interfaceC0622h);
        this.f944f = new P7.E(interfaceC0234g, null);
    }
}
