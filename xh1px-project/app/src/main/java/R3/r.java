package R3;

import C6.AbstractC0021w;
import C6.EnumC0005f;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.h0;
import F6.C0050j;
import I6.AbstractC0065d;
import L7.AbstractC0160s;
import L7.AbstractC0166y;
import N0.I;
import O3.J;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.P;
import O7.i0;
import P.D;
import P.O;
import P.U;
import X.C0335c;
import X.H;
import a0.C0413h;
import a1.C0415b;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.C0439A;
import a7.C0444e;
import a7.C0445f;
import a7.C0447h;
import a7.C0453n;
import a7.C0460v;
import a7.EnumC0443d;
import a7.K;
import a7.L;
import a7.M;
import a7.N;
import a7.Y;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import c0.C0557B;
import c7.AbstractC0586e;
import c7.C0587f;
import c7.InterfaceC0588g;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e0.C0633a;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f7.C0722b;
import f7.C0725e;
import g0.AbstractComponentCallbacksC0755y;
import g0.T;
import g0.b0;
import g7.AbstractC0793b;
import g7.AbstractC0803l;
import g7.C0800i;
import g7.C0804m;
import h7.AbstractC0842e;
import i.AbstractActivityC0870i;
import i.LayoutInflaterFactory2C0860C;
import i7.AbstractC0890e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l1.C1000b;
import l3.C1018q;
import m.C1041d;
import n.MenuC1100B;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import o3.C1250u;
import p2.C1304a;
import q4.X;
import s7.AbstractC1511b;
import s7.C1513d;
import s7.InterfaceC1510a;
import s7.InterfaceC1512c;
import s7.InterfaceC1514e;
import t6.C1587b;
import t7.C1594d;
import w7.AbstractC1759v;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public class r implements InterfaceC0233f, InterfaceC1514e, c0.r, InterfaceC0588g, InterfaceC1510a, InterfaceC1512c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5081d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5082e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5083f;

    public /* synthetic */ r(Object obj, int i4, Object obj2) {
        this.f5081d = i4;
        this.f5082e = obj;
        this.f5083f = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006e, TryCatch #0 {IOException -> 0x006e, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0046, B:15:0x003a, B:16:0x003d, B:27:0x004b, B:29:0x004e, B:32:0x005d), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [d8.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r V(String... strArr) {
        String str;
        try {
            d8.c[] cVarArr = new d8.c[strArr.length];
            ?? obj = new Object();
            for (int i4 = 0; i4 < strArr.length; i4++) {
                String str2 = strArr[i4];
                String[] strArr2 = Y0.c.f7077h;
                obj.z(34);
                int length = str2.length();
                int i8 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt = str2.charAt(i9);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i8 < i9) {
                            obj.D(str2, i8, i9);
                        }
                        obj.D(str, 0, str.length());
                        i8 = i9 + 1;
                    } else {
                        if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i8 < i9) {
                        }
                        obj.D(str, 0, str.length());
                        i8 = i9 + 1;
                    }
                }
                if (i8 < length) {
                    obj.D(str2, i8, length);
                }
                obj.z(34);
                obj.d();
                cVarArr[i4] = obj.j();
            }
            return new r((String[]) strArr.clone(), 6, d8.f.h(cVarArr));
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public void A(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.A(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void B(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        T t8 = (T) this.f5082e;
        AbstractActivityC0870i abstractActivityC0870i = t8.f10921x.j;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = t8.f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.B(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void C(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.C(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void D(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.D(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void E(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.E(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void F(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.F(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void G(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        T t8 = (T) this.f5082e;
        AbstractActivityC0870i abstractActivityC0870i = t8.f10921x.j;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = t8.f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.G(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void H(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.H(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void I(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.I(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void J(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, Bundle bundle, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.J(abstractComponentCallbacksC0755y, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void K(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.K(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void L(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.L(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void M(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, View view, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        o6.j.e(view, "v");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.M(abstractComponentCallbacksC0755y, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void N(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        o6.j.e(abstractComponentCallbacksC0755y, "f");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = ((T) this.f5082e).f10923z;
        if (abstractComponentCallbacksC0755y2 != null) {
            abstractComponentCallbacksC0755y2.m().f10913p.N(abstractComponentCallbacksC0755y, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5083f).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z8) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public boolean O(k7.g gVar, AbstractC1759v abstractC1759v, C0444e c0444e) {
        int i4;
        InterfaceC0004e interfaceC0004e;
        C6.A a3 = (C6.A) this.f5082e;
        EnumC0443d enumC0443d = c0444e.f8061f;
        if (enumC0443d == null) {
            i4 = -1;
        } else {
            i4 = AbstractC1511b.f14562a[enumC0443d.ordinal()];
        }
        if (i4 != 10) {
            if (i4 != 13) {
                return o6.j.a(gVar.a(a3), abstractC1759v);
            }
            if (gVar instanceof k7.b) {
                k7.b bVar = (k7.b) gVar;
                if (((List) bVar.f12144a).size() == c0444e.f8067n.size()) {
                    AbstractC1759v g8 = a3.o().g(abstractC1759v);
                    if (g8 != null) {
                        Iterable V6 = AbstractC0437l.V((Collection) bVar.f12144a);
                        if (!(V6 instanceof Collection) || !((Collection) V6).isEmpty()) {
                            Iterator it = V6.iterator();
                            while (((C1587b) it).f15128f) {
                                int nextInt = ((a6.w) it).nextInt();
                                k7.g gVar2 = (k7.g) ((List) bVar.f12144a).get(nextInt);
                                C0444e c0444e2 = (C0444e) c0444e.f8067n.get(nextInt);
                                o6.j.d(c0444e2, "getArrayElement(...)");
                                if (!O(gVar2, g8, c0444e2)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 instanceof InterfaceC0004e) {
            interfaceC0004e = (InterfaceC0004e) c6;
        } else {
            interfaceC0004e = null;
        }
        if (interfaceC0004e != null) {
            C0725e c0725e = z6.h.f16714e;
            if (!z6.h.b(interfaceC0004e, z6.m.f16753Q)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public Object P(InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        return ((W0.c) this.f5082e).c(new C0413h(interfaceC1164c, null), interfaceC0617c);
    }

    public void Q(String str, String str2, InterfaceC1163b interfaceC1163b) {
        LinkedHashMap linkedHashMap = ((X6.q) this.f5083f).f7033a;
        X6.p pVar = new X6.p(this, str, str2);
        interfaceC1163b.m(pVar);
        String str3 = (String) this.f5082e;
        ArrayList arrayList = pVar.f7031b;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Z5.j) it.next()).f7485d);
        }
        String str4 = (String) pVar.f7032c.f7485d;
        o6.j.e(str4, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(AbstractC0436k.v0(arrayList2, "", null, null, Y6.q.f7238d, 30));
        sb.append(')');
        if (str4.length() > 1) {
            str4 = "L" + str4 + ';';
        }
        sb.append(str4);
        String sb2 = sb.toString();
        o6.j.e(str3, "internalName");
        o6.j.e(sb2, "jvmDescriptor");
        String str5 = str3 + '.' + sb2;
        X6.t tVar = (X6.t) pVar.f7032c.f7486e;
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((X6.t) ((Z5.j) it2.next()).f7486e);
        }
        linkedHashMap.put(str5, new X6.n(tVar, arrayList3, pVar.f7030a));
    }

    public C0999a R() {
        C0999a c0999a = (C0999a) this.f5083f;
        if (c0999a != null) {
            return c0999a;
        }
        throw new IllegalStateException("Can't create items without an edited dumb scenario");
    }

    public Object S(C0415b c0415b) {
        return (I) this.f5083f;
    }

    public Object T(float f8, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        C0415b c0415b = (C0415b) this.f5082e;
        c0415b.f7684a = f8;
        c0415b.f7685b = f9;
        c0415b.f7686c = obj;
        c0415b.f7687d = obj2;
        c0415b.f7688e = f10;
        c0415b.f7689f = f11;
        c0415b.f7690g = f12;
        return S(c0415b);
    }

    public D6.d U(C0447h c0447h, InterfaceC0588g interfaceC0588g) {
        o6.j.e(c0447h, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        return ((r) this.f5083f).z(c0447h, interfaceC0588g);
    }

    public void W(h0 h0Var) {
        b0 b0Var = (b0) this.f5082e;
        ((ActionMode.Callback) b0Var.f10988e).onDestroyActionMode(b0Var.g(h0Var));
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) this.f5083f;
        if (layoutInflaterFactory2C0860C.f11596z != null) {
            layoutInflaterFactory2C0860C.f11585o.getDecorView().removeCallbacks(layoutInflaterFactory2C0860C.f11550A);
        }
        if (layoutInflaterFactory2C0860C.f11595y != null) {
            U u8 = layoutInflaterFactory2C0860C.f11551B;
            if (u8 != null) {
                u8.b();
            }
            U a3 = O.a(layoutInflaterFactory2C0860C.f11595y);
            a3.a(0.0f);
            layoutInflaterFactory2C0860C.f11551B = a3;
            a3.d(new i.t(2, this));
        }
        layoutInflaterFactory2C0860C.f11594x = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0860C.f11553D;
        WeakHashMap weakHashMap = O.f4214a;
        D.c(viewGroup);
        layoutInflaterFactory2C0860C.I();
    }

    public boolean X(h0 h0Var, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0860C) this.f5083f).f11553D;
        WeakHashMap weakHashMap = O.f4214a;
        D.c(viewGroup);
        b0 b0Var = (b0) this.f5082e;
        ActionMode.Callback callback = (ActionMode.Callback) b0Var.f10988e;
        C1041d g8 = b0Var.g(h0Var);
        t.j jVar = (t.j) b0Var.f10990g;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC1100B((Context) b0Var.f10989f, (n.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(g8, menu2);
    }

    public k7.g Y(AbstractC1759v abstractC1759v, C0444e c0444e, InterfaceC0588g interfaceC0588g) {
        int i4;
        boolean z8;
        o6.j.e(c0444e, "value");
        o6.j.e(interfaceC0588g, "nameResolver");
        boolean booleanValue = AbstractC0586e.f9696P.c(c0444e.f8069p).booleanValue();
        EnumC0443d enumC0443d = c0444e.f8061f;
        if (enumC0443d == null) {
            i4 = -1;
        } else {
            i4 = AbstractC1511b.f14562a[enumC0443d.ordinal()];
        }
        switch (i4) {
            case 1:
                byte b4 = (byte) c0444e.f8062g;
                if (booleanValue) {
                    return new k7.y(b4);
                }
                return new k7.d(b4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new k7.g(Character.valueOf((char) c0444e.f8062g));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                short s8 = (short) c0444e.f8062g;
                if (booleanValue) {
                    return new k7.y(s8);
                }
                return new k7.v(s8);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                int i8 = (int) c0444e.f8062g;
                if (booleanValue) {
                    return new k7.y(i8);
                }
                return new k7.k(i8);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                long j = c0444e.f8062g;
                if (booleanValue) {
                    return new k7.y(j);
                }
                return new k7.t(j);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new k7.c(c0444e.f8063h);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new k7.c(c0444e.f8064i);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (c0444e.f8062g != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new k7.c(Boolean.valueOf(z8));
            case 9:
                return new k7.g(interfaceC0588g.getString(c0444e.j));
            case 10:
                return new k7.s(AbstractC0842e.m(interfaceC0588g, c0444e.k), c0444e.f8068o);
            case 11:
                return new k7.i(AbstractC0842e.m(interfaceC0588g, c0444e.k), AbstractC0842e.t(interfaceC0588g, c0444e.f8065l));
            case 12:
                C0447h c0447h = c0444e.f8066m;
                o6.j.d(c0447h, "getAnnotation(...)");
                return new k7.g(z(c0447h, interfaceC0588g));
            case 13:
                List<C0444e> list = c0444e.f8067n;
                o6.j.d(list, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                for (C0444e c0444e2 : list) {
                    w7.z e9 = ((C6.A) this.f5082e).o().e();
                    o6.j.b(c0444e2);
                    arrayList.add(Y(e9, c0444e2, interfaceC0588g));
                }
                return new k7.x(arrayList, abstractC1759v);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + c0444e.f8061f + " (expected " + abstractC1759v + ')').toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Z(Bitmap bitmap, String str, AbstractC0713c abstractC0713c) {
        q1.j jVar;
        int i4;
        if (abstractC0713c instanceof q1.j) {
            jVar = (q1.j) abstractC0713c;
            int i8 = jVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.j = i8 - Integer.MIN_VALUE;
                Object obj = jVar.f13935h;
                i4 = jVar.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        String str2 = jVar.f13934g;
                        Z5.a.d(obj);
                        return str2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getByteCount());
                bitmap.copyPixelsToBuffer(allocateDirect);
                allocateDirect.position(0);
                String str3 = str + allocateDirect.hashCode() + ".png";
                File file = new File((File) this.f5083f, str3);
                if (file.exists()) {
                    Log.w("ConditionBitmapsDataSource", "Can't save bitmap " + str3 + ", file already exists");
                    return str3;
                }
                AbstractC0160s abstractC0160s = (AbstractC0160s) this.f5082e;
                q1.k kVar = new q1.k(file, bitmap, null);
                jVar.f13934g = str3;
                jVar.j = 1;
                Object A2 = AbstractC0166y.A(abstractC0160s, kVar, jVar);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (A2 == enumC0646a) {
                    return enumC0646a;
                }
                return str3;
            }
        }
        jVar = new q1.j(this, abstractC0713c);
        Object obj2 = jVar.f13935h;
        i4 = jVar.j;
        if (i4 == 0) {
        }
    }

    @Override // c0.r
    public Object a() {
        return (C0557B) this.f5082e;
    }

    public void a0(int i4, int i8, int i9, int i10) {
        CardView cardView = (CardView) this.f5083f;
        cardView.f8512g.set(i4, i8, i9, i10);
        Rect rect = cardView.f8511f;
        CardView.a(cardView, i4 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
    }

    @Override // s7.InterfaceC1512c
    public ArrayList b(s7.t tVar) {
        o6.j.e(tVar, "container");
        Iterable iterable = (List) tVar.f14622d.k(((r7.a) this.f5082e).f14425c);
        if (iterable == null) {
            iterable = a6.s.f7766d;
        }
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), tVar.f14628a));
        }
        return arrayList;
    }

    public Z5.o b0(int i4) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z8 = false;
        while (i4 != -1) {
            L l6 = (L) ((M) this.f5083f).f7893e.get(i4);
            String str = (String) ((N) this.f5082e).f7899e.get(l6.f7887g);
            K k = l6.f7888h;
            o6.j.b(k);
            int ordinal = k.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        linkedList2.addFirst(str);
                        z8 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    linkedList.addFirst(str);
                }
            } else {
                linkedList2.addFirst(str);
            }
            i4 = l6.f7886f;
        }
        return new Z5.o(linkedList, linkedList2, Boolean.valueOf(z8));
    }

    @Override // s7.InterfaceC1514e
    public C1513d c(C0722b c0722b) {
        o6.j.e(c0722b, "classId");
        W0.c cVar = (W0.c) this.f5082e;
        Y6.e eVar = (Y6.e) this.f5083f;
        eVar.c().f14575c.getClass();
        H6.b t8 = X.t(cVar, c0722b, C0587f.f9721g);
        if (t8 == null) {
            return null;
        }
        AbstractC0065d.a(t8.f2037a).equals(c0722b);
        return eVar.g(t8);
    }

    public A4.a c0(C0725e c0725e, String str) {
        o6.j.e(c0725e, "name");
        String b4 = c0725e.b();
        o6.j.d(b4, "asString(...)");
        return new A4.a(this, new Y6.p(b4.concat(str)));
    }

    @Override // s7.InterfaceC1512c
    public ArrayList d(Y y4, InterfaceC0588g interfaceC0588g) {
        o6.j.e(y4, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        Iterable iterable = (List) y4.k(((r7.a) this.f5082e).f14432l);
        if (iterable == null) {
            iterable = a6.s.f7766d;
        }
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), interfaceC0588g));
        }
        return arrayList;
    }

    public void d0(int i4, L5.m mVar) {
        Iterator it = (Iterator) this.f5082e;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f5083f;
            if (entry != null && ((C0804m) entry.getKey()).f11244d < i4) {
                C0804m c0804m = (C0804m) ((Map.Entry) this.f5083f).getKey();
                Object value = ((Map.Entry) this.f5083f).getValue();
                C0800i c0800i = C0800i.f11237c;
                g7.L l6 = c0804m.f11245e;
                int i8 = c0804m.f11244d;
                if (c0804m.f11246f) {
                    for (Object obj : (List) value) {
                        if (l6 == g7.L.f11203h) {
                            mVar.x(i8, 3);
                            ((AbstractC0793b) obj).f(mVar);
                            mVar.x(i8, 4);
                        } else {
                            mVar.x(i8, l6.f11206e);
                            C0800i.k(mVar, l6, obj);
                        }
                    }
                } else if (l6 == g7.L.f11203h) {
                    mVar.x(i8, 3);
                    ((AbstractC0793b) value).f(mVar);
                    mVar.x(i8, 4);
                } else {
                    mVar.x(i8, l6.f11206e);
                    C0800i.k(mVar, l6, value);
                }
                if (it.hasNext()) {
                    this.f5083f = (Map.Entry) it.next();
                } else {
                    this.f5083f = null;
                }
            } else {
                return;
            }
        }
    }

    @Override // s7.InterfaceC1512c
    public List e(s7.v vVar, AbstractC0793b abstractC0793b, int i4) {
        String str;
        r7.a aVar = (r7.a) this.f5082e;
        o6.j.e(abstractC0793b, "proto");
        AbstractC1149a.l("kind", i4);
        if (abstractC0793b instanceof C0439A) {
            aVar.getClass();
        } else if (abstractC0793b instanceof a7.I) {
            int b4 = AbstractC1769h.b(i4);
            if (b4 != 1 && b4 != 2 && b4 != 3) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                str = "null";
                            } else {
                                str = "PROPERTY_SETTER";
                            }
                        } else {
                            str = "PROPERTY_GETTER";
                        }
                    } else {
                        str = "PROPERTY";
                    }
                } else {
                    str = "FUNCTION";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
            aVar.getClass();
        } else {
            throw new IllegalStateException(("Unknown message: " + abstractC0793b).toString());
        }
        a6.s sVar = a6.s.f7766d;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(sVar, 10));
        Iterator<E> it = sVar.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), vVar.f14628a));
        }
        return arrayList;
    }

    @Override // s7.InterfaceC1510a
    public Object f(s7.v vVar, a7.I i4, AbstractC1759v abstractC1759v) {
        o6.j.e(i4, "proto");
        return null;
    }

    @Override // s7.InterfaceC1512c
    public List g(s7.v vVar, a7.I i4) {
        o6.j.e(i4, "proto");
        ((r7.a) this.f5082e).getClass();
        a6.s sVar = a6.s.f7766d;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(sVar, 10));
        Iterator<E> it = sVar.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), vVar.f14628a));
        }
        return arrayList;
    }

    @Override // c7.InterfaceC0588g
    public String getString(int i4) {
        String str = (String) ((N) this.f5082e).f7899e.get(i4);
        o6.j.d(str, "getString(...)");
        return str;
    }

    @Override // s7.InterfaceC1512c
    public List h(s7.v vVar, C0460v c0460v) {
        o6.j.e(vVar, "container");
        Iterable iterable = (List) c0460v.k(((r7.a) this.f5082e).f14430h);
        if (iterable == null) {
            iterable = a6.s.f7766d;
        }
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), vVar.f14628a));
        }
        return arrayList;
    }

    @Override // c0.r
    public boolean i(CharSequence charSequence, int i4, int i8, c0.y yVar) {
        Spannable spannableString;
        if ((yVar.f9427c & 4) > 0) {
            return true;
        }
        if (((C0557B) this.f5082e) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f5082e = new C0557B(spannableString);
        }
        ((C1594d) this.f5083f).getClass();
        ((C0557B) this.f5082e).setSpan(new c0.z(yVar), i4, i8, 33);
        return true;
    }

    @Override // s7.InterfaceC1510a
    public Object j(s7.v vVar, a7.I i4, AbstractC1759v abstractC1759v) {
        o6.j.e(i4, "proto");
        C0444e c0444e = (C0444e) E2.d.t(i4, ((r7.a) this.f5082e).f14431i);
        if (c0444e == null) {
            return null;
        }
        return ((r) this.f5083f).Y(abstractC1759v, c0444e, vVar.f14628a);
    }

    @Override // s7.InterfaceC1512c
    public List k(s7.v vVar, AbstractC0793b abstractC0793b, int i4) {
        List list;
        r7.a aVar = (r7.a) this.f5082e;
        o6.j.e(abstractC0793b, "proto");
        AbstractC1149a.l("kind", i4);
        if (abstractC0793b instanceof C0453n) {
            list = (List) ((C0453n) abstractC0793b).k(aVar.f14424b);
        } else if (abstractC0793b instanceof C0439A) {
            list = (List) ((C0439A) abstractC0793b).k(aVar.f14426d);
        } else if (abstractC0793b instanceof a7.I) {
            int b4 = AbstractC1769h.b(i4);
            if (b4 != 1) {
                if (b4 != 2) {
                    if (b4 == 3) {
                        list = (List) ((a7.I) abstractC0793b).k(aVar.f14429g);
                    } else {
                        throw new IllegalStateException("Unsupported callable kind with property proto");
                    }
                } else {
                    list = (List) ((a7.I) abstractC0793b).k(aVar.f14428f);
                }
            } else {
                list = (List) ((a7.I) abstractC0793b).k(aVar.f14427e);
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + abstractC0793b).toString());
        }
        if (list == null) {
            list = a6.s.f7766d;
        }
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), vVar.f14628a));
        }
        return arrayList;
    }

    @Override // s7.InterfaceC1512c
    public List l(s7.v vVar, a7.I i4) {
        o6.j.e(i4, "proto");
        ((r7.a) this.f5082e).getClass();
        a6.s sVar = a6.s.f7766d;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(sVar, 10));
        Iterator<E> it = sVar.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), vVar.f14628a));
        }
        return arrayList;
    }

    @Override // s7.InterfaceC1512c
    public ArrayList n(a7.T t8, InterfaceC0588g interfaceC0588g) {
        o6.j.e(t8, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        Iterable iterable = (List) t8.k(((r7.a) this.f5082e).k);
        if (iterable == null) {
            iterable = a6.s.f7766d;
        }
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), interfaceC0588g));
        }
        return arrayList;
    }

    @Override // c7.InterfaceC0588g
    public boolean o(int i4) {
        return ((Boolean) b0(i4).f7496f).booleanValue();
    }

    @Override // s7.InterfaceC1512c
    public List p(s7.v vVar, AbstractC0793b abstractC0793b, int i4, int i8, a7.b0 b0Var) {
        o6.j.e(abstractC0793b, "callableProto");
        AbstractC1149a.l("kind", i4);
        Iterable iterable = (List) b0Var.k(((r7.a) this.f5082e).j);
        if (iterable == null) {
            iterable = a6.s.f7766d;
        }
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(U((C0447h) it.next(), vVar.f14628a));
        }
        return arrayList;
    }

    @Override // c7.InterfaceC0588g
    public String q(int i4) {
        Z5.o b02 = b0(i4);
        List list = (List) b02.f7494d;
        String v02 = AbstractC0436k.v0((List) b02.f7495e, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return v02;
        }
        return AbstractC0436k.v0(list, "/", null, null, null, 62) + '/' + v02;
    }

    public p2.d r(p2.d dVar) {
        C1000b c1000b = (C1000b) this.f5082e;
        o6.j.e(dVar, "from");
        if (dVar instanceof C1304a) {
            return C1304a.i((C1304a) dVar, c1000b.a(), R(), null, 0, 0, false, 0L, null, 0L, 508);
        }
        if (dVar instanceof p2.c) {
            return p2.c.i((p2.c) dVar, c1000b.a(), R(), null, 0, 0, false, 0L, null, null, 0L, 1020);
        }
        if (dVar instanceof p2.b) {
            return p2.b.i((p2.b) dVar, c1000b.a(), R(), null, 0, 0L, 28);
        }
        throw new NoWhenBranchMatchedException();
    }

    public C1304a u(Context context, Point point) {
        o6.j.e(point, "position");
        C0999a a3 = ((C1000b) this.f5082e).a();
        C0999a R5 = R();
        String string = context.getString(R.string.default_dumb_click_name);
        o6.j.d(string, "getString(...)");
        return new C1304a(a3, R5, string, 0, D2.f.r(context).getInt("Last_Click_Repeat_Count", 1), false, D2.f.r(context).getLong("Last_Click_Repeat_Delay", 0L), point, D2.f.r(context).getLong("Last_Click_Press_Duration", context.getResources().getInteger(R.integer.default_dumb_click_press_duration)));
    }

    public p2.b v(Context context) {
        C0999a a3 = ((C1000b) this.f5082e).a();
        C0999a R5 = R();
        String string = context.getString(R.string.default_dumb_pause_name);
        o6.j.d(string, "getString(...)");
        return new p2.b(a3, R5, string, 0, D2.f.r(context).getLong("Last_Pause_Duration", context.getResources().getInteger(R.integer.default_dumb_pause_duration)));
    }

    public p2.c w(Context context, Point point, Point point2) {
        o6.j.e(point, "from");
        o6.j.e(point2, "to");
        C0999a a3 = ((C1000b) this.f5082e).a();
        C0999a R5 = R();
        String string = context.getString(R.string.default_dumb_swipe_name);
        o6.j.d(string, "getString(...)");
        return new p2.c(a3, R5, string, 0, D2.f.r(context).getInt("Last_Swipe_Repeat_Count", 1), false, D2.f.r(context).getLong("Last_Swipe_Repeat_Delay", 0L), point, point2, D2.f.r(context).getLong("Last_Swipe_Duration", context.getResources().getInteger(R.integer.default_dumb_swipe_duration)));
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f5081d) {
            case 0:
                Object x8 = ((C4.e) this.f5082e).x(new J(interfaceC0234g, (w) this.f5083f, 22), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 1:
                Object x9 = ((InterfaceC0233f) this.f5082e).x(new J(interfaceC0234g, (R4.i) this.f5083f, 27), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case 12:
                ((i0) this.f5082e).x(new L3.M(interfaceC0234g, 9, (c2.z) this.f5083f), interfaceC0617c);
                return EnumC0646a.f10656d;
            case 22:
                Object x10 = ((Y3.z) this.f5082e).x(new L3.M(interfaceC0234g, 10, (k4.X) this.f5083f), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            case 23:
                ((P) this.f5082e).x(new L3.M(interfaceC0234g, 11, (l4.p) this.f5083f), interfaceC0617c);
                return EnumC0646a.f10656d;
            case 24:
                Object x11 = ((H3.v) this.f5082e).x(new C1018q(interfaceC0234g, (C1250u) this.f5083f), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
            default:
                Object x12 = ((g0.L) this.f5082e).x(new L3.M(interfaceC0234g, 12, (o4.O) this.f5083f), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(List list, AbstractC0713c abstractC0713c) {
        q1.f fVar;
        int i4;
        Iterator it;
        int i8;
        if (abstractC0713c instanceof q1.f) {
            fVar = (q1.f) abstractC0713c;
            int i9 = fVar.k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                fVar.k = i9 - Integer.MIN_VALUE;
                Object obj = fVar.f13927i;
                i4 = fVar.k;
                if (i4 == 0) {
                    if (i4 == 1) {
                        i8 = fVar.f13926h;
                        it = fVar.f13925g;
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    it = list.iterator();
                    i8 = 0;
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    File file = new File((File) this.f5083f, str);
                    if (!file.exists()) {
                        break;
                    }
                    AbstractC0160s abstractC0160s = (AbstractC0160s) this.f5082e;
                    q1.g gVar = new q1.g(str, file, null);
                    fVar.f13925g = it;
                    fVar.f13926h = i8;
                    fVar.k = 1;
                    Object A2 = AbstractC0166y.A(abstractC0160s, gVar, fVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (A2 == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return Z5.y.f7506a;
            }
        }
        fVar = new q1.f(this, abstractC0713c);
        Object obj2 = fVar.f13927i;
        i4 = fVar.k;
        if (i4 == 0) {
        }
        while (it.hasNext()) {
        }
        return Z5.y.f7506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [Z5.j] */
    public D6.d z(C0447h c0447h, InterfaceC0588g interfaceC0588g) {
        Map map;
        o6.j.e(c0447h, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        InterfaceC0004e f8 = AbstractC0021w.f((C6.A) this.f5082e, AbstractC0842e.m(interfaceC0588g, c0447h.f8105f), (A4.a) this.f5083f);
        if (c0447h.f8106g.size() != 0 && !y7.l.f(f8)) {
            int i4 = AbstractC0890e.f11774a;
            if (AbstractC0890e.m(f8, EnumC0005f.f745h)) {
                Collection G8 = f8.G();
                o6.j.d(G8, "getConstructors(...)");
                C0050j c0050j = (C0050j) AbstractC0436k.H0(G8);
                if (c0050j != null) {
                    List z02 = c0050j.z0();
                    o6.j.d(z02, "getValueParameters(...)");
                    int N02 = a6.x.N0(AbstractC0438m.d0(z02, 10));
                    if (N02 < 16) {
                        N02 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
                    for (Object obj : z02) {
                        linkedHashMap.put(((F6.U) obj).getName(), obj);
                    }
                    List<C0445f> list = c0447h.f8106g;
                    o6.j.d(list, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (C0445f c0445f : list) {
                        o6.j.b(c0445f);
                        F6.U u8 = (F6.U) linkedHashMap.get(AbstractC0842e.t(interfaceC0588g, c0445f.f8079f));
                        k7.g gVar = null;
                        if (u8 != null) {
                            C0725e t8 = AbstractC0842e.t(interfaceC0588g, c0445f.f8079f);
                            AbstractC1759v b4 = u8.b();
                            o6.j.d(b4, "getType(...)");
                            C0444e c0444e = c0445f.f8080g;
                            o6.j.d(c0444e, "getValue(...)");
                            k7.g Y = Y(b4, c0444e, interfaceC0588g);
                            if (O(Y, b4, c0444e)) {
                                gVar = Y;
                            }
                            if (gVar == null) {
                                String str = "Unexpected argument value: actual type " + c0444e.f8061f + " != expected type " + b4;
                                o6.j.e(str, "message");
                                gVar = new k7.j(str);
                            }
                            gVar = new Z5.j(t8, gVar);
                        }
                        if (gVar != null) {
                            arrayList.add(gVar);
                        }
                    }
                    map = a6.x.R0(arrayList);
                    return new D6.d(f8.l(), map, C6.O.f726a);
                }
            }
        }
        map = a6.t.f7767d;
        return new D6.d(f8.l(), map, C6.O.f726a);
    }

    public r(N n3, M m6) {
        this.f5081d = 13;
        o6.j.e(n3, "strings");
        o6.j.e(m6, "qualifiedNames");
        this.f5082e = n3;
        this.f5083f = m6;
    }

    public r(C6.A a3, A4.a aVar, r7.a aVar2) {
        this.f5081d = 28;
        o6.j.e(a3, "module");
        o6.j.e(aVar2, "protocol");
        this.f5082e = aVar2;
        this.f5083f = new r(a3, aVar);
    }

    public r(T t8) {
        this.f5081d = 16;
        this.f5082e = t8;
        this.f5083f = new CopyOnWriteArrayList();
    }

    public r(int i4) {
        this.f5081d = i4;
        switch (i4) {
            case 17:
                this.f5082e = new Object();
                return;
            case 18:
                this.f5082e = new Rect();
                this.f5083f = new Rect();
                return;
            default:
                this.f5082e = new Object();
                this.f5083f = null;
                return;
        }
    }

    public r(C6.A a3, A4.a aVar) {
        this.f5081d = 29;
        o6.j.e(a3, "module");
        o6.j.e(aVar, "notFoundClasses");
        this.f5082e = a3;
        this.f5083f = aVar;
    }

    public r(AbstractC0160s abstractC0160s, File file) {
        this.f5081d = 26;
        o6.j.e(file, "appDataDir");
        this.f5082e = abstractC0160s;
        this.f5083f = file;
    }

    public r(I i4) {
        this.f5081d = 9;
        this.f5082e = new Object();
        this.f5083f = i4;
    }

    public r(Context context, AbstractC0160s abstractC0160s, String str, List list, int i4) {
        this.f5081d = 20;
        list = (i4 & 8) != 0 ? a6.s.f7766d : list;
        H7.o oVar = new H7.o(20);
        o6.j.e(list, "migrations");
        W0.c cVar = new W0.c(23, new H(new X.L(new M1.e(13, new A1.n(context, 18, str))), E2.d.y(new C0335c(list, null)), new W5.a(3, new M7.c(str, 11, oVar)), AbstractC0166y.b(E2.d.C(abstractC0160s, AbstractC0166y.c()))));
        this.f5082e = new W0.c(23, cVar);
        this.f5083f = cVar.g();
    }

    public r(F3.a aVar, HashMap hashMap, HashMap hashMap2) {
        this.f5081d = 7;
        this.f5082e = aVar;
        this.f5083f = hashMap;
    }

    public r(Animation animation) {
        this.f5081d = 15;
        this.f5082e = animation;
        this.f5083f = null;
    }

    public r(N7.h hVar, N7.b bVar) {
        this.f5081d = 3;
        N7.d dVar = N7.d.f3802l;
        N7.e eVar = N7.e.f3803l;
        this.f5082e = hVar;
        this.f5083f = bVar;
    }

    public r(Animator animator) {
        this.f5081d = 15;
        this.f5082e = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5083f = animatorSet;
        animatorSet.play(animator);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e0.a, android.text.Editable$Factory] */
    public r(EditText editText) {
        this.f5081d = 14;
        this.f5082e = editText;
        e0.i iVar = new e0.i(editText);
        this.f5083f = iVar;
        editText.addTextChangedListener(iVar);
        if (C0633a.f10576b == null) {
            synchronized (C0633a.f10575a) {
                try {
                    if (C0633a.f10576b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            C0633a.f10577c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0633a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0633a.f10576b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0633a.f10576b);
    }

    public r(AbstractC0803l abstractC0803l) {
        this.f5081d = 19;
        Iterator it = ((androidx.datastore.preferences.protobuf.X) abstractC0803l.f11243d.f11238a.entrySet()).iterator();
        this.f5082e = it;
        if (it.hasNext()) {
            this.f5083f = (Map.Entry) it.next();
        }
    }

    public r(X6.q qVar, String str) {
        this.f5081d = 5;
        o6.j.e(str, "className");
        this.f5083f = qVar;
        this.f5082e = str;
    }

    public r(CardView cardView) {
        this.f5081d = 27;
        this.f5083f = cardView;
    }

    public r(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C, b0 b0Var) {
        this.f5081d = 21;
        this.f5083f = layoutInflaterFactory2C0860C;
        this.f5082e = b0Var;
    }
}
