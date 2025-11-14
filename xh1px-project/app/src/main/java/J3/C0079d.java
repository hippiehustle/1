package J3;

import D4.C0033i;
import O7.C0240m;
import O7.InterfaceC0234g;
import P7.AbstractC0285b;
import X.S;
import a6.AbstractC0436k;
import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.TextView;
import c3.C0573e;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import k4.C0982n;
import k4.Z;

/* renamed from: J3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079d implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2433e;

    public /* synthetic */ C0079d(int i4, Object obj) {
        this.f2432d = i4;
        this.f2433e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        C0240m c0240m;
        int i4;
        Object e9;
        boolean z8;
        switch (this.f2432d) {
            case 0:
                C0033i c0033i = (C0033i) obj;
                u uVar = (u) this.f2433e;
                F3.m mVar = uVar.f2468M;
                if (mVar != null) {
                    ((TextView) mVar.j).setText(c0033i.f961a);
                    F3.m mVar2 = uVar.f2468M;
                    if (mVar2 != null) {
                        ((TextView) mVar2.f1375h).setText(c0033i.f962b);
                        F3.m mVar3 = uVar.f2468M;
                        if (mVar3 != null) {
                            ((TextView) mVar3.f1376i).setText(c0033i.f963c);
                            return Z5.y.f7506a;
                        }
                        o6.j.i("viewBinding");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                if (interfaceC0617c instanceof C0240m) {
                    c0240m = (C0240m) interfaceC0617c;
                    int i8 = c0240m.f4162i;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0240m.f4162i = i8 - Integer.MIN_VALUE;
                        Object obj2 = c0240m.f4160g;
                        i4 = c0240m.f4162i;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            N7.s sVar = (N7.s) this.f2433e;
                            if (obj == null) {
                                obj = AbstractC0285b.f4640b;
                            }
                            c0240m.f4162i = 1;
                            Object b4 = ((N7.r) sVar).f3845g.b(c0240m, obj);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (b4 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c0240m = new C0240m(this, interfaceC0617c);
                Object obj22 = c0240m.f4160g;
                i4 = c0240m.f4162i;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                X.H h8 = (X.H) this.f2433e;
                if ((h8.k.b() instanceof S) || (e9 = X.H.e(h8, true, interfaceC0617c)) != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return e9;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                c3.g gVar = (c3.g) obj;
                if (gVar != null) {
                    ((C0573e) this.f2433e).Z(gVar);
                }
                return Z5.y.f7506a;
            default:
                Z z9 = (Z) obj;
                L2.e eVar = ((C0982n) this.f2433e).K;
                if (eVar != null) {
                    Rect rect = z9.f12075a;
                    Rect rect2 = z9.f12076b;
                    o6.j.e(rect, "area");
                    o6.j.e(rect2, "minimalArea");
                    R2.g gVar2 = eVar.f2772d;
                    if (gVar2 != null) {
                        if (gVar2.f5033r == null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        gVar2.f5033r = new RectF(rect);
                        gVar2.f5034s = new RectF(rect2);
                        gVar2.f(false);
                        gVar2.a();
                        if (z8) {
                            T2.b bVar = eVar.f2773e;
                            if (bVar != null) {
                                bVar.f5667g = AbstractC0436k.U0(bVar.f5665e.keySet());
                                bVar.e(255);
                                bVar.f(bVar.f5668h);
                                A4.d dVar = eVar.f2774f;
                                if (dVar != null) {
                                    B0.e eVar2 = new B0.e(6, eVar);
                                    AnimatorSet animatorSet = (AnimatorSet) dVar.f298h;
                                    if (animatorSet.isRunning()) {
                                        animatorSet.end();
                                    }
                                    animatorSet.addListener(new L2.c(eVar2, dVar, 0));
                                    animatorSet.start();
                                } else {
                                    o6.j.i("animations");
                                    throw null;
                                }
                            } else {
                                o6.j.i("hintsIcons");
                                throw null;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                    o6.j.i("selector");
                    throw null;
                }
                o6.j.i("selectorView");
                throw null;
        }
    }
}
