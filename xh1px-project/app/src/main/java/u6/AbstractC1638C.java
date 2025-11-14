package u6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0005f;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0019u;
import C6.h0;
import I6.AbstractC0065d;
import K3.ViewOnClickListenerC0094h;
import L6.M;
import L6.N;
import L6.S;
import L6.U;
import L6.W;
import L6.X;
import L6.a0;
import L6.c0;
import L6.f0;
import P.F;
import P.O;
import X.C0336d;
import X.C0338f;
import X.C0342j;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.C0433h;
import a7.C0444e;
import a7.C0447h;
import a7.C0463y;
import a7.EnumC0462x;
import a7.I;
import a7.P;
import a7.Q;
import a7.T;
import a7.Y;
import a7.b0;
import a7.d0;
import a7.e0;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import c7.AbstractC0586e;
import c7.C0587f;
import c7.C0589h;
import c7.C0590i;
import c7.InterfaceC0588g;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import e6.EnumC0646a;
import f4.C0708a;
import f4.C0709b;
import f6.AbstractC0713c;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import g7.C0799h;
import i.C0865d;
import i.DialogInterfaceC0869h;
import i7.AbstractC0890e;
import j2.C0902b;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import n7.C1169b;
import o.p1;
import p7.InterfaceC1333o;
import s3.AbstractC1492c;
import t0.s0;
import u5.C1635a;
import w6.o0;
import w7.AbstractC1759v;

/* renamed from: u6.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1638C {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15358d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static Thread f15359e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15360f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f15361g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f15362h = 0;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        o6.j.c(r0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        r0 = (C6.InterfaceC0004e) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final T6.D A(InterfaceC0004e interfaceC0004e) {
        T6.D d2;
        InterfaceC0004e interfaceC0004e2;
        o6.j.e(interfaceC0004e, "<this>");
        int i4 = AbstractC1098d.f12556a;
        Iterator it = interfaceC0004e.l().B0().d().iterator();
        while (true) {
            d2 = null;
            if (it.hasNext()) {
                AbstractC1759v abstractC1759v = (AbstractC1759v) it.next();
                if (!z6.h.y(abstractC1759v)) {
                    InterfaceC0007h c6 = abstractC1759v.B0().c();
                    if (AbstractC0890e.m(c6, EnumC0005f.f741d) || AbstractC0890e.m(c6, EnumC0005f.f743f)) {
                        break;
                    }
                }
            } else {
                interfaceC0004e2 = null;
                break;
            }
        }
        if (interfaceC0004e2 == null) {
            return null;
        }
        InterfaceC1333o o02 = interfaceC0004e2.o0();
        if (o02 instanceof T6.D) {
            d2 = (T6.D) o02;
        }
        if (d2 == null) {
            return A(interfaceC0004e2);
        }
        return d2;
    }

    public static boolean B(D6.j jVar, C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        if (jVar.e(c0723c) != null) {
            return true;
        }
        return false;
    }

    public static final boolean D(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 25) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final A4.d G(int i4, p1 p1Var) {
        Integer num;
        Integer num2;
        C0589h c0589h;
        Z5.c cVar;
        Integer num3;
        String str;
        A4.d dVar;
        e0 e0Var;
        int i8;
        f0 f0Var;
        Z5.c cVar2;
        int i9;
        L6.e0 e0Var2;
        Integer num4;
        A4.d dVar2 = new A4.d();
        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) p1Var.f13349e;
        C0590i c0590i = (C0590i) p1Var.f13351g;
        o6.j.e(interfaceC0588g, "nameResolver");
        a7.f0 f0Var2 = (a7.f0) AbstractC0436k.s0(i4, c0590i.f9729a);
        C0589h c0589h2 = C0589h.f9724d;
        String str2 = null;
        if (f0Var2 == null) {
            dVar = null;
        } else {
            if ((f0Var2.f8086e & 1) == 1) {
                num = Integer.valueOf(f0Var2.f8087f);
            } else {
                num = null;
            }
            if ((f0Var2.f8086e & 2) == 2) {
                num2 = Integer.valueOf(f0Var2.f8088g);
            } else {
                num2 = null;
            }
            if (num2 != null) {
                c0589h = new C0589h(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
            } else if (num != null) {
                c0589h = new C0589h(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
            } else {
                c0589h = c0589h2;
            }
            d0 d0Var = f0Var2.f8089h;
            o6.j.b(d0Var);
            int ordinal = d0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        cVar = Z5.c.f7477f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    cVar = Z5.c.f7476e;
                }
            } else {
                cVar = Z5.c.f7475d;
            }
            Z5.c cVar3 = cVar;
            if ((f0Var2.f8086e & 8) == 8) {
                num3 = Integer.valueOf(f0Var2.f8090i);
            } else {
                num3 = null;
            }
            if ((f0Var2.f8086e & 16) == 16) {
                str = interfaceC0588g.getString(f0Var2.j);
            } else {
                str = null;
            }
            e0 e0Var3 = f0Var2.k;
            o6.j.d(e0Var3, "getVersionKind(...)");
            dVar = new A4.d(c0589h, e0Var3, cVar3, num3, str);
        }
        if (dVar != null) {
            if (dVar != null) {
                e0Var = (e0) dVar.f296f;
            } else {
                e0Var = null;
            }
            if (e0Var == null) {
                i8 = -1;
            } else {
                i8 = M6.j.f3498a[e0Var.ordinal()];
            }
            if (i8 != -1) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            f0Var = f0.f3137f;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        f0Var = f0.f3136e;
                    }
                } else {
                    f0Var = f0.f3135d;
                }
            } else {
                f0Var = f0.f3138g;
            }
            if (dVar != null) {
                cVar2 = (Z5.c) dVar.f297g;
            } else {
                cVar2 = null;
            }
            if (cVar2 == null) {
                i9 = -1;
            } else {
                i9 = M6.j.f3499b[cVar2.ordinal()];
            }
            if (i9 != -1) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        e0Var2 = L6.e0.f3132e;
                    }
                } else {
                    e0Var2 = L6.e0.f3131d;
                }
                dVar2.f295e = f0Var;
                dVar2.f296f = e0Var2;
                if (dVar == null) {
                    num4 = (Integer) dVar.f298h;
                } else {
                    num4 = null;
                }
                dVar2.f297g = num4;
                if (dVar != null) {
                    str2 = (String) dVar.f299i;
                }
                dVar2.f298h = str2;
                if (dVar != null) {
                    c0589h2 = (C0589h) dVar.f295e;
                }
                dVar2.f299i = new L6.d0(c0589h2.f9725a, c0589h2.f9726b, c0589h2.f9727c);
                return dVar2;
            }
            e0Var2 = L6.e0.f3133f;
            dVar2.f295e = f0Var;
            dVar2.f296f = e0Var2;
            if (dVar == null) {
            }
            dVar2.f297g = num4;
            if (dVar != null) {
            }
            dVar2.f298h = str2;
            if (dVar != null) {
            }
            dVar2.f299i = new L6.d0(c0589h2.f9725a, c0589h2.f9726b, c0589h2.f9727c);
            return dVar2;
        }
        throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table");
    }

    public static void H(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void K(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z8;
        WeakHashMap weakHashMap = O.f4214a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z9 = false;
        int i4 = 1;
        if (onLongClickListener != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (hasOnClickListeners || z8) {
            z9 = true;
        }
        checkableImageButton.setFocusable(z9);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z8);
        if (!z9) {
            i4 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i4);
    }

    public static void L(View view, G5.h hVar) {
        C1635a c1635a = hVar.f1769d.f1753b;
        if (c1635a != null && c1635a.f15351a) {
            float f8 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = O.f4214a;
                f8 += F.e((View) parent);
            }
            G5.g gVar = hVar.f1769d;
            if (gVar.f1761l != f8) {
                gVar.f1761l = f8;
                hVar.t();
            }
        }
    }

    public static final String M(InterfaceC0004e interfaceC0004e, String str) {
        String n3;
        o6.j.e(interfaceC0004e, "classDescriptor");
        o6.j.e(str, "jvmDescriptor");
        String str2 = B6.d.f457a;
        C0722b f8 = B6.d.f(AbstractC1098d.g(interfaceC0004e).f10797a);
        if (f8 != null) {
            n3 = C1169b.e(f8);
        } else {
            n3 = AbstractC0405a.n(interfaceC0004e, Y6.f.f7221d);
        }
        o6.j.e(n3, "internalName");
        return n3 + '.' + str;
    }

    public static final C0014o N(h0 h0Var) {
        o6.j.e(h0Var, "<this>");
        C0014o c0014o = (C0014o) P6.o.f4577d.get(h0Var);
        if (c0014o == null) {
            return AbstractC0015p.f(h0Var);
        }
        return c0014o;
    }

    public static final S O(C0463y c0463y, p1 p1Var) {
        T t8;
        S s8 = new S();
        int i4 = c0463y.f8252f;
        if ((c0463y.f8251e & 4) == 4) {
            EnumC0462x enumC0462x = c0463y.f8254h;
            if (enumC0462x != null) {
                int ordinal = enumC0462x.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        F6.B b4 = (F6.B) p1Var.f13350f;
        int i8 = c0463y.f8251e;
        if ((i8 & 8) == 8) {
            t8 = c0463y.f8255i;
        } else if ((i8 & 16) == 16) {
            t8 = b4.a(c0463y.j);
        } else {
            t8 = null;
        }
        if (t8 != null) {
            Q(t8, p1Var);
        }
        List<C0463y> list = c0463y.k;
        o6.j.d(list, "getAndArgumentList(...)");
        for (C0463y c0463y2 : list) {
            o6.j.b(c0463y2);
            s8.f3080a.add(O(c0463y2, p1Var));
        }
        List<C0463y> list2 = c0463y.f8256l;
        o6.j.d(list2, "getOrArgumentList(...)");
        for (C0463y c0463y3 : list2) {
            o6.j.b(c0463y3);
            s8.f3081b.add(O(c0463y3, p1Var));
        }
        return s8;
    }

    public static final W P(I i4, p1 p1Var) {
        int x8;
        int x9;
        d7.c cVar;
        d7.c cVar2;
        d7.c cVar3;
        o6.j.e(i4, "<this>");
        int i8 = i4.f7856g;
        String string = ((InterfaceC0588g) p1Var.f13349e).getString(i4.f7858i);
        if ((i4.f7855f & 256) == 256) {
            x8 = i4.f7867t;
        } else {
            x8 = x(i4.f7856g);
        }
        if ((i4.f7855f & 512) == 512) {
            x9 = i4.f7868u;
        } else {
            x9 = x(i4.f7856g);
        }
        W w8 = new W(i8, x8, x9, string);
        List list = i4.f7859l;
        o6.j.d(list, "getTypeParameterList(...)");
        p1 m6 = p1Var.m(list);
        F6.B b4 = (F6.B) m6.f13350f;
        List<Y> list2 = i4.f7859l;
        o6.j.d(list2, "getTypeParameterList(...)");
        for (Y y4 : list2) {
            o6.j.b(y4);
            w8.f3100d.add(R(y4, m6));
        }
        T k02 = AbstractC0405a.k0(i4, b4);
        if (k02 != null) {
            Q(k02, m6);
        }
        Iterator it = AbstractC0405a.r(i4, b4).iterator();
        while (it.hasNext()) {
            w8.f3102f.add(Q((T) it.next(), m6));
        }
        if ((i4.f7855f & 128) == 128) {
            b0 b0Var = i4.f7866s;
            o6.j.d(b0Var, "getSetterValueParameter(...)");
            S(b0Var, m6);
        }
        Q(AbstractC0405a.s0(i4, b4), m6);
        List<Integer> list3 = i4.f7869v;
        o6.j.d(list3, "getVersionRequirementList(...)");
        for (Integer num : list3) {
            o6.j.b(num);
            w8.f3103g.add(G(num.intValue(), m6));
        }
        Iterator it2 = ((List) m6.k).iterator();
        while (it2.hasNext()) {
            ((O6.d) ((N6.k) it2.next())).getClass();
            InterfaceC0588g interfaceC0588g = (InterfaceC0588g) m6.f13349e;
            N6.d dVar = O6.e.f4048a;
            o6.j.e(dVar, "type");
            List<C0447h> list4 = i4.f7871x;
            o6.j.d(list4, "getAnnotationList(...)");
            for (C0447h c0447h : list4) {
                o6.j.b(c0447h);
                w8.f3104h.add(AbstractC1492c.D(c0447h, interfaceC0588g));
            }
            List<C0447h> list5 = i4.f7872y;
            o6.j.d(list5, "getGetterAnnotationList(...)");
            ArrayList arrayList = w8.f3098b.f3107b;
            for (C0447h c0447h2 : list5) {
                o6.j.b(c0447h2);
                arrayList.add(AbstractC1492c.D(c0447h2, interfaceC0588g));
            }
            X x10 = w8.f3099c;
            if (x10 != null) {
                List<C0447h> list6 = i4.f7873z;
                o6.j.d(list6, "getSetterAnnotationList(...)");
                ArrayList arrayList2 = x10.f3107b;
                for (C0447h c0447h3 : list6) {
                    o6.j.b(c0447h3);
                    arrayList2.add(AbstractC1492c.D(c0447h3, interfaceC0588g));
                }
            }
            List<C0447h> list7 = i4.f7849A;
            o6.j.d(list7, "getExtensionReceiverAnnotationList(...)");
            for (C0447h c0447h4 : list7) {
                o6.j.b(c0447h4);
                w8.f3101e.add(AbstractC1492c.D(c0447h4, interfaceC0588g));
            }
            List<C0447h> list8 = i4.f7850B;
            o6.j.d(list8, "getBackingFieldAnnotationList(...)");
            for (C0447h c0447h5 : list8) {
                o6.j.b(c0447h5);
                w8.f3105i.add(AbstractC1492c.D(c0447h5, interfaceC0588g));
            }
            List<C0447h> list9 = i4.f7851C;
            o6.j.d(list9, "getDelegateFieldAnnotationList(...)");
            for (C0447h c0447h6 : list9) {
                o6.j.b(c0447h6);
                w8.j.add(AbstractC1492c.D(c0447h6, interfaceC0588g));
            }
            C0799h c0799h = e7.g.f10671a;
            e7.d b9 = e7.g.b(i4, interfaceC0588g, b4, true);
            g7.n nVar = d7.k.f10515d;
            o6.j.d(nVar, "propertySignature");
            d7.e eVar = (d7.e) E2.d.t(i4, nVar);
            d7.c cVar4 = null;
            if (eVar != null && eVar.i()) {
                cVar = eVar.f10478h;
            } else {
                cVar = null;
            }
            if (eVar != null && (eVar.f10475e & 8) == 8) {
                cVar2 = eVar.f10479i;
            } else {
                cVar2 = null;
            }
            Object k = i4.k(d7.k.f10516e);
            o6.j.d(k, "getExtension(...)");
            ((Number) k).intValue();
            if (b9 != null) {
                String str = b9.f10663e;
                String str2 = b9.f10664f;
                o6.j.e(str, "name");
                o6.j.e(str2, "descriptor");
            }
            if (cVar != null) {
                interfaceC0588g.getString(cVar.f10463f);
                interfaceC0588g.getString(cVar.f10464g);
            }
            if (cVar2 != null) {
                interfaceC0588g.getString(cVar2.f10463f);
                interfaceC0588g.getString(cVar2.f10464g);
            }
            if (eVar != null && (eVar.f10475e & 2) == 2) {
                cVar3 = eVar.f10477g;
            } else {
                cVar3 = null;
            }
            if (cVar3 != null) {
                interfaceC0588g.getString(cVar3.f10463f);
                interfaceC0588g.getString(cVar3.f10464g);
            }
            if (eVar != null && (eVar.f10475e & 16) == 16) {
                cVar4 = eVar.j;
            }
            if (cVar4 != null) {
                interfaceC0588g.getString(cVar4.f10463f);
                interfaceC0588g.getString(cVar4.f10464g);
            }
        }
        return w8;
    }

    /* JADX WARN: Type inference failed for: r3v30, types: [L6.U, java.lang.Object] */
    public static final L6.Y Q(T t8, p1 p1Var) {
        D2.f o7;
        L6.Y y4;
        L6.Y y5;
        F6.B b4 = (F6.B) p1Var.f13350f;
        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) p1Var.f13349e;
        L6.Y y8 = new L6.Y((t8.f7937h ? 1 : 0) + (t8.f7947t << 1));
        if (t8.p()) {
            o7 = new M(AbstractC1492c.n(interfaceC0588g, t8.f7939l));
        } else {
            int i4 = t8.f7935f;
            if ((i4 & 128) == 128) {
                o7 = new N(AbstractC1492c.n(interfaceC0588g, t8.f7942o));
            } else if ((i4 & 32) == 32) {
                o7 = new L6.O(t8.f7940m);
            } else if ((i4 & 64) == 64) {
                Integer c6 = p1Var.c(t8.f7941n);
                if (c6 != null) {
                    o7 = new L6.O(c6.intValue());
                } else {
                    throw new InconsistentKotlinMetadataException("No type parameter id for ".concat(interfaceC0588g.getString(t8.f7941n)));
                }
            } else {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type");
            }
        }
        y8.f3109b = o7;
        Iterator it = t8.f7936g.iterator();
        while (true) {
            U u8 = null;
            c0 c0Var = null;
            String str = null;
            if (it.hasNext()) {
                Q q6 = (Q) it.next();
                P p8 = q6.f7915f;
                if (p8 != null) {
                    int ordinal = p8.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                c0Var = c0.f3124d;
                            }
                        } else {
                            c0Var = c0.f3126f;
                        }
                    } else {
                        c0Var = c0.f3125e;
                    }
                    ArrayList arrayList = y8.f3110c;
                    if (c0Var != null) {
                        T F02 = AbstractC0405a.F0(q6, b4);
                        if (F02 != null) {
                            arrayList.add(new a0(c0Var, Q(F02, p1Var)));
                        } else {
                            throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type");
                        }
                    } else {
                        arrayList.add(a0.f3119c);
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                T b9 = AbstractC0405a.b(t8, b4);
                if (b9 != null) {
                    y4 = Q(b9, p1Var);
                } else {
                    y4 = null;
                }
                y8.f3111d = y4;
                T h02 = AbstractC0405a.h0(t8, b4);
                if (h02 != null) {
                    y5 = Q(h02, p1Var);
                } else {
                    y5 = null;
                }
                y8.f3112e = y5;
                T x8 = AbstractC0405a.x(t8, b4);
                if (x8 != null) {
                    L6.Y Q5 = Q(x8, p1Var);
                    if ((t8.f7935f & 2) == 2) {
                        str = interfaceC0588g.getString(t8.f7938i);
                    }
                    ?? obj = new Object();
                    obj.f3086a = Q5;
                    obj.f3087b = str;
                    u8 = obj;
                }
                y8.f3113f = u8;
                Iterator it2 = ((List) p1Var.k).iterator();
                while (it2.hasNext()) {
                    ((O6.d) ((N6.k) it2.next())).getClass();
                    N6.d dVar = O6.f.f4049c;
                    o6.j.e(dVar, "type");
                    O6.f fVar = (O6.f) ((N6.g) E2.b.L(y8.f3114g, dVar));
                    Object k = t8.k(d7.k.f10518g);
                    o6.j.d(k, "getExtension(...)");
                    fVar.f4050a = ((Boolean) k).booleanValue();
                    for (C0447h c0447h : (List) t8.k(d7.k.f10517f)) {
                        ArrayList arrayList2 = fVar.f4051b;
                        o6.j.b(c0447h);
                        arrayList2.add(AbstractC1492c.D(c0447h, interfaceC0588g));
                    }
                }
                return y8;
            }
        }
    }

    public static final S R(Y y4, p1 p1Var) {
        c0 c0Var;
        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) p1Var.f13349e;
        a7.X x8 = y4.j;
        if (x8 != null) {
            int ordinal = x8.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c0Var = c0.f3124d;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    c0Var = c0.f3126f;
                }
            } else {
                c0Var = c0.f3125e;
            }
            boolean z8 = y4.f7989i;
            S s8 = new S(z8 ? 1 : 0, interfaceC0588g.getString(y4.f7988h), c0Var);
            Iterator it = AbstractC0405a.K0(y4, (F6.B) p1Var.f13350f).iterator();
            while (it.hasNext()) {
                s8.f3080a.add(Q((T) it.next(), p1Var));
            }
            Iterator it2 = ((List) p1Var.k).iterator();
            while (it2.hasNext()) {
                ((O6.d) ((N6.k) it2.next())).getClass();
                N6.d dVar = O6.g.f4052b;
                o6.j.e(dVar, "type");
                O6.g gVar = (O6.g) ((N6.h) E2.b.L(s8.f3081b, dVar));
                for (C0447h c0447h : (List) y4.k(d7.k.f10519h)) {
                    ArrayList arrayList = gVar.f4053a;
                    o6.j.b(c0447h);
                    arrayList.add(AbstractC1492c.D(c0447h, interfaceC0588g));
                }
            }
            return s8;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final L6.b0 S(b0 b0Var, p1 p1Var) {
        int i4 = b0Var.f8016g;
        int i8 = b0Var.f8017h;
        InterfaceC0588g interfaceC0588g = (InterfaceC0588g) p1Var.f13349e;
        L6.b0 b0Var2 = new L6.b0(interfaceC0588g.getString(i8), i4);
        F6.B b4 = (F6.B) p1Var.f13350f;
        Q(AbstractC0405a.G0(b0Var, b4), p1Var);
        T L02 = AbstractC0405a.L0(b0Var, b4);
        if (L02 != null) {
            Q(L02, p1Var);
        }
        if ((b0Var.f8015f & 64) == 64) {
            C0444e c0444e = b0Var.f8021n;
            o6.j.d(c0444e, "getAnnotationParameterDefaultValue(...)");
            AbstractC1492c.E(c0444e, interfaceC0588g);
        }
        Iterator it = ((List) p1Var.k).iterator();
        while (it.hasNext()) {
            ((O6.d) ((N6.k) it.next())).getClass();
            List<C0447h> list = b0Var.f8020m;
            o6.j.d(list, "getAnnotationList(...)");
            for (C0447h c0447h : list) {
                o6.j.b(c0447h);
                b0Var2.f3123b.add(AbstractC1492c.D(c0447h, interfaceC0588g));
            }
        }
        return b0Var2;
    }

    public static final C0708a T(C0902b c0902b, Context context, boolean z8, boolean z9) {
        int i4;
        int i8;
        int i9;
        String string;
        o6.j.e(c0902b, "<this>");
        int i10 = c0902b.f11795g;
        int i11 = c0902b.f11796h;
        String str = c0902b.f11791c;
        boolean z10 = c0902b.f11797i;
        if (z10) {
            i4 = R.drawable.ic_confirm;
        } else {
            i4 = R.drawable.ic_cancel;
        }
        int i12 = i4;
        if (z10) {
            i8 = R.string.item_image_condition_visible;
        } else {
            i8 = R.string.item_image_condition_not_visible;
        }
        int i13 = i8;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    i9 = R.drawable.ic_detect_in_area;
                } else {
                    throw new IllegalStateException(A.j.l("Can't get detection type icon, unknown type ", i11));
                }
            } else {
                i9 = R.drawable.ic_detect_whole_screen;
            }
        } else {
            i9 = R.drawable.ic_detect_exact;
        }
        int i14 = i9;
        if (z8) {
            string = context.getString(R.string.item_image_condition_desc_threshold, Integer.valueOf(i10));
            o6.j.d(string, "getString(...)");
        } else {
            string = context.getString(R.string.item_image_condition_desc_complete_threshold, Integer.valueOf(i10));
            o6.j.d(string, "getString(...)");
        }
        return new C0708a(c0902b, str, z9, i12, i13, i14, string);
    }

    public static final Integer c(RecyclerView recyclerView, View view) {
        int i4;
        t0.U adapter;
        s0 N8 = RecyclerView.N(view);
        if (N8 != null) {
            i4 = N8.b();
        } else {
            i4 = -1;
        }
        if (i4 != -1 && (adapter = recyclerView.getAdapter()) != null) {
            return Integer.valueOf(adapter.c(i4));
        }
        return null;
    }

    public static final boolean d(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (o6.j.f(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(List list, C0342j c0342j, AbstractC0713c abstractC0713c) {
        C0336d c0336d;
        int i4;
        List list2;
        Iterator it;
        o6.u uVar;
        Throwable th;
        if (abstractC0713c instanceof C0336d) {
            C0336d c0336d2 = (C0336d) abstractC0713c;
            int i8 = c0336d2.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0336d2.j = i8 - Integer.MIN_VALUE;
                c0336d = c0336d2;
                Object obj = c0336d.f6721i;
                i4 = c0336d.j;
                Object obj2 = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            it = c0336d.f6720h;
                            uVar = (o6.u) c0336d.f6719g;
                            try {
                                Z5.a.d(obj);
                                uVar = uVar;
                            } catch (Throwable th2) {
                                Object obj3 = uVar.f13642d;
                                if (obj3 == null) {
                                    uVar.f13642d = th2;
                                    uVar = uVar;
                                } else {
                                    Z5.a.a((Throwable) obj3, th2);
                                    uVar = uVar;
                                }
                            }
                            while (it.hasNext()) {
                                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) it.next();
                                c0336d.f6719g = uVar;
                                c0336d.f6720h = it;
                                c0336d.j = 2;
                                if (interfaceC1163b.m(c0336d) == obj2) {
                                    return obj2;
                                }
                            }
                            th = (Throwable) uVar.f13642d;
                            if (th == null) {
                                return Z5.y.f7506a;
                            }
                            throw th;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) c0336d.f6719g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    ArrayList arrayList = new ArrayList();
                    C0338f c0338f = new C0338f(list, arrayList, null);
                    c0336d.f6719g = arrayList;
                    c0336d.j = 1;
                    if (c0342j.a(c0338f, c0336d) != obj2) {
                        list2 = arrayList;
                    } else {
                        return obj2;
                    }
                }
                Object obj4 = new Object();
                it = list2.iterator();
                uVar = obj4;
                while (it.hasNext()) {
                }
                th = (Throwable) uVar.f13642d;
                if (th == null) {
                }
            }
        }
        c0336d = new AbstractC0713c(abstractC0713c);
        Object obj5 = c0336d.f6721i;
        i4 = c0336d.j;
        Object obj22 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        Object obj42 = new Object();
        it = list2.iterator();
        uVar = obj42;
        while (it.hasNext()) {
        }
        th = (Throwable) uVar.f13642d;
        if (th == null) {
        }
    }

    public static final String h(Type type) {
        String str;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                H7.k T5 = H7.m.T(type, C1637B.f15357l);
                StringBuilder sb = new StringBuilder();
                sb.append(((Class) H7.m.V(T5)).getName());
                int Q5 = H7.m.Q(T5);
                if (Q5 >= 0) {
                    if (Q5 != 0) {
                        str = "[]";
                        int i4 = 1;
                        if (Q5 != 1) {
                            StringBuilder sb2 = new StringBuilder(2 * Q5);
                            if (1 <= Q5) {
                                while (true) {
                                    sb2.append((CharSequence) "[]");
                                    if (i4 == Q5) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            str = sb2.toString();
                            o6.j.b(str);
                        }
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    return sb.toString();
                }
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + Q5 + '.').toString());
            }
            return cls.getName();
        }
        return type.toString();
    }

    public static void i(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void j(F3.h hVar, C0709b c0709b, InterfaceC1163b interfaceC1163b) {
        o6.j.e(hVar, "<this>");
        o6.j.e(interfaceC1163b, "conditionClickedListener");
        hVar.f1350g.setText(c0709b.f10763g);
        hVar.f1349f.setText(c0709b.j);
        hVar.f1351h.setImageResource(c0709b.f10765i);
        hVar.f1348e.setOnClickListener(new D2.a(interfaceC1163b, 10, c0709b));
    }

    public static int k(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i4 = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String a3 = E.f.a(context);
                            if (appOpsManager != null) {
                                i4 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, a3);
                            }
                            noteProxyOpNoThrow = i4;
                        }
                    } else {
                        noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final Type l(o6.k kVar, boolean z8) {
        Class k;
        int i4;
        o0 o0Var = (o0) kVar;
        InterfaceC1643d c6 = o0Var.c();
        if (c6 instanceof t) {
            return new z((t) c6);
        }
        if (c6 instanceof InterfaceC1642c) {
            InterfaceC1642c interfaceC1642c = (InterfaceC1642c) c6;
            if (z8) {
                k = h2.a.l(interfaceC1642c);
            } else {
                k = h2.a.k(interfaceC1642c);
            }
            List b4 = o0Var.b();
            if (!b4.isEmpty()) {
                if (k.isArray()) {
                    if (!k.getComponentType().isPrimitive()) {
                        v vVar = (v) AbstractC0436k.I0(b4);
                        if (vVar != null) {
                            w wVar = vVar.f15373a;
                            o6.k kVar2 = vVar.f15374b;
                            if (wVar == null) {
                                i4 = -1;
                            } else {
                                i4 = AbstractC1636A.f15356a[wVar.ordinal()];
                            }
                            if (i4 != -1 && i4 != 1) {
                                if (i4 != 2 && i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                o6.j.b(kVar2);
                                Type l6 = l(kVar2, false);
                                if (!(l6 instanceof Class)) {
                                    return new C1640a(l6);
                                }
                                return k;
                            }
                            return k;
                        }
                        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + o0Var);
                    }
                    return k;
                }
                return s(k, b4);
            }
            return k;
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + o0Var);
    }

    public static final boolean m(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !o6.j.a(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!m((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!AbstractC0434i.N0((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int n(Bundle bundle) {
        int i4;
        Iterator<String> it = bundle.keySet().iterator();
        int i8 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                i4 = n((Bundle) obj);
            } else if (obj instanceof Object[]) {
                i4 = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                i4 = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                i4 = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                i4 = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                i4 = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                i4 = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                i4 = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                i4 = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                i4 = Arrays.hashCode((boolean[]) obj);
            } else if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i8 = (i8 * 31) + i4;
        }
        return i8;
    }

    public static ImageView.ScaleType o(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 5) {
                            if (i4 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static final ArrayList p(ArrayList arrayList, List list, InterfaceC0019u interfaceC0019u) {
        AbstractC1759v abstractC1759v;
        o6.j.e(list, "oldValueParameters");
        arrayList.size();
        list.size();
        ArrayList X02 = AbstractC0436k.X0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(X02, 10));
        Iterator it = X02.iterator();
        while (it.hasNext()) {
            Z5.j jVar = (Z5.j) it.next();
            AbstractC1759v abstractC1759v2 = (AbstractC1759v) jVar.f7485d;
            F6.U u8 = (F6.U) jVar.f7486e;
            int i4 = u8.j;
            D6.j annotations = u8.getAnnotations();
            C0725e name = u8.getName();
            o6.j.d(name, "getName(...)");
            boolean N02 = u8.N0();
            boolean z8 = u8.f1512l;
            boolean z9 = u8.f1513m;
            if (u8.f1514n != null) {
                abstractC1759v = AbstractC1098d.j(interfaceC0019u).o().f(abstractC1759v2);
            } else {
                abstractC1759v = null;
            }
            AbstractC1759v abstractC1759v3 = abstractC1759v;
            C6.O h8 = u8.h();
            o6.j.d(h8, "getSource(...)");
            arrayList2.add(new F6.U(interfaceC0019u, null, i4, annotations, name, abstractC1759v2, N02, z8, z9, abstractC1759v3, h8));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r2 != Z6.a.f7514l) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (r0.f7535g != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z6.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H6.b q(Class cls) {
        Z6.b bVar;
        Y6.l lVar;
        Z6.a aVar;
        o6.j.e(cls, "klass");
        ?? obj = new Object();
        obj.f7532d = null;
        obj.f7533e = null;
        boolean z8 = false;
        obj.f7534f = 0;
        obj.f7535g = null;
        obj.f7536h = null;
        obj.f7537i = null;
        obj.j = null;
        obj.k = null;
        P.S g8 = o6.j.g(cls.getDeclaredAnnotations());
        while (g8.hasNext()) {
            Annotation annotation = (Annotation) g8.next();
            o6.j.b(annotation);
            Class k = h2.a.k(h2.a.g(annotation));
            C0722b a3 = AbstractC0065d.a(k);
            C0723c a4 = a3.a();
            if (a4.equals(P6.w.f4597a)) {
                lVar = new Z6.d(obj, 0);
            } else if (a4.equals(P6.w.f4609o)) {
                lVar = new W5.a(7, obj);
            } else if (!Z6.f.f7530l && obj.j == null && (aVar = (Z6.a) Z6.f.f7531m.get(a3)) != null) {
                obj.j = aVar;
                lVar = new Z6.d(obj, 1);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                q4.X.I(lVar, annotation, k);
            }
        }
        C0587f c0587f = C0587f.f9721g;
        if (obj.j != null && obj.f7532d != null) {
            int[] iArr = obj.f7532d;
            if ((obj.f7534f & 8) != 0) {
                z8 = true;
            }
            C0587f c0587f2 = new C0587f(iArr, z8);
            if (!c0587f2.b(c0587f)) {
                obj.f7537i = obj.f7535g;
                obj.f7535g = null;
            } else {
                Z6.a aVar2 = obj.j;
                if (aVar2 != Z6.a.CLASS) {
                    if (aVar2 != Z6.a.FILE_FACADE) {
                    }
                }
            }
            String[] strArr = obj.k;
            if (strArr != null) {
                e7.a.a(strArr);
            }
            bVar = new Z6.b(obj.j, c0587f2, obj.f7535g, obj.f7537i, obj.f7536h, obj.f7533e, obj.f7534f);
            if (bVar != null) {
                return null;
            }
            return new H6.b(cls, bVar);
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [s3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [s3.c, java.lang.Object] */
    public static AbstractC1492c r(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static final y s(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(z((v) it.next()));
            }
            return new y(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(z((v) it2.next()));
            }
            return new y(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        y s8 = s(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(z((v) it3.next()));
        }
        return new y(cls, s8, arrayList3);
    }

    public static final DialogInterfaceC0869h t(Context context, InterfaceC1163b interfaceC1163b) {
        Context u8 = E2.b.u(context);
        View inflate = LayoutInflater.from(u8).inflate(R.layout.dialog_stop_with_volume_down, (ViewGroup) null, false);
        int i4 = R.id.button_dont_show_again;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) E2.b.r(inflate, R.id.button_dont_show_again);
        if (materialCheckBox != null) {
            i4 = R.id.button_understood;
            MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.button_understood);
            if (materialButton != null) {
                i4 = R.id.desc_stop_with_volume_down;
                if (((MaterialTextView) E2.b.r(inflate, R.id.desc_stop_with_volume_down)) != null) {
                    i4 = R.id.dialog_content;
                    if (((NestedScrollView) E2.b.r(inflate, R.id.dialog_content)) != null) {
                        i4 = R.id.divider_bottom;
                        if (((MaterialDivider) E2.b.r(inflate, R.id.divider_bottom)) != null) {
                            i4 = R.id.divider_top;
                            if (((MaterialDivider) E2.b.r(inflate, R.id.divider_top)) != null) {
                                i4 = R.id.icon_volume_down;
                                if (((ImageView) E2.b.r(inflate, R.id.icon_volume_down)) != null) {
                                    i4 = R.id.text_dont_show_again;
                                    MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.text_dont_show_again);
                                    if (materialTextView != null) {
                                        i4 = R.id.title_stop_with_volume_down;
                                        if (((MaterialTextView) E2.b.r(inflate, R.id.title_stop_with_volume_down)) != null) {
                                            LinearLayout linearLayout = (LinearLayout) inflate;
                                            A.i iVar = new A.i(linearLayout, materialCheckBox, materialButton, materialTextView);
                                            s5.b bVar = new s5.b(u8);
                                            ((C0865d) bVar.f3288e).f11674q = linearLayout;
                                            DialogInterfaceC0869h c6 = bVar.c();
                                            materialTextView.setOnClickListener(new B2.b(11, iVar));
                                            materialButton.setOnClickListener(new ViewOnClickListenerC0094h(c6, interfaceC1163b, iVar, 1));
                                            return c6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O7.Y, java.lang.Object] */
    public static final void u(a8.b bVar, V7.a aVar, Object obj, FileOutputStream fileOutputStream) {
        char[] cArr;
        Object removeLast;
        byte[] bArr;
        Object removeLast2;
        o6.j.e(bVar, "<this>");
        o6.j.e(aVar, "serializer");
        ?? obj2 = new Object();
        obj2.f4114b = fileOutputStream;
        b8.b bVar2 = b8.b.f9254c;
        synchronized (bVar2) {
            C0433h c0433h = (C0433h) bVar2.f9255a;
            cArr = null;
            if (c0433h.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = c0433h.removeLast();
            }
            bArr = (byte[]) removeLast;
            if (bArr != null) {
                bVar2.f9256b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        if (bArr == null) {
            bArr = new byte[512];
        }
        obj2.f4115c = bArr;
        b8.d dVar = b8.d.f9257c;
        synchronized (dVar) {
            C0433h c0433h2 = (C0433h) dVar.f9255a;
            if (c0433h2.isEmpty()) {
                removeLast2 = null;
            } else {
                removeLast2 = c0433h2.removeLast();
            }
            char[] cArr2 = (char[]) removeLast2;
            if (cArr2 != null) {
                dVar.f9256b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        obj2.f4116d = cArr;
        try {
            b8.j.i(bVar, obj2, aVar, obj);
        } finally {
            obj2.f();
        }
    }

    public static D6.c v(D6.j jVar, C0723c c0723c) {
        Object obj;
        o6.j.e(c0723c, "fqName");
        Iterator it = jVar.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o6.j.a(((D6.c) obj).a(), c0723c)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (D6.c) obj;
    }

    public static Bitmap w(q1.e eVar, C0902b c0902b) {
        return eVar.a(c0902b.f11793e, c0902b.f11794f.width(), c0902b.f11794f.height());
    }

    public static final int x(int i4) {
        return AbstractC0586e.b(AbstractC0586e.f9699c.c(i4).booleanValue(), (a7.h0) AbstractC0586e.f9700d.c(i4), (a7.C) AbstractC0586e.f9701e.c(i4));
    }

    public static final Type z(v vVar) {
        w wVar = vVar.f15373a;
        if (wVar == null) {
            return C1639D.f15363f;
        }
        o6.k kVar = vVar.f15374b;
        o6.j.b(kVar);
        int ordinal = wVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new C1639D(l(kVar, true), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C1639D(null, l(kVar, true));
        }
        return l(kVar, true);
    }

    public abstract boolean C();

    public abstract View E(int i4);

    public abstract boolean F();

    public abstract void I(boolean z8);

    public abstract void J(boolean z8);

    public abstract TransformationMethod U(TransformationMethod transformationMethod);

    public abstract InputFilter[] y(InputFilter[] inputFilterArr);
}
