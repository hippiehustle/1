package s3;

import A0.h;
import A0.l;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.L;
import C6.M;
import D2.f;
import E.t;
import E2.d;
import F6.N;
import G.n;
import L6.A;
import L6.B;
import L6.C0134q;
import L6.C0135s;
import L6.C0136t;
import L6.C0137u;
import L6.C0138v;
import L6.C0139w;
import L6.C0140x;
import L6.C0141y;
import L6.C0142z;
import L6.D;
import L6.E;
import L6.F;
import L6.G;
import L6.H;
import L6.I;
import L6.J;
import L6.K;
import L6.r;
import L7.AbstractC0166y;
import M6.i;
import O7.InterfaceC0233f;
import P6.AbstractC0280c;
import P6.AbstractC0282e;
import P6.AbstractC0283f;
import P6.C0281d;
import Y6.p;
import Z.g;
import Z5.j;
import Z7.O;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.x;
import a7.C0444e;
import a7.C0445f;
import a7.C0447h;
import a7.EnumC0443d;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b6.C0535c;
import c7.AbstractC0586e;
import c7.InterfaceC0588g;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import d1.C0594a;
import d6.C0623i;
import e7.e;
import f7.C0725e;
import g4.C0779a;
import h1.C0811d;
import h6.AbstractC0837b;
import h7.AbstractC0842e;
import i.AbstractActivityC0870i;
import i.AbstractC0863b;
import i7.AbstractC0890e;
import j2.AbstractC0901a;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.ZipOutputStream;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import o6.v;
import q4.X;
import t6.C1586a;
import w7.AbstractC1759v;
import w7.C1742d;
import w7.Q;
import w7.U;
import w7.W;
import w7.z;
import x7.AbstractC1825g;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1492c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14519a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14520b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f14521c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14522d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14523e = 0;

    public static Typeface A(Configuration configuration, Typeface typeface) {
        int i4;
        int i8;
        int weight;
        int i9;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = configuration.fontWeightAdjustment;
            if (i4 != Integer.MAX_VALUE) {
                i8 = configuration.fontWeightAdjustment;
                if (i8 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i9 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, i(i9 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Paint B(int i4, Float f8) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i4);
        if (f8 != null) {
            paint.setStrokeWidth(f8.floatValue());
        }
        return paint;
    }

    public static final Paint C(int i4, float f8) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i4);
        paint.setStrokeWidth(f8);
        return paint;
    }

    public static final C0134q D(C0447h c0447h, InterfaceC0588g interfaceC0588g) {
        j jVar;
        o6.j.e(c0447h, "<this>");
        o6.j.e(interfaceC0588g, "strings");
        String n3 = n(interfaceC0588g, c0447h.f8105f);
        List<C0445f> list = c0447h.f8106g;
        o6.j.d(list, "getArgumentList(...)");
        ArrayList arrayList = new ArrayList();
        for (C0445f c0445f : list) {
            C0444e c0444e = c0445f.f8080g;
            o6.j.d(c0444e, "getValue(...)");
            K E7 = E(c0444e, interfaceC0588g);
            if (E7 != null) {
                jVar = new j(interfaceC0588g.getString(c0445f.f8079f), E7);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return new C0134q(n3, x.R0(arrayList));
    }

    public static final K E(C0444e c0444e, InterfaceC0588g interfaceC0588g) {
        o6.j.e(c0444e, "<this>");
        o6.j.e(interfaceC0588g, "strings");
        boolean z8 = true;
        int i4 = -1;
        if (AbstractC0586e.f9696P.c(c0444e.f8069p).booleanValue()) {
            EnumC0443d enumC0443d = c0444e.f8061f;
            if (enumC0443d != null) {
                i4 = i.f3497a[enumC0443d.ordinal()];
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            return new I(c0444e.f8062g);
                        }
                        throw new IllegalStateException(("Cannot read value of unsigned type: " + c0444e.f8061f).toString());
                    }
                    return new H((int) c0444e.f8062g);
                }
                return new J((short) c0444e.f8062g);
            }
            return new G((byte) c0444e.f8062g);
        }
        EnumC0443d enumC0443d2 = c0444e.f8061f;
        if (enumC0443d2 != null) {
            i4 = i.f3497a[enumC0443d2.ordinal()];
        }
        switch (i4) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new C0138v((byte) c0444e.f8062g);
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return new E((short) c0444e.f8062g);
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                return new A((int) c0444e.f8062g);
            case g.LONG_FIELD_NUMBER /* 4 */:
                return new D(c0444e.f8062g);
            case g.STRING_FIELD_NUMBER /* 5 */:
                return new C0139w((char) c0444e.f8062g);
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0142z(c0444e.f8063h);
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0140x(c0444e.f8064i);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                if (c0444e.f8062g == 0) {
                    z8 = false;
                }
                return new C0137u(z8);
            case 9:
                return new F(interfaceC0588g.getString(c0444e.j));
            case 10:
                String n3 = n(interfaceC0588g, c0444e.k);
                int i8 = c0444e.f8068o;
                if (i8 == 0) {
                    return new B(n3);
                }
                return new C0135s(n3, i8);
            case 11:
                return new C0141y(n(interfaceC0588g, c0444e.k), interfaceC0588g.getString(c0444e.f8065l));
            case 12:
                C0447h c0447h = c0444e.f8066m;
                o6.j.d(c0447h, "getAnnotation(...)");
                return new r(D(c0447h, interfaceC0588g));
            case 13:
                List<C0444e> list = c0444e.f8067n;
                o6.j.d(list, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList();
                for (C0444e c0444e2 : list) {
                    o6.j.b(c0444e2);
                    K E7 = E(c0444e2, interfaceC0588g);
                    if (E7 != null) {
                        arrayList.add(E7);
                    }
                }
                return new C0136t(arrayList);
        }
    }

    public static final List F(D0.c cVar) {
        int n3 = X.n(cVar, "id");
        int n8 = X.n(cVar, "seq");
        int n9 = X.n(cVar, "from");
        int n10 = X.n(cVar, "to");
        C0535c i4 = d.i();
        while (cVar.H()) {
            i4.add(new h((int) cVar.getLong(n3), (int) cVar.getLong(n8), cVar.l(n9), cVar.l(n10)));
        }
        return AbstractC0436k.K0(d.f(i4));
    }

    public static final l G(D0.a aVar, String str, boolean z8) {
        String str2;
        D0.c L8 = aVar.L("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int n3 = X.n(L8, "seqno");
            int n8 = X.n(L8, "cid");
            int n9 = X.n(L8, "name");
            int n10 = X.n(L8, "desc");
            if (n3 != -1 && n8 != -1 && n9 != -1 && n10 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (L8.H()) {
                    if (((int) L8.getLong(n8)) >= 0) {
                        int i4 = (int) L8.getLong(n3);
                        String l6 = L8.l(n9);
                        if (L8.getLong(n10) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i4), l6);
                        linkedHashMap2.put(Integer.valueOf(i4), str2);
                    }
                }
                List L02 = AbstractC0436k.L0(linkedHashMap.entrySet(), new A0.i(0));
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(L02, 10));
                Iterator it = L02.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List Q02 = AbstractC0436k.Q0(arrayList);
                List L03 = AbstractC0436k.L0(linkedHashMap2.entrySet(), new A0.i(1));
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(L03, 10));
                Iterator it2 = L03.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                l lVar = new l(str, z8, Q02, AbstractC0436k.Q0(arrayList2));
                AbstractC0837b.d(L8, null);
                return lVar;
            }
            AbstractC0837b.d(L8, null);
            return null;
        } finally {
        }
    }

    public static final S6.c H(A4.a aVar, W6.b bVar) {
        o6.j.e(aVar, "<this>");
        o6.j.e(bVar, "annotationsOwner");
        return new S6.c(aVar, bVar, false);
    }

    public static int I(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final C0594a J(ResolveInfo resolveInfo, PackageManager packageManager) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            String obj = activityInfo.loadLabel(packageManager).toString();
            Drawable loadIcon = activityInfo.loadIcon(packageManager);
            o6.j.d(loadIcon, "loadIcon(...)");
            return new C0594a(componentName, obj, loadIcon);
        }
        return null;
    }

    public static final void K(A4.d dVar) {
        ((MaterialButton) dVar.f296f).setVisibility(0);
        ((MaterialTextView) dVar.f298h).setVisibility(0);
        ((MaterialButton) dVar.f297g).setIconResource(com.buzbuz.smartautoclicker.R.drawable.abc_ic_search_api_material);
        TextInputEditText textInputEditText = (TextInputEditText) dVar.f299i;
        textInputEditText.setVisibility(8);
        ((InputMethodManager) textInputEditText.getContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(textInputEditText.getWindowToken(), 0);
        textInputEditText.clearFocus();
        Editable text = textInputEditText.getText();
        if (text != null) {
            text.clear();
        }
    }

    public static final Class L(ClassLoader classLoader, String str) {
        o6.j.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final void M(ZipOutputStream zipOutputStream, File file) {
        o6.j.e(zipOutputStream, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            AbstractC0863b.b(fileInputStream, zipOutputStream);
            fileInputStream.close();
        } finally {
        }
    }

    public static final void a(kotlinx.serialization.json.internal.c cVar) {
        kotlinx.serialization.json.internal.c cVar2;
        o6.j.e(cVar, "<this>");
        if (cVar instanceof kotlinx.serialization.json.internal.c) {
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            return;
        }
        StringBuilder sb = new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        throw new IllegalStateException(AbstractC1149a.i(v.f13643a, cVar.getClass(), sb));
    }

    public static final String b(CharSequence charSequence) {
        o6.j.e(charSequence, "<this>");
        return ((Object) charSequence) + "  ";
    }

    public static final a8.h c(Y7.b bVar) {
        a8.h hVar;
        o6.j.e(bVar, "<this>");
        if (bVar instanceof a8.h) {
            hVar = (a8.h) bVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        StringBuilder sb = new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        throw new IllegalStateException(AbstractC1149a.i(v.f13643a, bVar.getClass(), sb));
    }

    public static final void d(F3.d dVar, C0779a c0779a, boolean z8, InterfaceC1163b interfaceC1163b) {
        int i4;
        int i8;
        o6.j.e(dVar, "<this>");
        TextView textView = (TextView) dVar.f1327i;
        o6.j.e(interfaceC1163b, "itemClickedListener");
        ((TextView) dVar.f1328l).setText(c0779a.f11155f);
        ((TextView) dVar.j).setText(c0779a.f11156g);
        ConstraintLayout constraintLayout = (ConstraintLayout) dVar.f1324f;
        Context context = constraintLayout.getContext();
        o6.j.d(context, "getContext(...)");
        if (c0779a.k) {
            i4 = com.buzbuz.smartautoclicker.R.attr.colorError;
        } else {
            i4 = com.buzbuz.smartautoclicker.R.attr.colorOnSurface;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        int i9 = typedValue.data;
        textView.setText(c0779a.f11157h);
        textView.setTextColor(i9);
        ((ImageView) dVar.f1326h).setColorFilter(i9, PorterDuff.Mode.SRC_IN);
        ((TextView) dVar.k).setText(c0779a.f11158i);
        ((ImageView) dVar.f1323e).setImageResource(c0779a.j);
        ImageButton imageButton = (ImageButton) dVar.f1325g;
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        imageButton.setVisibility(i8);
        constraintLayout.setOnClickListener(new D2.a(interfaceC1163b, 9, c0779a));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [d8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [d8.a, java.lang.Object] */
    public static void e(long j, d8.a aVar, int i4, ArrayList arrayList, int i8, int i9, ArrayList arrayList2) {
        int i10;
        int i11;
        ArrayList arrayList3;
        long j5;
        int i12;
        int i13 = i4;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i8 < i9) {
            for (int i14 = i8; i14 < i9; i14++) {
                if (((d8.c) arrayList4.get(i14)).b() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            d8.c cVar = (d8.c) arrayList.get(i8);
            d8.c cVar2 = (d8.c) arrayList4.get(i9 - 1);
            if (i13 == cVar.b()) {
                int intValue = ((Number) arrayList5.get(i8)).intValue();
                int i15 = i8 + 1;
                d8.c cVar3 = (d8.c) arrayList4.get(i15);
                i10 = i15;
                i11 = intValue;
                cVar = cVar3;
            } else {
                i10 = i8;
                i11 = -1;
            }
            if (cVar.e(i13) != cVar2.e(i13)) {
                int i16 = 1;
                for (int i17 = i10 + 1; i17 < i9; i17++) {
                    if (((d8.c) arrayList4.get(i17 - 1)).e(i13) != ((d8.c) arrayList4.get(i17)).e(i13)) {
                        i16++;
                    }
                }
                long j8 = 4;
                long j9 = (aVar.f10525e / j8) + j + 2 + (i16 * 2);
                aVar.B(i16);
                aVar.B(i11);
                for (int i18 = i10; i18 < i9; i18++) {
                    byte e9 = ((d8.c) arrayList4.get(i18)).e(i13);
                    if (i18 == i10 || e9 != ((d8.c) arrayList4.get(i18 - 1)).e(i13)) {
                        aVar.B(e9 & 255);
                    }
                }
                ?? obj = new Object();
                int i19 = i10;
                while (i19 < i9) {
                    byte e10 = ((d8.c) arrayList4.get(i19)).e(i13);
                    int i20 = i19 + 1;
                    int i21 = i20;
                    while (true) {
                        if (i21 < i9) {
                            if (e10 != ((d8.c) arrayList4.get(i21)).e(i13)) {
                                break;
                            } else {
                                i21++;
                            }
                        } else {
                            i21 = i9;
                            break;
                        }
                    }
                    if (i20 == i21 && i13 + 1 == ((d8.c) arrayList4.get(i19)).b()) {
                        aVar.B(((Number) arrayList5.get(i19)).intValue());
                        arrayList3 = arrayList5;
                        j5 = j9;
                        i12 = i21;
                    } else {
                        aVar.B(((int) ((obj.f10525e / j8) + j9)) * (-1));
                        arrayList3 = arrayList5;
                        j5 = j9;
                        i12 = i21;
                        e(j5, obj, i13 + 1, arrayList, i19, i12, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j9 = j5;
                    i19 = i12;
                    arrayList5 = arrayList3;
                }
                do {
                } while (obj.h(aVar, 8192L) != -1);
                return;
            }
            int min = Math.min(cVar.b(), cVar2.b());
            int i22 = 0;
            for (int i23 = i13; i23 < min && cVar.e(i23) == cVar2.e(i23); i23++) {
                i22++;
            }
            long j10 = 4;
            long j11 = (aVar.f10525e / j10) + j + 2 + i22 + 1;
            aVar.B(-i22);
            aVar.B(i11);
            int i24 = i13 + i22;
            while (i13 < i24) {
                aVar.B(cVar.e(i13) & 255);
                i13++;
            }
            if (i10 + 1 == i9) {
                if (i24 == ((d8.c) arrayList4.get(i10)).b()) {
                    aVar.B(((Number) arrayList5.get(i10)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            ?? obj2 = new Object();
            aVar.B(((int) ((obj2.f10525e / j10) + j11)) * (-1));
            e(j11, obj2, i24, arrayList4, i10, i9, arrayList5);
            do {
            } while (obj2.h(aVar, 8192L) != -1);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static void f(int i4) {
        if (2 <= i4 && i4 < 37) {
            return;
        }
        StringBuilder j = AbstractC1149a.j(i4, "radix ", " was not in valid range ");
        j.append(new C1586a(2, 36, 1));
        throw new IllegalArgumentException(j.toString());
    }

    public static int g(AbstractActivityC0870i abstractActivityC0870i, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new t(abstractActivityC0870i).f1148b.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return abstractActivityC0870i.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static float h(float f8, float f9, float f10) {
        if (f8 < f9) {
            return f9;
        }
        if (f8 > f10) {
            return f10;
        }
        return f8;
    }

    public static int i(int i4, int i8, int i9) {
        if (i4 < i8) {
            return i8;
        }
        if (i4 > i9) {
            return i9;
        }
        return i4;
    }

    public static Object j(InterfaceC0233f interfaceC0233f) {
        o6.j.e(interfaceC0233f, "<this>");
        return AbstractC0166y.t(C0623i.f10448d, new C0811d(interfaceC0233f, null));
    }

    public static final boolean k(char c6, char c9, boolean z8) {
        if (c6 == c9) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c9);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static p l(d dVar) {
        if (dVar instanceof e) {
            e eVar = (e) dVar;
            String str = eVar.f10665e;
            String str2 = eVar.f10666f;
            o6.j.e(str, "name");
            o6.j.e(str2, "desc");
            return new p(str.concat(str2));
        }
        if (dVar instanceof e7.d) {
            e7.d dVar2 = (e7.d) dVar;
            String str3 = dVar2.f10663e;
            String str4 = dVar2.f10664f;
            o6.j.e(str3, "name");
            o6.j.e(str4, "desc");
            return new p(str3 + '#' + str4);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList m(PackageManager packageManager) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        Intent addCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
        o6.j.d(addCategory, "addCategory(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(0);
            queryIntentActivities = packageManager.queryIntentActivities(addCategory, of);
            o6.j.b(queryIntentActivities);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(addCategory, 0);
            o6.j.b(queryIntentActivities);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            C0594a J6 = J((ResolveInfo) it.next(), packageManager);
            if (J6 != null) {
                arrayList.add(J6);
            }
        }
        return arrayList;
    }

    public static final String n(InterfaceC0588g interfaceC0588g, int i4) {
        o6.j.e(interfaceC0588g, "<this>");
        String q6 = interfaceC0588g.q(i4);
        if (interfaceC0588g.o(i4)) {
            return A.j.o(".", q6);
        }
        return q6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f1667c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList o(Context context, int i4) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        G.i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        G.j jVar = new G.j(resources, theme);
        synchronized (n.f1678c) {
            try {
                SparseArray sparseArray = (SparseArray) n.f1677b.get(jVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (iVar = (G.i) sparseArray.get(i4)) != null) {
                    if (iVar.f1666b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (iVar.f1667c != 0) {
                            }
                            colorStateList2 = iVar.f1665a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i4);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = n.f1676a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i4, typedValue, true);
        int i8 = typedValue.type;
        if (i8 < 28 || i8 > 31) {
            try {
                colorStateList = G.c.a(resources, resources.getXml(i4), theme);
            } catch (Exception e9) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e9);
            }
        }
        if (colorStateList != null) {
            synchronized (n.f1678c) {
                try {
                    WeakHashMap weakHashMap = n.f1677b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(jVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(jVar, sparseArray2);
                    }
                    sparseArray2.append(i4, new G.i(colorStateList, jVar.f1668a.getConfiguration(), theme));
                } finally {
                }
            }
            return colorStateList;
        }
        return resources.getColorStateList(i4, theme);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    public static final String r(InterfaceC0019u interfaceC0019u) {
        InterfaceC0002c interfaceC0002c;
        C0725e c0725e;
        C0725e c0725e2;
        if (z6.h.A(interfaceC0019u)) {
            interfaceC0002c = u(interfaceC0019u);
        } else {
            interfaceC0002c = null;
        }
        if (interfaceC0002c != null) {
            InterfaceC0002c k = AbstractC1098d.k(interfaceC0002c);
            if (k instanceof M) {
                z6.h.A(k);
                InterfaceC0002c b4 = AbstractC1098d.b(AbstractC1098d.k(k), C0281d.f4555g);
                if (b4 != null && (c0725e2 = (C0725e) AbstractC0283f.f4560a.get(AbstractC1098d.g(b4))) != null) {
                    return c0725e2.b();
                }
            } else if (k instanceof N) {
                int i4 = AbstractC0280c.f4552l;
                LinkedHashMap linkedHashMap = P6.F.f4542i;
                String f8 = f.f((N) k);
                if (f8 == null) {
                    c0725e = null;
                } else {
                    c0725e = (C0725e) linkedHashMap.get(f8);
                }
                if (c0725e != null) {
                    return c0725e.b();
                }
            }
        }
        return null;
    }

    public static final V7.a t(V7.a aVar) {
        o6.j.e(aVar, "<this>");
        if (aVar.d().h()) {
            return aVar;
        }
        return new O(aVar);
    }

    public static final InterfaceC0002c u(InterfaceC0002c interfaceC0002c) {
        o6.j.e(interfaceC0002c, "<this>");
        if (P6.F.j.contains(interfaceC0002c.getName()) || AbstractC0283f.f4563d.contains(AbstractC1098d.k(interfaceC0002c).getName())) {
            if (!(interfaceC0002c instanceof M) && !(interfaceC0002c instanceof L)) {
                if (interfaceC0002c instanceof N) {
                    return AbstractC1098d.b(interfaceC0002c, C0281d.j);
                }
                return null;
            }
            return AbstractC1098d.b(interfaceC0002c, C0281d.f4557i);
        }
        return null;
    }

    public static final InterfaceC0002c v(InterfaceC0002c interfaceC0002c) {
        o6.j.e(interfaceC0002c, "<this>");
        InterfaceC0002c u8 = u(interfaceC0002c);
        if (u8 != null) {
            return u8;
        }
        int i4 = AbstractC0282e.f4559l;
        C0725e name = interfaceC0002c.getName();
        o6.j.d(name, "getName(...)");
        if (!AbstractC0282e.b(name)) {
            return null;
        }
        return AbstractC1098d.b(interfaceC0002c, C0281d.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        return !z6.h.A(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean w(InterfaceC0004e interfaceC0004e, InterfaceC0002c interfaceC0002c) {
        o6.j.e(interfaceC0004e, "<this>");
        o6.j.e(interfaceC0002c, "specialCallableDescriptor");
        InterfaceC0010k q6 = interfaceC0002c.q();
        o6.j.c(q6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        z l6 = ((InterfaceC0004e) q6).l();
        o6.j.d(l6, "getDefaultType(...)");
        InterfaceC0004e j = AbstractC0890e.j(interfaceC0004e);
        while (j != null) {
            if (!(j instanceof R6.c)) {
                z l8 = j.l();
                if (l8 != null) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    W w8 = null;
                    arrayDeque.add(new x7.n(l8, null));
                    w7.J B02 = l6.B0();
                    while (true) {
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        x7.n nVar = (x7.n) arrayDeque.poll();
                        AbstractC1759v abstractC1759v = nVar.f16300a;
                        w7.J B03 = abstractC1759v.B0();
                        if (B03 != null) {
                            if (B02 != null) {
                                if (B03.equals(B02)) {
                                    boolean E02 = abstractC1759v.E0();
                                    for (x7.n nVar2 = nVar.f16301b; nVar2 != null; nVar2 = nVar2.f16301b) {
                                        AbstractC1759v abstractC1759v2 = nVar2.f16300a;
                                        List r02 = abstractC1759v2.r0();
                                        w7.X x8 = w7.X.INVARIANT;
                                        C1742d c1742d = w7.K.f15967b;
                                        if (r02 == null || !r02.isEmpty()) {
                                            Iterator it = r02.iterator();
                                            while (it.hasNext()) {
                                                if (((w7.M) it.next()).a() != x8) {
                                                    abstractC1759v = (AbstractC1759v) AbstractC0405a.c(new Q(AbstractC0842e.D(c1742d.g(abstractC1759v2.B0(), abstractC1759v2.r0()))).g(abstractC1759v, x8)).f526b;
                                                    break;
                                                }
                                            }
                                        }
                                        abstractC1759v = new Q(c1742d.g(abstractC1759v2.B0(), abstractC1759v2.r0())).g(abstractC1759v, x8);
                                        if (!E02 && !abstractC1759v2.E0()) {
                                            E02 = false;
                                        } else {
                                            E02 = true;
                                        }
                                    }
                                    w7.J B04 = abstractC1759v.B0();
                                    if (B04 != null) {
                                        if (B04.equals(B02)) {
                                            w8 = U.g(abstractC1759v, E02);
                                        } else {
                                            throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + AbstractC1825g.n(B04) + ", \n\nsupertype: " + AbstractC1825g.n(B02) + " \n" + B04.equals(B02));
                                        }
                                    } else {
                                        AbstractC1825g.a(3);
                                        throw null;
                                    }
                                } else {
                                    for (AbstractC1759v abstractC1759v3 : B03.d()) {
                                        o6.j.b(abstractC1759v3);
                                        arrayDeque.add(new x7.n(abstractC1759v3, nVar));
                                    }
                                }
                            } else {
                                AbstractC1825g.a(4);
                                throw null;
                            }
                        } else {
                            AbstractC1825g.a(3);
                            throw null;
                        }
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
            }
            j = AbstractC0890e.j(j);
        }
        return false;
    }

    public static boolean x(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static boolean y(char c6) {
        if (!Character.isWhitespace(c6) && !Character.isSpaceChar(c6)) {
            return false;
        }
        return true;
    }

    public static final void z(String str) {
        o6.j.e(str, "key");
        throw new IllegalArgumentException(A.j.p("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public abstract AbstractC0901a p();

    public abstract void q(G5.v vVar, float f8, float f9);

    public abstract String s();
}
