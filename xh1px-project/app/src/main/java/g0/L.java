package g0;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0012m;
import C6.InterfaceC0019u;
import F6.AbstractC0046f;
import F6.AbstractC0049i;
import F6.C0050j;
import L7.C0165x;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import P.InterfaceC0268p;
import P.t0;
import a6.AbstractC0436k;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d6.InterfaceC0617c;
import e.C0625a;
import e.InterfaceC0626b;
import e6.EnumC0646a;
import f7.C0723c;
import g7.AbstractC0796e;
import j2.C0902b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.C0952b;
import l2.C1001a;
import l3.C1018q;
import l5.C1034d;
import l5.DialogC1035e;
import n.C1109f;
import n.RunnableC1108e;
import n.ViewOnKeyListenerC1110g;
import o.F0;
import o.InterfaceC1203n;
import o.i1;
import o4.C1254C;
import o4.C1258G;
import p7.InterfaceC1333o;
import q4.C1378C;
import q4.C1386K;
import t0.AbstractC1537c0;
import t0.B0;
import v2.InterfaceC1661a;
import x0.C1776e;

/* loaded from: classes.dex */
public class L implements InterfaceC0626b, Q.q, InterfaceC0233f, InterfaceC0268p, F0, n.k, InterfaceC1203n, r0.d, t0.M, B0, v2.j, InterfaceC0012m, E0.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10870d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10871e;

    public /* synthetic */ L(int i4, Object obj) {
        this.f10870d = i4;
        this.f10871e = obj;
    }

    @Override // n.k
    public void A(n.m mVar) {
        n.k kVar = ((ActionMenuView) this.f10871e).f8400y;
        if (kVar != null) {
            kVar.A(mVar);
        }
    }

    @Override // v2.j
    public Object B(C0902b c0902b, InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object C(F6.C c6, Object obj) {
        return null;
    }

    @Override // v2.j
    public Object D(Context context, C1001a c1001a, List list, InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }

    @Override // r0.d
    public void E(int i4, Object obj) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f10871e).setResultCode(i4);
    }

    @Override // t0.B0
    public View F(int i4) {
        return ((AbstractC1537c0) this.f10871e).u(i4);
    }

    @Override // t0.M
    public void G(int i4, int i8) {
        ((t0.L) this.f10871e).f14788a.d(i4, i8);
    }

    @Override // t0.M
    public void H(int i4, int i8) {
        ((t0.L) this.f10871e).f14788a.e(i4, i8);
    }

    @Override // o.F0
    public void I(n.m mVar, n.o oVar) {
        ViewOnKeyListenerC1110g viewOnKeyListenerC1110g = (ViewOnKeyListenerC1110g) this.f10871e;
        Handler handler = viewOnKeyListenerC1110g.f12610i;
        C1109f c1109f = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1110g.k;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (mVar == ((C1109f) arrayList.get(i4)).f12601b) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i8 = i4 + 1;
        if (i8 < arrayList.size()) {
            c1109f = (C1109f) arrayList.get(i8);
        }
        handler.postAtTime(new RunnableC1108e(this, c1109f, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // t0.B0
    public int J() {
        return ((AbstractC1537c0) this.f10871e).H();
    }

    @Override // C6.InterfaceC0012m
    public Object K(AbstractC0049i abstractC0049i, Object obj) {
        return null;
    }

    @Override // t0.B0
    public int L(View view) {
        return AbstractC1537c0.D(view) + ((ViewGroup.MarginLayoutParams) ((t0.d0) view.getLayoutParams())).rightMargin;
    }

    @Override // C6.InterfaceC0012m
    public Object M(AbstractC0046f abstractC0046f, Object obj) {
        return null;
    }

    @Override // C6.InterfaceC0012m
    public Object N(F6.K k, Object obj) {
        int i4;
        w6.F f8 = (w6.F) this.f10871e;
        o6.j.e(k, "descriptor");
        int i8 = 0;
        if (k.f1497x != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (k.f1498y != null) {
            i8 = 1;
        }
        int i9 = i4 + i8;
        if (k.j) {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        return new w6.N(f8, k);
                    }
                } else {
                    return new w6.L(f8, k);
                }
            } else {
                return new w6.J(f8, k);
            }
        } else if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return new w6.f0(f8, k);
                }
            } else {
                return new w6.c0(f8, k);
            }
        } else {
            return new w6.Z(f8, k);
        }
        throw new C0165x("Unsupported property: " + k);
    }

    @Override // v2.j
    public Object O(InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }

    @Override // E0.d
    public void P(E0.c cVar) {
        C1776e c1776e = (C1776e) this.f10871e;
        int length = c1776e.f16085g.length;
        for (int i4 = 1; i4 < length; i4++) {
            int i8 = c1776e.f16085g[i4];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5) {
                                cVar.b(i4);
                            }
                        } else {
                            byte[] bArr = c1776e.k[i4];
                            o6.j.b(bArr);
                            cVar.F(i4, bArr);
                        }
                    } else {
                        String str = c1776e.j[i4];
                        o6.j.b(str);
                        cVar.G(str, i4);
                    }
                } else {
                    cVar.r(i4, c1776e.f16087i[i4]);
                }
            } else {
                cVar.c(i4, c1776e.f16086h[i4]);
            }
        }
    }

    @Override // C6.InterfaceC0012m
    public Object Q(F6.E e9, Object obj) {
        return null;
    }

    @Override // v2.j
    public Z5.y R(InterfaceC1661a interfaceC1661a) {
        return Z5.y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object S(F6.w wVar, Object obj) {
        return null;
    }

    public void T(AbstractC0796e abstractC0796e) {
        if (abstractC0796e.l()) {
            int size = abstractC0796e.size();
            int[] iArr = g7.y.k;
            int binarySearch = Arrays.binarySearch(iArr, size);
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int i4 = iArr[binarySearch + 1];
            Stack stack = (Stack) this.f10871e;
            if (!stack.isEmpty() && ((AbstractC0796e) stack.peek()).size() < i4) {
                int i8 = iArr[binarySearch];
                AbstractC0796e abstractC0796e2 = (AbstractC0796e) stack.pop();
                while (!stack.isEmpty() && ((AbstractC0796e) stack.peek()).size() < i8) {
                    abstractC0796e2 = new g7.y((AbstractC0796e) stack.pop(), abstractC0796e2);
                }
                g7.y yVar = new g7.y(abstractC0796e2, abstractC0796e);
                while (!stack.isEmpty()) {
                    int[] iArr2 = g7.y.k;
                    int binarySearch2 = Arrays.binarySearch(iArr2, yVar.f11262e);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((AbstractC0796e) stack.peek()).size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    } else {
                        yVar = new g7.y((AbstractC0796e) stack.pop(), yVar);
                    }
                }
                stack.push(yVar);
                return;
            }
            stack.push(abstractC0796e);
            return;
        }
        if (abstractC0796e instanceof g7.y) {
            g7.y yVar2 = (g7.y) abstractC0796e;
            T(yVar2.f11263f);
            T(yVar2.f11264g);
            return;
        }
        String valueOf = String.valueOf(abstractC0796e.getClass());
        throw new IllegalArgumentException(A.j.r(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public InterfaceC0004e U(I6.o oVar) {
        I6.o oVar2;
        T6.q qVar;
        InterfaceC1333o interfaceC1333o;
        InterfaceC0007h interfaceC0007h;
        o6.j.e(oVar, "javaClass");
        C0723c c6 = oVar.c();
        Class<?> declaringClass = oVar.f2208a.getDeclaringClass();
        if (declaringClass != null) {
            oVar2 = new I6.o(declaringClass);
        } else {
            oVar2 = null;
        }
        if (oVar2 != null) {
            InterfaceC0004e U8 = U(oVar2);
            if (U8 != null) {
                interfaceC1333o = U8.k0();
            } else {
                interfaceC1333o = null;
            }
            if (interfaceC1333o != null) {
                interfaceC0007h = interfaceC1333o.d(oVar.e(), K6.b.k);
            } else {
                interfaceC0007h = null;
            }
            if (interfaceC0007h instanceof InterfaceC0004e) {
                return (InterfaceC0004e) interfaceC0007h;
            }
        } else if (c6 != null && (qVar = (T6.q) AbstractC0436k.r0(E2.d.y(((S6.d) this.f10871e).c(c6.b())))) != null) {
            T6.v vVar = qVar.f5882n.f5821d;
            vVar.getClass();
            return vVar.v(oVar.e(), oVar);
        }
        return null;
    }

    @Override // Q.q
    public boolean a(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f10871e;
        boolean z8 = false;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        WeakHashMap weakHashMap = P.O.f4214a;
        if (view.getLayoutDirection() == 1) {
            z8 = true;
        }
        int i4 = swipeDismissBehavior.f9932d;
        if ((i4 == 0 && z8) || (i4 == 1 && !z8)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // C6.InterfaceC0012m
    public Object b(F6.M m6, Object obj) {
        return q(m6, obj);
    }

    @Override // v2.j
    public Object c(InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }

    @Override // v2.j
    public Object d(InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object e(F6.y yVar, Object obj) {
        return null;
    }

    @Override // C6.InterfaceC0012m
    public Object f(F6.U u8, Object obj) {
        return null;
    }

    @Override // C6.InterfaceC0012m
    public Object g(F6.A a3, Object obj) {
        return null;
    }

    @Override // e.InterfaceC0626b
    public void h(Object obj) {
        C0625a c0625a = (C0625a) obj;
        T t8 = (T) this.f10871e;
        M m6 = (M) t8.f10890G.pollLast();
        if (m6 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = m6.f10872d;
        AbstractComponentCallbacksC0755y f8 = t8.f10902c.f(str);
        if (f8 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        } else {
            int i4 = c0625a.f10556d;
            Intent intent = c0625a.f10557e;
            if (T.K(2)) {
                f8.toString();
                Objects.toString(intent);
            }
        }
    }

    @Override // o.F0
    public void i(n.m mVar, MenuItem menuItem) {
        ((ViewOnKeyListenerC1110g) this.f10871e).f12610i.removeCallbacksAndMessages(mVar);
    }

    @Override // t0.M
    public void j(int i4, int i8) {
        ((t0.L) this.f10871e).f14788a.f(i4, i8);
    }

    @Override // t0.M
    public void k(int i4, int i8) {
        ((t0.L) this.f10871e).f14788a.c(i4, i8);
    }

    @Override // E0.d
    public String l() {
        return ((C1776e) this.f10871e).f16091e;
    }

    @Override // t0.B0
    public int n() {
        AbstractC1537c0 abstractC1537c0 = (AbstractC1537c0) this.f10871e;
        return abstractC1537c0.f14821n - abstractC1537c0.I();
    }

    @Override // v2.j
    public Object o(InterfaceC0617c interfaceC0617c) {
        ((A1.n) this.f10871e).a();
        return Z5.y.f7506a;
    }

    @Override // t0.B0
    public int p(View view) {
        return AbstractC1537c0.A(view) - ((ViewGroup.MarginLayoutParams) ((t0.d0) view.getLayoutParams())).leftMargin;
    }

    @Override // C6.InterfaceC0012m
    public Object q(InterfaceC0019u interfaceC0019u, Object obj) {
        return new w6.H((w6.F) this.f10871e, interfaceC0019u);
    }

    @Override // v2.j
    public Object r(C0952b c0952b, s2.k kVar, InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object u(F6.L l6, Object obj) {
        return q(l6, obj);
    }

    @Override // v2.j
    public Object v(C0952b c0952b, InterfaceC0617c interfaceC0617c) {
        return Z5.y.f7506a;
    }

    @Override // C6.InterfaceC0012m
    public Object w(C0050j c0050j, Object obj) {
        return q(c0050j, obj);
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f10870d) {
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Object x8 = ((M3.W) this.f10871e).x(new b2.p(interfaceC0234g, 18), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Object x9 = ((C4.e) this.f10871e).x(new b2.p(interfaceC0234g, 20), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            default:
                Object x10 = ((C1378C) this.f10871e).x(new C1386K(interfaceC0234g, 2), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Object x11 = ((C4.e) this.f10871e).x(new C1018q(interfaceC0234g, 15), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
            case 11:
                Object x12 = ((Y3.z) this.f10871e).x(new C1018q(interfaceC0234g, 26), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x12;
            case 12:
                Object x13 = ((C1258G) this.f10871e).x(new C1018q(interfaceC0234g, 28), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x13;
            case 13:
                Object x14 = ((W5.a) this.f10871e).x(new o4.z(interfaceC0234g, 8), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x14;
            case 14:
                Object x15 = ((C1254C) this.f10871e).x(new o4.z(interfaceC0234g, 13), interfaceC0617c);
                if (x15 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x15;
        }
    }

    @Override // P.InterfaceC0268p
    public t0 y(View view, t0 t0Var) {
        DialogC1035e dialogC1035e = (DialogC1035e) this.f10871e;
        C1034d c1034d = dialogC1035e.f12309p;
        if (c1034d != null) {
            dialogC1035e.f12304i.f9957W.remove(c1034d);
        }
        C1034d c1034d2 = new C1034d(dialogC1035e.f12305l, t0Var);
        dialogC1035e.f12309p = c1034d2;
        c1034d2.e(dialogC1035e.getWindow());
        BottomSheetBehavior bottomSheetBehavior = dialogC1035e.f12304i;
        C1034d c1034d3 = dialogC1035e.f12309p;
        ArrayList arrayList = bottomSheetBehavior.f9957W;
        if (!arrayList.contains(c1034d3)) {
            arrayList.add(c1034d3);
        }
        return t0Var;
    }

    @Override // n.k
    public boolean z(n.m mVar, MenuItem menuItem) {
        boolean z8;
        InterfaceC1203n interfaceC1203n = ((ActionMenuView) this.f10871e).f8393D;
        if (interfaceC1203n != null) {
            Toolbar toolbar = (Toolbar) ((L) interfaceC1203n).f10871e;
            Iterator it = ((CopyOnWriteArrayList) toolbar.f8467J.f292f).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((I) it.next()).f10866a.p()) {
                        z8 = true;
                        break;
                    }
                } else {
                    i1 i1Var = toolbar.f8468L;
                    if (i1Var != null) {
                        z8 = i1Var.onMenuItemClick(menuItem);
                    } else {
                        z8 = false;
                    }
                }
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public L() {
        this.f10870d = 1;
        this.f10871e = new Stack();
    }
}
