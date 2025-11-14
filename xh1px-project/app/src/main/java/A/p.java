package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import w.AbstractC1680a;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f173d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f174e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f175a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f176b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f177c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f174e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] d(a aVar, String str) {
        int i4;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            Object obj = null;
            try {
                i4 = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i4 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f8526p;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f8526p.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i4 = ((Integer) obj).intValue();
                }
            }
            iArr[i9] = i4;
            i8++;
            i9++;
        }
        if (i9 != split.length) {
            return Arrays.copyOf(iArr, i9);
        }
        return iArr;
    }

    public static k e(Context context, AttributeSet attributeSet) {
        k kVar = new k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f178a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            m mVar = kVar.f92c;
            o oVar = kVar.f94e;
            l lVar = kVar.f93d;
            if (index != 1 && 23 != index && 24 != index) {
                mVar.getClass();
                lVar.getClass();
                oVar.getClass();
            }
            SparseIntArray sparseIntArray = f174e;
            int i8 = sparseIntArray.get(index);
            n nVar = kVar.f91b;
            switch (i8) {
                case 1:
                    lVar.f141o = g(obtainStyledAttributes, index, lVar.f141o);
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    lVar.f101F = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f101F);
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    lVar.f140n = g(obtainStyledAttributes, index, lVar.f140n);
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    lVar.f139m = g(obtainStyledAttributes, index, lVar.f139m);
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    lVar.f148v = obtainStyledAttributes.getString(index);
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    lVar.f152z = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f152z);
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    lVar.f96A = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f96A);
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    lVar.f102G = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f102G);
                    break;
                case 9:
                    lVar.f145s = g(obtainStyledAttributes, index, lVar.f145s);
                    break;
                case 10:
                    lVar.f144r = g(obtainStyledAttributes, index, lVar.f144r);
                    break;
                case 11:
                    lVar.f106L = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f106L);
                    break;
                case 12:
                    lVar.f107M = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f107M);
                    break;
                case 13:
                    lVar.f104I = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f104I);
                    break;
                case 14:
                    lVar.K = obtainStyledAttributes.getDimensionPixelSize(index, lVar.K);
                    break;
                case 15:
                    lVar.f108N = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f108N);
                    break;
                case 16:
                    lVar.f105J = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f105J);
                    break;
                case 17:
                    lVar.f126d = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f126d);
                    break;
                case 18:
                    lVar.f128e = obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f128e);
                    break;
                case 19:
                    lVar.f130f = obtainStyledAttributes.getFloat(index, lVar.f130f);
                    break;
                case 20:
                    lVar.f146t = obtainStyledAttributes.getFloat(index, lVar.f146t);
                    break;
                case 21:
                    lVar.f124c = obtainStyledAttributes.getLayoutDimension(index, lVar.f124c);
                    break;
                case 22:
                    int i9 = obtainStyledAttributes.getInt(index, nVar.f158a);
                    nVar.f158a = i9;
                    nVar.f158a = f173d[i9];
                    break;
                case 23:
                    lVar.f122b = obtainStyledAttributes.getLayoutDimension(index, lVar.f122b);
                    break;
                case 24:
                    lVar.f98C = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f98C);
                    break;
                case 25:
                    lVar.f132g = g(obtainStyledAttributes, index, lVar.f132g);
                    break;
                case 26:
                    lVar.f134h = g(obtainStyledAttributes, index, lVar.f134h);
                    break;
                case 27:
                    lVar.f97B = obtainStyledAttributes.getInt(index, lVar.f97B);
                    break;
                case 28:
                    lVar.f99D = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f99D);
                    break;
                case 29:
                    lVar.f136i = g(obtainStyledAttributes, index, lVar.f136i);
                    break;
                case 30:
                    lVar.j = g(obtainStyledAttributes, index, lVar.j);
                    break;
                case 31:
                    lVar.f103H = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f103H);
                    break;
                case 32:
                    lVar.f142p = g(obtainStyledAttributes, index, lVar.f142p);
                    break;
                case 33:
                    lVar.f143q = g(obtainStyledAttributes, index, lVar.f143q);
                    break;
                case 34:
                    lVar.f100E = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f100E);
                    break;
                case 35:
                    lVar.f138l = g(obtainStyledAttributes, index, lVar.f138l);
                    break;
                case 36:
                    lVar.k = g(obtainStyledAttributes, index, lVar.k);
                    break;
                case 37:
                    lVar.f147u = obtainStyledAttributes.getFloat(index, lVar.f147u);
                    break;
                case 38:
                    kVar.f90a = obtainStyledAttributes.getResourceId(index, kVar.f90a);
                    break;
                case 39:
                    lVar.f110P = obtainStyledAttributes.getFloat(index, lVar.f110P);
                    break;
                case 40:
                    lVar.f109O = obtainStyledAttributes.getFloat(index, lVar.f109O);
                    break;
                case 41:
                    lVar.f111Q = obtainStyledAttributes.getInt(index, lVar.f111Q);
                    break;
                case 42:
                    lVar.f112R = obtainStyledAttributes.getInt(index, lVar.f112R);
                    break;
                case 43:
                    nVar.f160c = obtainStyledAttributes.getFloat(index, nVar.f160c);
                    break;
                case 44:
                    oVar.k = true;
                    oVar.f172l = obtainStyledAttributes.getDimension(index, oVar.f172l);
                    break;
                case 45:
                    oVar.f164b = obtainStyledAttributes.getFloat(index, oVar.f164b);
                    break;
                case 46:
                    oVar.f165c = obtainStyledAttributes.getFloat(index, oVar.f165c);
                    break;
                case 47:
                    oVar.f166d = obtainStyledAttributes.getFloat(index, oVar.f166d);
                    break;
                case 48:
                    oVar.f167e = obtainStyledAttributes.getFloat(index, oVar.f167e);
                    break;
                case 49:
                    oVar.f168f = obtainStyledAttributes.getDimension(index, oVar.f168f);
                    break;
                case 50:
                    oVar.f169g = obtainStyledAttributes.getDimension(index, oVar.f169g);
                    break;
                case 51:
                    oVar.f170h = obtainStyledAttributes.getDimension(index, oVar.f170h);
                    break;
                case 52:
                    oVar.f171i = obtainStyledAttributes.getDimension(index, oVar.f171i);
                    break;
                case 53:
                    oVar.j = obtainStyledAttributes.getDimension(index, oVar.j);
                    break;
                case 54:
                    lVar.f113S = obtainStyledAttributes.getInt(index, lVar.f113S);
                    break;
                case 55:
                    lVar.f114T = obtainStyledAttributes.getInt(index, lVar.f114T);
                    break;
                case 56:
                    lVar.f115U = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f115U);
                    break;
                case 57:
                    lVar.f116V = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f116V);
                    break;
                case 58:
                    lVar.f117W = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f117W);
                    break;
                case 59:
                    lVar.f118X = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f118X);
                    break;
                case 60:
                    oVar.f163a = obtainStyledAttributes.getFloat(index, oVar.f163a);
                    break;
                case 61:
                    lVar.f149w = g(obtainStyledAttributes, index, lVar.f149w);
                    break;
                case 62:
                    lVar.f150x = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f150x);
                    break;
                case 63:
                    lVar.f151y = obtainStyledAttributes.getFloat(index, lVar.f151y);
                    break;
                case 64:
                    mVar.f154a = g(obtainStyledAttributes, index, mVar.f154a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        mVar.getClass();
                        break;
                    } else {
                        String str = AbstractC1680a.f15564a[obtainStyledAttributes.getInteger(index, 0)];
                        mVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    mVar.getClass();
                    break;
                case 67:
                    mVar.f157d = obtainStyledAttributes.getFloat(index, mVar.f157d);
                    break;
                case 68:
                    nVar.f161d = obtainStyledAttributes.getFloat(index, nVar.f161d);
                    break;
                case 69:
                    lVar.Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    lVar.f119Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    lVar.f121a0 = obtainStyledAttributes.getInt(index, lVar.f121a0);
                    break;
                case 73:
                    lVar.f123b0 = obtainStyledAttributes.getDimensionPixelSize(index, lVar.f123b0);
                    break;
                case 74:
                    lVar.f129e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    lVar.f137i0 = obtainStyledAttributes.getBoolean(index, lVar.f137i0);
                    break;
                case 76:
                    mVar.f155b = obtainStyledAttributes.getInt(index, mVar.f155b);
                    break;
                case 77:
                    lVar.f131f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    nVar.f159b = obtainStyledAttributes.getInt(index, nVar.f159b);
                    break;
                case 79:
                    mVar.f156c = obtainStyledAttributes.getFloat(index, mVar.f156c);
                    break;
                case 80:
                    lVar.f133g0 = obtainStyledAttributes.getBoolean(index, lVar.f133g0);
                    break;
                case 81:
                    lVar.f135h0 = obtainStyledAttributes.getBoolean(index, lVar.f135h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return kVar;
    }

    public static int g(TypedArray typedArray, int i4, int i8) {
        int resourceId = typedArray.getResourceId(i4, i8);
        if (resourceId == -1) {
            return typedArray.getInt(i4, -1);
        }
        return resourceId;
    }

    public static String h(int i4) {
        switch (i4) {
            case 1:
                return "left";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "right";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "top";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "bottom";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "baseline";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "start";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x010c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [y.i, y.a] */
    /* JADX WARN: Type inference failed for: r7v4, types: [A.a, A.c, android.view.View] */
    public final void a(ConstraintLayout constraintLayout) {
        int i4;
        HashSet hashSet;
        int i8;
        int i9;
        String str;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = pVar.f177c;
        HashSet hashSet2 = new HashSet(hashMap.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (pVar.f176b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet2.remove(Integer.valueOf(id));
                    k kVar = (k) hashMap.get(Integer.valueOf(id));
                    if (childAt instanceof a) {
                        kVar.f93d.f125c0 = 1;
                    }
                    l lVar = kVar.f93d;
                    n nVar = kVar.f91b;
                    o oVar = kVar.f94e;
                    int i11 = lVar.f125c0;
                    if (i11 != -1 && i11 == 1) {
                        a aVar = (a) childAt;
                        aVar.setId(id);
                        aVar.setType(lVar.f121a0);
                        aVar.setMargin(lVar.f123b0);
                        aVar.setAllowsGoneWidget(lVar.f137i0);
                        int[] iArr = lVar.f127d0;
                        if (iArr != null) {
                            aVar.setReferencedIds(iArr);
                        } else {
                            String str2 = lVar.f129e0;
                            if (str2 != null) {
                                int[] d2 = d(aVar, str2);
                                lVar.f127d0 = d2;
                                aVar.setReferencedIds(d2);
                            }
                        }
                    }
                    e eVar = (e) childAt.getLayoutParams();
                    eVar.a();
                    kVar.a(eVar);
                    HashMap hashMap2 = kVar.f95f;
                    Class<?> cls = childAt.getClass();
                    for (String str3 : hashMap2.keySet()) {
                        b bVar = (b) hashMap2.get(str3);
                        int i12 = childCount;
                        String o7 = j.o("set", str3);
                        HashSet hashSet3 = hashSet2;
                        try {
                            int b4 = AbstractC1769h.b(bVar.f1a);
                            Class cls2 = Integer.TYPE;
                            Class cls3 = Float.TYPE;
                            switch (b4) {
                                case 0:
                                    i9 = i10;
                                    cls.getMethod(o7, cls2).invoke(childAt, Integer.valueOf(bVar.f2b));
                                    break;
                                case 1:
                                    i9 = i10;
                                    cls.getMethod(o7, cls3).invoke(childAt, Float.valueOf(bVar.f3c));
                                    break;
                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                    i9 = i10;
                                    cls.getMethod(o7, cls2).invoke(childAt, Integer.valueOf(bVar.f6f));
                                    break;
                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                    Method method = cls.getMethod(o7, Drawable.class);
                                    i9 = i10;
                                    try {
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(bVar.f6f);
                                        method.invoke(childAt, colorDrawable);
                                    } catch (IllegalAccessException e9) {
                                        e = e9;
                                        StringBuilder s8 = j.s(" Custom Attribute \"", str3, "\" not found on ");
                                        s8.append(cls.getName());
                                        Log.e("TransitionLayout", s8.toString());
                                        e.printStackTrace();
                                        childCount = i12;
                                        hashSet2 = hashSet3;
                                        i10 = i9;
                                    } catch (NoSuchMethodException e10) {
                                        e = e10;
                                        Log.e("TransitionLayout", e.getMessage());
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + o7);
                                        childCount = i12;
                                        hashSet2 = hashSet3;
                                        i10 = i9;
                                    } catch (InvocationTargetException e11) {
                                        e = e11;
                                        StringBuilder s9 = j.s(" Custom Attribute \"", str3, "\" not found on ");
                                        s9.append(cls.getName());
                                        Log.e("TransitionLayout", s9.toString());
                                        e.printStackTrace();
                                        childCount = i12;
                                        hashSet2 = hashSet3;
                                        i10 = i9;
                                    }
                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                    cls.getMethod(o7, CharSequence.class).invoke(childAt, bVar.f4d);
                                    i9 = i10;
                                    break;
                                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                    cls.getMethod(o7, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f5e));
                                    i9 = i10;
                                    break;
                                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                    cls.getMethod(o7, cls3).invoke(childAt, Float.valueOf(bVar.f3c));
                                    i9 = i10;
                                    break;
                                default:
                                    i9 = i10;
                                    break;
                            }
                        } catch (IllegalAccessException e12) {
                            e = e12;
                            i9 = i10;
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            i9 = i10;
                        } catch (InvocationTargetException e14) {
                            e = e14;
                            i9 = i10;
                        }
                        childCount = i12;
                        hashSet2 = hashSet3;
                        i10 = i9;
                    }
                    i4 = childCount;
                    hashSet = hashSet2;
                    i8 = i10;
                    childAt.setLayoutParams(eVar);
                    if (nVar.f159b == 0) {
                        childAt.setVisibility(nVar.f158a);
                    }
                    childAt.setAlpha(nVar.f160c);
                    childAt.setRotation(oVar.f163a);
                    childAt.setRotationX(oVar.f164b);
                    childAt.setRotationY(oVar.f165c);
                    childAt.setScaleX(oVar.f166d);
                    childAt.setScaleY(oVar.f167e);
                    if (!Float.isNaN(oVar.f168f)) {
                        childAt.setPivotX(oVar.f168f);
                    }
                    if (!Float.isNaN(oVar.f169g)) {
                        childAt.setPivotY(oVar.f169g);
                    }
                    childAt.setTranslationX(oVar.f170h);
                    childAt.setTranslationY(oVar.f171i);
                    childAt.setTranslationZ(oVar.j);
                    if (oVar.k) {
                        childAt.setElevation(oVar.f172l);
                    }
                    i10 = i8 + 1;
                    pVar = this;
                    childCount = i4;
                    hashSet2 = hashSet;
                }
            }
            i4 = childCount;
            hashSet = hashSet2;
            i8 = i10;
            i10 = i8 + 1;
            pVar = this;
            childCount = i4;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            k kVar2 = (k) hashMap.get(num);
            l lVar2 = kVar2.f93d;
            int i13 = lVar2.f125c0;
            if (i13 != -1 && i13 == 1) {
                Context context = constraintLayout.getContext();
                ?? view = new View(context);
                view.f7d = new int[32];
                view.f12i = new HashMap();
                view.f9f = context;
                ?? iVar = new y.i();
                iVar.f16308f0 = 0;
                iVar.f16309g0 = true;
                iVar.f16310h0 = 0;
                view.f0l = iVar;
                view.f10g = iVar;
                view.g();
                view.setVisibility(8);
                view.setId(num.intValue());
                int[] iArr2 = lVar2.f127d0;
                if (iArr2 != null) {
                    view.setReferencedIds(iArr2);
                } else {
                    String str4 = lVar2.f129e0;
                    if (str4 != null) {
                        int[] d3 = d(view, str4);
                        lVar2.f127d0 = d3;
                        view.setReferencedIds(d3);
                    }
                }
                view.setType(lVar2.f121a0);
                view.setMargin(lVar2.f123b0);
                int i14 = ConstraintLayout.f8515s;
                e eVar2 = new e(-2);
                view.g();
                kVar2.a(eVar2);
                constraintLayout.addView((View) view, eVar2);
            }
            if (lVar2.f120a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                int i15 = ConstraintLayout.f8515s;
                e eVar3 = new e(-2);
                kVar2.a(eVar3);
                constraintLayout.addView(guideline, eVar3);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = pVar.f177c;
        hashMap.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (pVar.f176b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new k());
            }
            k kVar = (k) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap hashMap3 = pVar.f175a;
            for (String str : hashMap3.keySet()) {
                b bVar = (b) hashMap3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        hashMap2.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e9) {
                    e9.printStackTrace();
                } catch (NoSuchMethodException e10) {
                    e10.printStackTrace();
                } catch (InvocationTargetException e11) {
                    e11.printStackTrace();
                }
            }
            kVar.f95f = hashMap2;
            n nVar = kVar.f91b;
            l lVar = kVar.f93d;
            o oVar = kVar.f94e;
            kVar.f90a = id;
            lVar.f132g = eVar.f44d;
            lVar.f134h = eVar.f46e;
            lVar.f136i = eVar.f48f;
            lVar.j = eVar.f50g;
            lVar.k = eVar.f52h;
            lVar.f138l = eVar.f54i;
            lVar.f139m = eVar.j;
            lVar.f140n = eVar.k;
            lVar.f141o = eVar.f57l;
            lVar.f142p = eVar.f61p;
            lVar.f143q = eVar.f62q;
            lVar.f144r = eVar.f63r;
            lVar.f145s = eVar.f64s;
            lVar.f146t = eVar.f71z;
            lVar.f147u = eVar.f14A;
            lVar.f148v = eVar.f15B;
            lVar.f149w = eVar.f58m;
            lVar.f150x = eVar.f59n;
            lVar.f151y = eVar.f60o;
            lVar.f152z = eVar.f28P;
            lVar.f96A = eVar.f29Q;
            lVar.f97B = eVar.f30R;
            lVar.f130f = eVar.f42c;
            lVar.f126d = eVar.f38a;
            lVar.f128e = eVar.f40b;
            lVar.f122b = ((ViewGroup.MarginLayoutParams) eVar).width;
            lVar.f124c = ((ViewGroup.MarginLayoutParams) eVar).height;
            lVar.f98C = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            lVar.f99D = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            lVar.f100E = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            lVar.f101F = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            lVar.f109O = eVar.f18E;
            lVar.f110P = eVar.f17D;
            lVar.f112R = eVar.f20G;
            lVar.f111Q = eVar.f19F;
            lVar.f133g0 = eVar.f31S;
            lVar.f135h0 = eVar.f32T;
            lVar.f113S = eVar.f21H;
            lVar.f114T = eVar.f22I;
            lVar.f115U = eVar.f24L;
            lVar.f116V = eVar.f25M;
            lVar.f117W = eVar.f23J;
            lVar.f118X = eVar.K;
            lVar.Y = eVar.f26N;
            lVar.f119Z = eVar.f27O;
            lVar.f131f0 = eVar.f33U;
            lVar.f105J = eVar.f66u;
            lVar.f106L = eVar.f68w;
            lVar.f104I = eVar.f65t;
            lVar.K = eVar.f67v;
            lVar.f108N = eVar.f69x;
            lVar.f107M = eVar.f70y;
            lVar.f102G = eVar.getMarginEnd();
            lVar.f103H = eVar.getMarginStart();
            nVar.f158a = childAt.getVisibility();
            nVar.f160c = childAt.getAlpha();
            oVar.f163a = childAt.getRotation();
            oVar.f164b = childAt.getRotationX();
            oVar.f165c = childAt.getRotationY();
            oVar.f166d = childAt.getScaleX();
            oVar.f167e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                oVar.f168f = pivotX;
                oVar.f169g = pivotY;
            }
            oVar.f170h = childAt.getTranslationX();
            oVar.f171i = childAt.getTranslationY();
            oVar.j = childAt.getTranslationZ();
            if (oVar.k) {
                oVar.f172l = childAt.getElevation();
            }
            if (childAt instanceof a) {
                a aVar = (a) childAt;
                lVar.f137i0 = aVar.f0l.f16309g0;
                lVar.f127d0 = aVar.getReferencedIds();
                lVar.f121a0 = aVar.getType();
                lVar.f123b0 = aVar.getMargin();
            }
            i4++;
            pVar = this;
        }
    }

    public final void c(int i4, int i8, int i9, int i10) {
        Integer valueOf = Integer.valueOf(i4);
        HashMap hashMap = this.f177c;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i4), new k());
        }
        k kVar = (k) hashMap.get(Integer.valueOf(i4));
        switch (i8) {
            case 1:
                if (i10 == 1) {
                    l lVar = kVar.f93d;
                    lVar.f132g = i9;
                    lVar.f134h = -1;
                    return;
                } else if (i10 == 2) {
                    l lVar2 = kVar.f93d;
                    lVar2.f134h = i9;
                    lVar2.f132g = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + h(i10) + " undefined");
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (i10 == 1) {
                    l lVar3 = kVar.f93d;
                    lVar3.f136i = i9;
                    lVar3.j = -1;
                    return;
                } else if (i10 == 2) {
                    l lVar4 = kVar.f93d;
                    lVar4.j = i9;
                    lVar4.f136i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + h(i10) + " undefined");
                }
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (i10 == 3) {
                    l lVar5 = kVar.f93d;
                    lVar5.k = i9;
                    lVar5.f138l = -1;
                    lVar5.f141o = -1;
                    return;
                }
                if (i10 == 4) {
                    l lVar6 = kVar.f93d;
                    lVar6.f138l = i9;
                    lVar6.k = -1;
                    lVar6.f141o = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + h(i10) + " undefined");
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (i10 == 4) {
                    l lVar7 = kVar.f93d;
                    lVar7.f140n = i9;
                    lVar7.f139m = -1;
                    lVar7.f141o = -1;
                    return;
                }
                if (i10 == 3) {
                    l lVar8 = kVar.f93d;
                    lVar8.f139m = i9;
                    lVar8.f140n = -1;
                    lVar8.f141o = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + h(i10) + " undefined");
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (i10 == 5) {
                    l lVar9 = kVar.f93d;
                    lVar9.f141o = i9;
                    lVar9.f140n = -1;
                    lVar9.f139m = -1;
                    lVar9.k = -1;
                    lVar9.f138l = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + h(i10) + " undefined");
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i10 == 6) {
                    l lVar10 = kVar.f93d;
                    lVar10.f143q = i9;
                    lVar10.f142p = -1;
                    return;
                } else if (i10 == 7) {
                    l lVar11 = kVar.f93d;
                    lVar11.f142p = i9;
                    lVar11.f143q = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + h(i10) + " undefined");
                }
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (i10 == 7) {
                    l lVar12 = kVar.f93d;
                    lVar12.f145s = i9;
                    lVar12.f144r = -1;
                    return;
                } else if (i10 == 6) {
                    l lVar13 = kVar.f93d;
                    lVar13.f144r = i9;
                    lVar13.f145s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + h(i10) + " undefined");
                }
            default:
                throw new IllegalArgumentException(h(i8) + " to " + h(i10) + " unknown");
        }
    }

    public final void f(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        k e9 = e(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            e9.f93d.f120a = true;
                        }
                        this.f177c.put(Integer.valueOf(e9.f90a), e9);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
