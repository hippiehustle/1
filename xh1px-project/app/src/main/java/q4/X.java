package q4;

import C6.InterfaceC0006g;
import I6.AbstractC0065d;
import I6.C0066e;
import L6.g0;
import L6.h0;
import L6.i0;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.GestureDetector;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import b6.C0533a;
import b6.C0535c;
import b6.C0538f;
import b6.C0541i;
import c7.AbstractC0586e;
import c7.C0587f;
import c7.C0590i;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import d0.C0593b;
import e1.C0637a;
import f4.C0708a;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import f7.C0728h;
import g4.C0780b;
import g6.C0790b;
import i.C0865d;
import i.DialogInterfaceC0869h;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import n7.EnumC1170c;
import p7.C1332n;
import p7.InterfaceC1333o;
import s3.AbstractC1492c;
import t6.C1586a;
import t6.C1587b;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14084b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f14085c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14086d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14087a;

    public /* synthetic */ X(int i4) {
        this.f14087a = i4;
    }

    public static final boolean B(String str, Bundle bundle) {
        o6.j.e(str, "key");
        if (bundle.containsKey(str) && bundle.get(str) == null) {
            return true;
        }
        return false;
    }

    public static final F7.f C(ArrayList arrayList) {
        F7.f fVar = new F7.f();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC1333o interfaceC1333o = (InterfaceC1333o) next;
            if (interfaceC1333o != null && interfaceC1333o != C1332n.f13842b) {
                fVar.add(next);
            }
        }
        return fVar;
    }

    public static final void D(o6.m mVar) {
        o6.j.d(AbstractC0586e.f9710p, "MEMBER_KIND");
        C0790b c0790b = g0.f3141f;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c0790b, 10));
        P.S s8 = new P.S(6, c0790b);
        while (s8.hasNext()) {
            arrayList.add(((g0) s8.next()).f3142d);
        }
    }

    public static final void E(o6.m mVar) {
        o6.j.d(AbstractC0586e.f9701e, "MODALITY");
        C0790b c0790b = h0.f3144f;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c0790b, 10));
        P.S s8 = new P.S(6, c0790b);
        while (s8.hasNext()) {
            arrayList.add(((h0) s8.next()).f3145d);
        }
    }

    public static void H(Y6.n nVar, Annotation annotation) {
        Class k = h2.a.k(h2.a.g(annotation));
        Y6.l a3 = nVar.a(AbstractC0065d.a(k), new H6.a(annotation));
        if (a3 != null) {
            I(a3, annotation, k);
        }
    }

    public static void I(Y6.l lVar, Annotation annotation, Class cls) {
        P.S g8 = o6.j.g(cls.getDeclaredMethods());
        while (g8.hasNext()) {
            Method method = (Method) g8.next();
            try {
                Object invoke = method.invoke(annotation, null);
                o6.j.b(invoke);
                C0725e e9 = C0725e.e(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (cls2.equals(Class.class)) {
                    lVar.o(e9, m((Class) invoke));
                } else if (H6.c.f2039a.contains(cls2)) {
                    lVar.r(e9, invoke);
                } else {
                    List list = AbstractC0065d.f2192a;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        o6.j.b(cls2);
                        lVar.l(e9, AbstractC0065d.a(cls2), C0725e.e(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        o6.j.d(interfaces, "getInterfaces(...)");
                        Class cls3 = (Class) AbstractC0434i.d1(interfaces);
                        o6.j.b(cls3);
                        Y6.l B8 = lVar.B(AbstractC0065d.a(cls3), e9);
                        if (B8 != null) {
                            I(B8, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        Y6.m v8 = lVar.v(e9);
                        if (v8 != null) {
                            Class<?> componentType = cls2.getComponentType();
                            int i4 = 0;
                            if (componentType.isEnum()) {
                                C0722b a3 = AbstractC0065d.a(componentType);
                                Object[] objArr = (Object[]) invoke;
                                int length = objArr.length;
                                while (i4 < length) {
                                    Object obj = objArr[i4];
                                    o6.j.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    v8.V(a3, C0725e.e(((Enum) obj).name()));
                                    i4++;
                                }
                            } else if (componentType.equals(Class.class)) {
                                Object[] objArr2 = (Object[]) invoke;
                                int length2 = objArr2.length;
                                while (i4 < length2) {
                                    Object obj2 = objArr2[i4];
                                    o6.j.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    v8.X(m((Class) obj2));
                                    i4++;
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Object[] objArr3 = (Object[]) invoke;
                                int length3 = objArr3.length;
                                while (i4 < length3) {
                                    Object obj3 = objArr3[i4];
                                    Y6.l C8 = v8.C(AbstractC0065d.a(componentType));
                                    if (C8 != null) {
                                        o6.j.c(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        I(C8, (Annotation) obj3, componentType);
                                    }
                                    i4++;
                                }
                            } else {
                                Object[] objArr4 = (Object[]) invoke;
                                int length4 = objArr4.length;
                                while (i4 < length4) {
                                    v8.y0(objArr4[i4]);
                                    i4++;
                                }
                            }
                            v8.k();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        lVar.k();
    }

    public static final void J(M6.h hVar) {
        int i4 = M6.d.k;
        if (hVar.f3495b == 1 && hVar.f3496c == 1) {
        } else {
            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public static C0725e K(C0725e c0725e, String str, String str2, int i4) {
        boolean z8;
        char charAt;
        char charAt2;
        Object obj;
        if ((i4 & 4) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i4 & 8) != 0) {
            str2 = null;
        }
        if (!c0725e.f10805e) {
            String c6 = c0725e.c();
            if (I7.v.a0(c6, str) && c6.length() != str.length() && ('a' > (charAt = c6.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return C0725e.e(str2.concat(I7.m.o0(c6, str)));
                }
                if (!z8) {
                    return c0725e;
                }
                String o02 = I7.m.o0(c6, str);
                if (o02.length() != 0 && E2.b.z(o02, 0)) {
                    if (o02.length() != 1 && E2.b.z(o02, 1)) {
                        Iterator it = new C1586a(0, o02.length() - 1, 1).iterator();
                        while (true) {
                            if (((C1587b) it).f15128f) {
                                obj = ((a6.w) it).next();
                                if (!E2.b.z(o02, ((Number) obj).intValue())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            String substring = o02.substring(0, intValue);
                            o6.j.d(substring, "substring(...)");
                            String O8 = E2.b.O(substring);
                            String substring2 = o02.substring(intValue);
                            o6.j.d(substring2, "substring(...)");
                            o02 = O8.concat(substring2);
                        } else {
                            o02 = E2.b.O(o02);
                        }
                    } else if (o02.length() != 0 && 'A' <= (charAt2 = o02.charAt(0)) && charAt2 < '[') {
                        char lowerCase = Character.toLowerCase(charAt2);
                        String substring3 = o02.substring(1);
                        o6.j.d(substring3, "substring(...)");
                        o02 = lowerCase + substring3;
                    }
                }
                if (C0725e.f(o02)) {
                    return C0725e.e(o02);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [P.C, d0.b] */
    public static C0593b L(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i4 = duplicate.getShort() & 65535;
        if (i4 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i8 = 0;
            while (true) {
                if (i8 < i4) {
                    int i9 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i9) {
                        break;
                    }
                    i8++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j5 = duplicate.getInt() & 4294967295L;
                for (int i10 = 0; i10 < j5; i10++) {
                    int i11 = duplicate.getInt();
                    long j8 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i11 || 1701669481 == i11) {
                        duplicate.position((int) (j8 + j));
                        ?? c6 = new P.C();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        c6.f4206g = duplicate;
                        c6.f4203d = position;
                        int i12 = position - duplicate.getInt(position);
                        c6.f4204e = i12;
                        c6.f4205f = ((ByteBuffer) c6.f4206g).getShort(i12);
                        return c6;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void M(K6.a aVar, K6.b bVar, C6.F f8, C0725e c0725e) {
        o6.j.e(aVar, "<this>");
        o6.j.e(bVar, "from");
        o6.j.e(f8, "scopeOwner");
        o6.j.e(c0725e, "name");
        String str = ((F6.E) f8).f1461i.f10797a.f10800a;
        o6.j.d(c0725e.b(), "asString(...)");
        o6.j.e(str, "packageFqName");
    }

    public static final void P(A4.d dVar, boolean z8) {
        o6.j.e(dVar, "<this>");
        ((MaterialButton) dVar.f299i).setEnabled(z8);
    }

    public static final void Q(A4.d dVar, C2.a aVar, int i4) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ((MaterialButton) dVar.f299i).setVisibility(i4);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            ((MaterialButton) dVar.f296f).setVisibility(i4);
            return;
        }
        ((MaterialButton) dVar.f297g).setVisibility(i4);
    }

    public static final void R(A4.c cVar, int i4) {
        G2.a aVar;
        o6.j.e(cVar, "<this>");
        MaterialTextView materialTextView = (MaterialTextView) cVar.f292f;
        Object tag = materialTextView.getTag();
        if (tag instanceof G2.a) {
            aVar = (G2.a) tag;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            materialTextView.setTag(new G2.a(a6.s.f7766d, Integer.valueOf(i4), null));
            return;
        }
        List list = aVar.f1734a;
        if (i4 >= 0 && i4 < list.size()) {
            Integer num = aVar.f1736c;
            if (num != null) {
                materialTextView.setLines(num.intValue());
            }
            materialTextView.setText((CharSequence) list.get(i4));
            materialTextView.setTag(G2.a.a(aVar, null, Integer.valueOf(i4), null, 5));
        }
    }

    public static final void S(A4.a aVar, List list) {
        Y y4;
        o6.j.e(aVar, "<this>");
        RecyclerView recyclerView = (RecyclerView) aVar.f282g;
        MaterialTextView materialTextView = (MaterialTextView) aVar.f281f;
        ConstraintLayout constraintLayout = (ConstraintLayout) aVar.f280e;
        MaterialTextView materialTextView2 = (MaterialTextView) aVar.f283h;
        o6.j.e(list, "items");
        t0.L l6 = null;
        Y y5 = null;
        if (list.isEmpty()) {
            Object tag = materialTextView2.getTag();
            if (tag instanceof Y) {
                y5 = (Y) tag;
            }
            if (y5 != null) {
                materialTextView2.setText(constraintLayout.getContext().getText(y5.f14089b));
            }
            materialTextView.setVisibility(0);
            recyclerView.setVisibility(8);
            return;
        }
        Object tag2 = materialTextView2.getTag();
        if (tag2 instanceof Y) {
            y4 = (Y) tag2;
        } else {
            y4 = null;
        }
        if (y4 != null) {
            materialTextView2.setText(constraintLayout.getContext().getText(y4.f14088a));
        }
        materialTextView.setVisibility(8);
        recyclerView.setVisibility(0);
        t0.U adapter = recyclerView.getAdapter();
        if (adapter instanceof t0.L) {
            l6 = (t0.L) adapter;
        }
        if (l6 != null) {
            l6.h(list);
        }
    }

    public static Set T(Object obj) {
        Set singleton = Collections.singleton(obj);
        o6.j.d(singleton, "singleton(...)");
        return singleton;
    }

    public static final void U(A4.a aVar, InterfaceC1162a interfaceC1162a) {
        RecyclerView recyclerView = (RecyclerView) aVar.f282g;
        ((ConstraintLayout) aVar.f280e).setOnClickListener(new E2.a(4, interfaceC1162a));
        if (interfaceC1162a == null) {
            recyclerView.setOnTouchListener(null);
            recyclerView.setOnClickListener(null);
        } else {
            recyclerView.setOnClickListener(new E2.a(5, interfaceC1162a));
            recyclerView.setOnTouchListener(new E1.b(2, new GestureDetector(recyclerView.getContext(), new GestureDetector.SimpleOnGestureListener())));
        }
    }

    public static final void V(A4.a aVar, int i4, int i8) {
        MaterialTextView materialTextView = (MaterialTextView) aVar.f283h;
        materialTextView.setText(i4);
        materialTextView.setTag(new Y(i4, i8));
    }

    public static final void W(A4.c cVar, String str) {
        o6.j.e(str, "titleText");
        E2.c.z0((MaterialTextView) cVar.f293g, str);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o6.s] */
    public static final void X(A4.c cVar, List list) {
        G2.a aVar;
        G2.a aVar2;
        Integer num;
        MaterialTextView materialTextView = (MaterialTextView) cVar.f292f;
        if (list.isEmpty()) {
            E2.c.z0(materialTextView, null);
            return;
        }
        int i4 = 0;
        materialTextView.setVisibility(0);
        if (materialTextView.isLaidOut() && !materialTextView.isLayoutRequested()) {
            ?? obj = new Object();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                obj.f13640d = Math.max(obj.f13640d, d(materialTextView, (String) it.next()));
            }
            P.r.a(materialTextView, new E.b(materialTextView, cVar, (o6.s) obj));
            Object tag = materialTextView.getTag();
            if (tag instanceof G2.a) {
                aVar = (G2.a) tag;
            } else {
                aVar = null;
            }
            if (aVar != null && (num = aVar.f1735b) != null) {
                i4 = num.intValue();
            }
            if (i4 >= 0 && i4 < list.size()) {
                materialTextView.setText((CharSequence) list.get(i4));
            }
            if (aVar != null) {
                aVar2 = G2.a.a(aVar, list, null, Integer.valueOf(obj.f13640d), 2);
            } else {
                aVar2 = new G2.a(list, null, Integer.valueOf(obj.f13640d));
            }
            materialTextView.setTag(aVar2);
            return;
        }
        materialTextView.addOnLayoutChangeListener(new G2.b(list, 0, cVar));
    }

    public static final void Y(Context context, int i4, InterfaceC1162a interfaceC1162a) {
        s5.b bVar = new s5.b(context);
        bVar.l(R.string.dialog_overlay_title_warning);
        C0865d c0865d = (C0865d) bVar.f3288e;
        c0865d.f11665f = c0865d.f11660a.getText(i4);
        bVar.k(android.R.string.ok, new J1.c(3, interfaceC1162a));
        bVar.j(null);
        DialogInterfaceC0869h c6 = bVar.c();
        Window window = c6.getWindow();
        if (window != null) {
            window.setType(2032);
        }
        c6.show();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t7.d] */
    public static final d8.d Z(InputStream inputStream) {
        int i4 = d8.e.f10531a;
        o6.j.e(inputStream, "<this>");
        return new d8.d(inputStream, new Object());
    }

    public static final C0722b a(String str) {
        C0723c c0723c = C0728h.f10816a;
        return new C0722b(C0728h.f10823h, C0725e.e(str));
    }

    public static final P2.a a0(O2.c cVar) {
        o6.j.e(cVar, "<this>");
        if (cVar instanceof O2.a) {
            O2.a aVar = (O2.a) cVar;
            return new Q2.c(aVar.f3854b, aVar.f3853a, 4);
        }
        if (cVar instanceof O2.b) {
            O2.b bVar = (O2.b) cVar;
            return new Q2.p(bVar.f3857c, bVar.f3855a, bVar.f3856b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final C0722b b(String str) {
        C0723c c0723c = C0728h.f10816a;
        return new C0722b(C0728h.f10816a, C0725e.e(str));
    }

    public static final ArrayList b0(C0535c c0535c) {
        o6.j.e(c0535c, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c0535c, 10));
        ListIterator listIterator = c0535c.listIterator(0);
        while (true) {
            C0533a c0533a = (C0533a) listIterator;
            if (c0533a.hasNext()) {
                u6.p pVar = (u6.p) c0533a.next();
                Object obj = pVar.get();
                String Z8 = I7.v.Z(I7.m.o0(pVar.getName(), "ACTION_"), "_", " ");
                Uri parse = Uri.parse("https://developer.android.com/reference/android/content/Intent#" + pVar.getName());
                o6.j.d(parse, "parse(...)");
                arrayList.add(new C0637a(obj, Z8, parse));
            } else {
                return arrayList;
            }
        }
    }

    public static final C0722b c(String str) {
        C0723c c0723c = C0728h.f10816a;
        return new C0722b(C0728h.f10818c, C0725e.e(str));
    }

    public static final C0780b c0(C0953c c0953c, boolean z8) {
        int i4;
        int i8;
        o6.j.e(c0953c, "<this>");
        if (c0953c.f11974g) {
            i4 = R.string.item_event_desc_enabled_children;
            i8 = R.drawable.ic_confirm;
        } else {
            i4 = R.string.item_event_desc_disabled_children;
            i8 = R.drawable.ic_cancel;
        }
        return new C0780b(c0953c, c0953c.f11970c, String.valueOf(c0953c.f11973f.size()), String.valueOf(c0953c.f11972e.size()), i4, i8, z8);
    }

    public static final int d(TextView textView, String str) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean isFallbackLineSpacing;
        int justificationMode;
        if (textView.getWidth() != 0 && textView.getLayout() != null) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(str, 0, str.length(), textView.getLayout().getPaint(), (textView.getWidth() - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight()).setAlignment(textView.getLayout().getAlignment()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                justificationMode = textView.getJustificationMode();
                hyphenationFrequency.setJustificationMode(justificationMode);
            }
            if (i4 >= 28) {
                isFallbackLineSpacing = textView.isFallbackLineSpacing();
                hyphenationFrequency.setUseLineSpacingFromFallbacks(isFallbackLineSpacing);
            }
            if (i4 >= 29) {
                textDirectionHeuristic = textView.getTextDirectionHeuristic();
                o6.j.b(textDirectionHeuristic);
                hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            }
            StaticLayout build = hyphenationFrequency.build();
            o6.j.d(build, "build(...)");
            return build.getLineCount();
        }
        Log.w("TitleAndDescription", "Can't get text line count, layout width is 0");
        return 0;
    }

    public static final void d0(M6.h hVar) {
        int i4 = M6.g.k;
        if (hVar.f3495b == 1 && hVar.f3496c == 1) {
        } else {
            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public static final void e(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int N02 = a6.x.N0(AbstractC0438m.d0(entrySet, 10));
        if (N02 < 16) {
            N02 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(N02);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final void e0(o6.m mVar) {
        o6.j.d(AbstractC0586e.f9700d, "VISIBILITY");
        C0790b c0790b = i0.f3147f;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c0790b, 10));
        P.S s8 = new P.S(6, c0790b);
        while (s8.hasNext()) {
            arrayList.add(((i0) s8.next()).f3148d);
        }
    }

    public static final C0722b f(C0725e c0725e) {
        C0723c c0723c = C0728h.f10816a;
        C0722b c0722b = C0728h.f10825l;
        return new C0722b(c0722b.f10793a, C0725e.e(c0725e.c().concat(c0722b.f().c())));
    }

    public static final C0722b g(String str) {
        C0723c c0723c = C0728h.f10816a;
        return new C0722b(C0728h.f10817b, C0725e.e(str));
    }

    public static final C0722b h(C0722b c0722b) {
        C0723c c0723c = C0728h.f10816a;
        return new C0722b(C0728h.f10816a, C0725e.e("U".concat(c0722b.f().c())));
    }

    public static final L7.X i(F3.a aVar, C0708a c0708a, InterfaceC1164c interfaceC1164c, InterfaceC1163b interfaceC1163b) {
        o6.j.e(interfaceC1164c, "bitmapProvider");
        o6.j.e(interfaceC1163b, "conditionClickedListener");
        ((ConstraintLayout) aVar.f1304e).setOnClickListener(new D2.a(interfaceC1163b, 8, c0708a));
        ((MaterialTextView) aVar.f1308i).setText(c0708a.f10758g);
        ((ImageView) aVar.f1305f).setImageResource(c0708a.f10760i);
        ((ImageView) aVar.f1306g).setImageResource(c0708a.k);
        ((MaterialTextView) aVar.j).setText(c0708a.f10761l);
        return (L7.X) interfaceC1164c.l(c0708a.f10757f, new A1.h(18, aVar));
    }

    public static C0541i j(C0541i c0541i) {
        C0538f c0538f = c0541i.f9241d;
        c0538f.c();
        if (c0538f.f9232l > 0) {
            return c0541i;
        }
        return C0541i.f9240e;
    }

    public static final Bundle k(Z5.j... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (Z5.j jVar : jVarArr) {
            String str = (String) jVar.f7485d;
            Object obj = jVar.f7486e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                o6.j.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static A4.a l(A4.a aVar, InterfaceC0006g interfaceC0006g, I6.o oVar, int i4) {
        S6.f fVar;
        if ((i4 & 2) != 0) {
            oVar = null;
        }
        o6.j.e(aVar, "<this>");
        Z5.g c6 = Z5.a.c(Z5.h.f7483e, new B6.f(aVar, 8, interfaceC0006g));
        S6.a aVar2 = (S6.a) aVar.f280e;
        if (oVar != null) {
            fVar = new S6.e(aVar, interfaceC0006g, oVar, 0);
        } else {
            fVar = (S6.f) aVar.f281f;
        }
        return new A4.a(aVar2, fVar, c6);
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, Z5.g] */
    public static k7.f m(Class cls) {
        int i4 = 0;
        while (cls.isArray()) {
            i4++;
            cls = cls.getComponentType();
            o6.j.d(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                C0723c g8 = z6.m.f16768d.g();
                return new k7.f(new C0722b(g8.b(), g8.f10797a.f()), i4);
            }
            z6.j d2 = EnumC1170c.b(cls.getName()).d();
            o6.j.d(d2, "getPrimitiveType(...)");
            if (i4 > 0) {
                C0723c c0723c = (C0723c) d2.f16732g.getValue();
                o6.j.e(c0723c, "topLevelFqName");
                return new k7.f(new C0722b(c0723c.b(), c0723c.f10797a.f()), i4 - 1);
            }
            C0723c c0723c2 = (C0723c) d2.f16731f.getValue();
            o6.j.e(c0723c2, "topLevelFqName");
            return new k7.f(new C0722b(c0723c2.b(), c0723c2.f10797a.f()), i4);
        }
        C0722b a3 = AbstractC0065d.a(cls);
        String str = B6.d.f457a;
        C0723c a4 = a3.a();
        o6.j.e(a4, "fqName");
        C0722b c0722b = (C0722b) B6.d.f464h.get(a4.f10797a);
        if (c0722b != null) {
            a3 = c0722b;
        }
        return new k7.f(a3, i4);
    }

    public static final int n(D0.c cVar, String str) {
        o6.j.e(cVar, "<this>");
        int o7 = o(cVar, str);
        if (o7 >= 0) {
            return o7;
        }
        int o8 = o(cVar, "`" + str + '`');
        if (o8 >= 0) {
            return o8;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = cVar.getColumnCount();
            String concat = ".".concat(str);
            String str2 = "." + str + '`';
            for (int i4 = 0; i4 < columnCount; i4++) {
                String columnName = cVar.getColumnName(i4);
                if (columnName.length() >= str.length() + 2 && (I7.v.W(columnName, concat) || (columnName.charAt(0) == '`' && I7.v.W(columnName, str2)))) {
                    return i4;
                }
            }
            return -1;
        }
        return -1;
    }

    public static final int o(D0.c cVar, String str) {
        o6.j.e(cVar, "<this>");
        o6.j.e(str, "name");
        int columnCount = cVar.getColumnCount();
        for (int i4 = 0; i4 < columnCount; i4++) {
            if (str.equals(cVar.getColumnName(i4))) {
                return i4;
            }
        }
        return -1;
    }

    public static final Collection p(Collection collection, Collection collection2) {
        o6.j.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final A4.a q(A4.a aVar, D6.j jVar) {
        o6.j.e(aVar, "<this>");
        o6.j.e(jVar, "additionalAnnotations");
        if (jVar.isEmpty()) {
            return aVar;
        }
        return new A4.a((S6.a) aVar.f280e, (S6.f) aVar.f281f, Z5.a.c(Z5.h.f7483e, new B6.f(aVar, 9, jVar)));
    }

    public static C0590i r(a7.g0 g0Var) {
        o6.j.e(g0Var, "table");
        if (g0Var.f8100e.size() == 0) {
            return C0590i.f9728b;
        }
        List list = g0Var.f8100e;
        o6.j.d(list, "getRequirementList(...)");
        return new C0590i(list);
    }

    public static final C0066e s(Annotation[] annotationArr, C0723c c0723c) {
        Annotation annotation;
        o6.j.e(annotationArr, "<this>");
        o6.j.e(c0723c, "fqName");
        int length = annotationArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                annotation = annotationArr[i4];
                if (o6.j.a(AbstractC0065d.a(h2.a.k(h2.a.g(annotation))).a(), c0723c)) {
                    break;
                }
                i4++;
            } else {
                annotation = null;
                break;
            }
        }
        if (annotation == null) {
            return null;
        }
        return new C0066e(annotation);
    }

    public static final H6.b t(W0.c cVar, C0722b c0722b, C0587f c0587f) {
        o6.j.e(cVar, "<this>");
        o6.j.e(c0722b, "classId");
        o6.j.e(c0587f, "metadataVersion");
        W5.a k = cVar.k(c0722b, c0587f);
        if (k != null) {
            return (H6.b) k.f6634e;
        }
        return null;
    }

    public static final void u(M6.h hVar) {
        int i4 = M6.c.k;
        if (hVar.f3495b == 1 && hVar.f3496c == 1) {
        } else {
            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public static final ArrayList v(Annotation[] annotationArr) {
        o6.j.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C0066e(annotation));
        }
        return arrayList;
    }

    public static final int w(D0.c cVar, String str) {
        o6.j.e(cVar, "stmt");
        return n(cVar, str);
    }

    public static final int x(D0.c cVar, String str) {
        o6.j.e(cVar, "stmt");
        int n3 = n(cVar, str);
        if (n3 >= 0) {
            return n3;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i4 = 0; i4 < columnCount; i4++) {
            arrayList.add(cVar.getColumnName(i4));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + AbstractC0436k.v0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int y(String str, Bundle bundle) {
        int i4 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i4 == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            AbstractC1492c.z(str);
            throw null;
        }
        return i4;
    }

    public static final ArrayList z(String str, Bundle bundle) {
        ArrayList parcelableArrayList;
        o6.j.e(str, "key");
        Class k = h2.a.k(o6.v.f13643a.b(Bundle.class));
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayList = L.b.a(bundle, str, k);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList(str);
        }
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        AbstractC1492c.z(str);
        throw null;
    }

    public abstract boolean A();

    public abstract void F(int i4);

    public abstract void G(Typeface typeface, boolean z8);

    public abstract void O(boolean z8);

    public int hashCode() {
        switch (this.f14087a) {
            case 19:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f14087a) {
            case 19:
                String c6 = o6.v.f13643a.b(getClass()).c();
                o6.j.b(c6);
                return c6;
            default:
                return super.toString();
        }
    }

    public void N(boolean z8) {
    }
}
