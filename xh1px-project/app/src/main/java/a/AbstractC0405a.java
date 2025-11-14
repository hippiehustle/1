package a;

import C6.EnumC0005f;
import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0008i;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import D0.c;
import E2.b;
import E2.d;
import F6.AbstractC0054n;
import F6.B;
import F6.C0050j;
import F6.D;
import I7.m;
import I7.v;
import J0.A;
import P6.AbstractC0282e;
import P6.w;
import R.g;
import T6.F;
import X7.f;
import X7.i;
import Y6.k;
import Y6.r;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a7.C0439A;
import a7.C0450k;
import a7.I;
import a7.Q;
import a7.T;
import a7.V;
import a7.Y;
import a7.b0;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import e.AbstractC0627c;
import f7.AbstractC0727g;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import g4.C0779a;
import h6.AbstractC0837b;
import i.AbstractActivityC0870i;
import i7.AbstractC0892g;
import i7.C0896k;
import j7.InterfaceC0943b;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k2.C0952b;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import n6.InterfaceC1165d;
import n7.C1169b;
import n7.EnumC1170c;
import o6.j;
import q4.X;
import s3.AbstractC1492c;
import s7.InterfaceC1521l;
import u7.s;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.C1758u;
import w7.E;
import w7.G;
import w7.J;
import w7.M;
import w7.S;
import w7.U;
import w7.W;
import w7.z;
import x7.AbstractC1825g;
import x7.InterfaceC1822d;
import y7.l;
import z6.h;
import z6.o;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0405a {

    /* renamed from: a, reason: collision with root package name */
    public static A4.a f7655a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f7656b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Field f7657c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f7658d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7659e = 0;

    public static final h A(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "<this>");
        h o7 = abstractC1759v.B0().o();
        j.d(o7, "getBuiltIns(...)");
        return o7;
    }

    public static final void A0(AbstractC0627c abstractC0627c, Context context, boolean z8, InterfaceC1162a interfaceC1162a) {
        Intent createScreenCaptureIntent;
        MediaProjectionConfig createConfigForDefaultDisplay;
        j.e(abstractC0627c, "<this>");
        j.e(context, "context");
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) context.getSystemService(MediaProjectionManager.class);
        if (mediaProjectionManager != null) {
            try {
                Log.i("ProjectionRequest", "Requesting MediaProjection");
                if (Build.VERSION.SDK_INT >= 35 && z8) {
                    createConfigForDefaultDisplay = MediaProjectionConfig.createConfigForDefaultDisplay();
                    createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent(createConfigForDefaultDisplay);
                    j.d(createScreenCaptureIntent, "createScreenCaptureIntent(...)");
                } else {
                    createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                    j.d(createScreenCaptureIntent, "createScreenCaptureIntent(...)");
                }
                abstractC0627c.a(createScreenCaptureIntent);
            } catch (Exception unused) {
                Log.e("ProjectionRequest", "Can't start projection permission screen");
                interfaceC1162a.a();
            }
        }
    }

    public static ColorStateList B(Context context, g gVar, int i4) {
        int resourceId;
        ColorStateList o7;
        TypedArray typedArray = (TypedArray) gVar.f4988f;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (o7 = AbstractC1492c.o(context, resourceId)) != null) {
            return o7;
        }
        return gVar.z(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List B0(C0450k c0450k, B b4) {
        j.e(c0450k, "<this>");
        List list = c0450k.k;
        boolean isEmpty = list.isEmpty();
        ?? r02 = list;
        if (isEmpty) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> list2 = c0450k.f8162l;
            j.d(list2, "getSupertypeIdList(...)");
            r02 = new ArrayList(AbstractC0438m.d0(list2, 10));
            for (Integer num : list2) {
                j.b(num);
                r02.add(b4.a(num.intValue()));
            }
        }
        return r02;
    }

    public static ColorStateList C(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList o7;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (o7 = AbstractC1492c.o(context, resourceId)) != null) {
            return o7;
        }
        return typedArray.getColorStateList(i4);
    }

    public static final C0723c C0(C0723c c0723c, C0723c c0723c2) {
        j.e(c0723c, "<this>");
        C0724d c0724d = c0723c.f10797a;
        j.e(c0723c2, "prefix");
        C0724d c0724d2 = c0723c2.f10797a;
        if (!c0723c.equals(c0723c2) && !c0724d2.c()) {
            String str = c0724d.f10800a;
            String str2 = c0724d2.f10800a;
            if (!v.a0(str, str2) || str.charAt(str2.length()) != '.') {
                return c0723c;
            }
        }
        if (!c0724d2.c()) {
            if (c0723c.equals(c0723c2)) {
                return C0723c.f10796c;
            }
            String substring = c0724d.f10800a.substring(c0724d2.f10800a.length() + 1);
            j.d(substring, "substring(...)");
            return new C0723c(substring);
        }
        return c0723c;
    }

    public static U6.a D0(S s8, boolean z8, F f8, int i4) {
        boolean z9;
        boolean z10 = false;
        if ((i4 & 1) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i4 & 2) == 0) {
            z10 = true;
        }
        boolean z11 = z10;
        int i8 = i4 & 4;
        Set set = null;
        if (i8 != 0) {
            f8 = null;
        }
        if (f8 != null) {
            set = X.T(f8);
        }
        return new U6.a(s8, z11, z9, set, 34);
    }

    public static int E(Context context, TypedArray typedArray, int i4, int i8) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i4, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i8);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i4, i8);
    }

    public static final C0779a E0(C0952b c0952b, boolean z8) {
        int i4;
        int i8;
        j.e(c0952b, "<this>");
        if (c0952b.f11965g) {
            i4 = R.string.item_event_desc_enabled_children;
            i8 = R.drawable.ic_confirm;
        } else {
            i4 = R.string.item_event_desc_disabled_children;
            i8 = R.drawable.ic_cancel;
        }
        return new C0779a(c0952b, c0952b.f11961c, String.valueOf(c0952b.f11964f.size()), String.valueOf(c0952b.f11963e.size()), i4, i8, z8);
    }

    public static Drawable F(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable k;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (k = h4.g.k(context, resourceId)) != null) {
            return k;
        }
        return typedArray.getDrawable(i4);
    }

    public static final T F0(Q q6, B b4) {
        int i4 = q6.f7914e;
        if ((i4 & 2) == 2) {
            return q6.f7916g;
        }
        if ((i4 & 4) == 4) {
            return b4.a(q6.f7917h);
        }
        return null;
    }

    public static Set G() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final T G0(b0 b0Var, B b4) {
        j.e(b0Var, "<this>");
        j.e(b4, "typeTable");
        int i4 = b0Var.f8015f;
        if ((i4 & 4) == 4) {
            T t8 = b0Var.f8018i;
            j.d(t8, "getType(...)");
            return t8;
        }
        if ((i4 & 8) == 8) {
            return b4.a(b0Var.j);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final T H0(V v8, B b4) {
        int i4 = v8.f7962f;
        if ((i4 & 4) == 4) {
            T t8 = v8.j;
            j.d(t8, "getUnderlyingType(...)");
            return t8;
        }
        if ((i4 & 8) == 8) {
            return b4.a(v8.k);
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final long J(D0.a aVar) {
        j.e(aVar, "connection");
        if (R(aVar) == 0) {
            return -1L;
        }
        c L8 = aVar.L("SELECT last_insert_rowid()");
        try {
            L8.H();
            long j = L8.getLong(0);
            AbstractC0837b.d(L8, null);
            return j;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List K0(Y y4, B b4) {
        j.e(y4, "<this>");
        List list = y4.k;
        boolean isEmpty = list.isEmpty();
        ?? r02 = list;
        if (isEmpty) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> list2 = y4.f7990l;
            j.d(list2, "getUpperBoundIdList(...)");
            r02 = new ArrayList(AbstractC0438m.d0(list2, 10));
            for (Integer num : list2) {
                j.b(num);
                r02.add(b4.a(num.intValue()));
            }
        }
        return r02;
    }

    public static final T L0(b0 b0Var, B b4) {
        j.e(b0Var, "<this>");
        int i4 = b0Var.f8015f;
        if ((i4 & 16) == 16) {
            return b0Var.k;
        }
        if ((i4 & 32) == 32) {
            return b4.a(b0Var.f8019l);
        }
        return null;
    }

    public static final AbstractC1759v O(C6.T t8) {
        Object obj;
        List upperBounds = t8.getUpperBounds();
        j.d(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = t8.getUpperBounds();
        j.d(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            InterfaceC0004e interfaceC0004e = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC0007h c6 = ((AbstractC1759v) next).B0().c();
            if (c6 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) c6;
            }
            if (interfaceC0004e != null && interfaceC0004e.e() != EnumC0005f.f742e && interfaceC0004e.e() != EnumC0005f.f745h) {
                obj = next;
                break;
            }
        }
        AbstractC1759v abstractC1759v = (AbstractC1759v) obj;
        if (abstractC1759v == null) {
            List upperBounds3 = t8.getUpperBounds();
            j.d(upperBounds3, "getUpperBounds(...)");
            Object p02 = AbstractC0436k.p0(upperBounds3);
            j.d(p02, "first(...)");
            return (AbstractC1759v) p02;
        }
        return abstractC1759v;
    }

    public static final int R(D0.a aVar) {
        j.e(aVar, "connection");
        c L8 = aVar.L("SELECT changes()");
        try {
            L8.H();
            int i4 = (int) L8.getLong(0);
            AbstractC0837b.d(L8, null);
            return i4;
        } finally {
        }
    }

    public static final boolean U(C6.T t8, J j, Set set) {
        j.e(t8, "typeParameter");
        List<AbstractC1759v> upperBounds = t8.getUpperBounds();
        j.d(upperBounds, "getUpperBounds(...)");
        if (!upperBounds.isEmpty()) {
            for (AbstractC1759v abstractC1759v : upperBounds) {
                j.b(abstractC1759v);
                if (o(abstractC1759v, t8.l().B0(), set) && (j == null || j.a(abstractC1759v.B0(), j))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ boolean V(C6.T t8, J j, int i4) {
        if ((i4 & 2) != 0) {
            j = null;
        }
        return U(t8, j, null);
    }

    public static int W(int i4) {
        if (i4 != 1) {
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 4) {
                return 2;
            }
            if (i4 != 8) {
                if (i4 == 16) {
                    return 4;
                }
                if (i4 != 32) {
                    if (i4 != 64) {
                        if (i4 != 128) {
                            if (i4 == 256) {
                                return 8;
                            }
                            if (i4 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(A.j.l("type needs to be >= FIRST and <= LAST, type=", i4));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static A4.a X() {
        A4.a aVar;
        A4.a aVar2 = f7655a;
        if (aVar2 == null) {
            Object obj = null;
            try {
                aVar = new A4.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
            } catch (NoSuchMethodException unused) {
                aVar = new A4.a(obj, obj, obj, obj, 16);
            }
            f7655a = aVar;
            return aVar;
        }
        return aVar2;
    }

    public static final T Y(C0450k c0450k, B b4) {
        j.e(c0450k, "<this>");
        int i4 = c0450k.f8158f;
        if ((i4 & 16) == 16) {
            return c0450k.f8144A;
        }
        if ((i4 & 32) == 32) {
            return b4.a(c0450k.f8145B);
        }
        return null;
    }

    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 18) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i4 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static boolean a0(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final T b(T t8, B b4) {
        j.e(t8, "<this>");
        int i4 = t8.f7935f;
        if ((i4 & 1024) == 1024) {
            return t8.f7945r;
        }
        if ((i4 & 2048) == 2048) {
            return b4.a(t8.f7946s);
        }
        return null;
    }

    public static boolean b0(Context context) {
        boolean z8;
        ((c1.h) ((S5.a) d.o(context, S5.a.class))).getClass();
        Set set = Collections.EMPTY_SET;
        if (set.size() <= 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        b.h(z8, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (set.isEmpty()) {
            return true;
        }
        return ((Boolean) set.iterator().next()).booleanValue();
    }

    public static final B7.a c(AbstractC1759v abstractC1759v) {
        Object n02;
        w7.X b4;
        B7.d dVar;
        j.e(abstractC1759v, "type");
        if (AbstractC1741c.k(abstractC1759v)) {
            B7.a c6 = c(AbstractC1741c.l(abstractC1759v));
            B7.a c9 = c(AbstractC1741c.D(abstractC1759v));
            return new B7.a(AbstractC1741c.h(AbstractC1741c.e(AbstractC1741c.l((AbstractC1759v) c6.f525a), AbstractC1741c.D((AbstractC1759v) c9.f525a)), abstractC1759v), AbstractC1741c.h(AbstractC1741c.e(AbstractC1741c.l((AbstractC1759v) c6.f526b), AbstractC1741c.D((AbstractC1759v) c9.f526b)), abstractC1759v));
        }
        J B02 = abstractC1759v.B0();
        boolean z8 = true;
        if (abstractC1759v.B0() instanceof InterfaceC0943b) {
            j.c(B02, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            M b9 = ((InterfaceC0943b) B02).b();
            AbstractC1759v b10 = b9.b();
            j.d(b10, "getType(...)");
            AbstractC1759v h8 = U.h(b10, abstractC1759v.E0());
            int ordinal = b9.a().ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new B7.a(U.h(A(abstractC1759v).o(), abstractC1759v.E0()), h8);
                }
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + b9);
            }
            return new B7.a(h8, A(abstractC1759v).p());
        }
        if (!abstractC1759v.r0().isEmpty() && abstractC1759v.r0().size() == B02.e().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List r02 = abstractC1759v.r0();
            List e9 = B02.e();
            j.d(e9, "getParameters(...)");
            Iterator it = AbstractC0436k.X0(r02, e9).iterator();
            while (it.hasNext()) {
                Z5.j jVar = (Z5.j) it.next();
                M m6 = (M) jVar.f7485d;
                C6.T t8 = (C6.T) jVar.f7486e;
                j.b(t8);
                w7.X e02 = t8.e0();
                if (e02 != null) {
                    if (m6 != null) {
                        w7.Q q6 = w7.Q.f15971b;
                        if (m6.c()) {
                            b4 = w7.X.OUT_VARIANCE;
                        } else {
                            b4 = w7.Q.b(e02, m6.a());
                        }
                        int ordinal2 = b4.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    z o7 = AbstractC1098d.e(t8).o();
                                    AbstractC1759v b11 = m6.b();
                                    j.d(b11, "getType(...)");
                                    dVar = new B7.d(t8, o7, b11);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                AbstractC1759v b12 = m6.b();
                                j.d(b12, "getType(...)");
                                z p8 = AbstractC1098d.e(t8).p();
                                j.d(p8, "getNullableAnyType(...)");
                                dVar = new B7.d(t8, b12, p8);
                            }
                        } else {
                            AbstractC1759v b13 = m6.b();
                            j.d(b13, "getType(...)");
                            AbstractC1759v b14 = m6.b();
                            j.d(b14, "getType(...)");
                            dVar = new B7.d(t8, b13, b14);
                        }
                        if (m6.c()) {
                            arrayList.add(dVar);
                            arrayList2.add(dVar);
                        } else {
                            B7.a c10 = c(dVar.f529b);
                            AbstractC1759v abstractC1759v2 = (AbstractC1759v) c10.f525a;
                            AbstractC1759v abstractC1759v3 = (AbstractC1759v) c10.f526b;
                            B7.a c11 = c(dVar.f530c);
                            AbstractC1759v abstractC1759v4 = (AbstractC1759v) c11.f525a;
                            AbstractC1759v abstractC1759v5 = (AbstractC1759v) c11.f526b;
                            C6.T t9 = dVar.f528a;
                            B7.d dVar2 = new B7.d(t9, abstractC1759v3, abstractC1759v4);
                            B7.d dVar3 = new B7.d(t9, abstractC1759v2, abstractC1759v5);
                            arrayList.add(dVar2);
                            arrayList2.add(dVar3);
                        }
                    } else {
                        w7.Q.a(36);
                        throw null;
                    }
                } else {
                    w7.Q.a(35);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    B7.d dVar4 = (B7.d) it2.next();
                    dVar4.getClass();
                    if (!InterfaceC1822d.f16280a.b(dVar4.f529b, dVar4.f530c)) {
                        break;
                    }
                }
            }
            z8 = false;
            if (z8) {
                n02 = A(abstractC1759v).o();
            } else {
                n02 = n0(abstractC1759v, arrayList);
            }
            return new B7.a(n02, n0(abstractC1759v, arrayList2));
        }
        return new B7.a(abstractC1759v, abstractC1759v);
    }

    public static final boolean d(int i4, int i8, int i9, byte[] bArr, byte[] bArr2) {
        j.e(bArr, "a");
        j.e(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i4] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final E e(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "<this>");
        return new E(abstractC1759v);
    }

    public static final W e0(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "<this>");
        W g8 = U.g(abstractC1759v, true);
        j.d(g8, "makeNullable(...)");
        return g8;
    }

    public static X7.g f(String str, X x8, f[] fVarArr) {
        j.e(str, "serialName");
        if (!m.j0(str)) {
            if (!x8.equals(i.f7073e)) {
                X7.a aVar = new X7.a(str);
                return new X7.g(str, x8, aVar.f7049b.size(), AbstractC0434i.i1(fVarArr), aVar);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final Object f0(AbstractC1759v abstractC1759v, r rVar, InterfaceC1165d interfaceC1165d) {
        Y6.i c6;
        AbstractC1759v abstractC1759v2;
        r rVar2;
        Object f02;
        int ordinal;
        boolean z8;
        List list;
        Y6.j jVar;
        boolean z9;
        AbstractC1754p g8;
        Y6.f fVar = Y6.f.f7221d;
        j.e(abstractC1759v, "kotlinType");
        boolean z10 = rVar.f7241c;
        j.e(interfaceC1165d, "writeGenericType");
        if (h4.g.r(abstractC1759v)) {
            D d2 = o.f16808a;
            h4.g.r(abstractC1759v);
            h A2 = A(abstractC1759v);
            D6.j annotations = abstractC1759v.getAnnotations();
            AbstractC1759v o7 = h4.g.o(abstractC1759v);
            List j = h4.g.j(abstractC1759v);
            List p8 = h4.g.p(abstractC1759v);
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(p8, 10));
            Iterator it = p8.iterator();
            while (it.hasNext()) {
                arrayList.add(((M) it.next()).b());
            }
            G.f15953e.getClass();
            G g9 = G.f15954f;
            J B8 = o.f16808a.B();
            h4.g.q(abstractC1759v);
            AbstractC1759v b4 = ((M) AbstractC0436k.x0(abstractC1759v.r0())).b();
            j.d(b4, "getType(...)");
            ArrayList D02 = AbstractC0436k.D0(arrayList, AbstractC1741c.t(d.y(e(b4)), g9, B8, false));
            z p9 = A(abstractC1759v).p();
            j.d(p9, "getNullableAnyType(...)");
            return f0(h4.g.g(A2, annotations, o7, j, D02, p9, false).I0(abstractC1759v.E0()), rVar, interfaceC1165d);
        }
        z h8 = AbstractC1825g.h(abstractC1759v);
        if (h8 == null && ((g8 = AbstractC1825g.g(abstractC1759v)) == null || (h8 = AbstractC1825g.N(g8)) == null)) {
            h8 = AbstractC1825g.h(abstractC1759v);
            j.b(h8);
        }
        J V6 = AbstractC1825g.V(h8);
        Object obj = null;
        if (AbstractC1825g.y(V6)) {
            j.e(V6, "$receiver");
            if (V6 instanceof J) {
                InterfaceC0007h c9 = V6.c();
                j.c(c9, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                z6.j u8 = h.u((InterfaceC0004e) c9);
                if (u8 != null) {
                    switch (u8.ordinal()) {
                        case 0:
                            jVar = k.f7228a;
                            break;
                        case 1:
                            jVar = k.f7229b;
                            break;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            jVar = k.f7230c;
                            break;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            jVar = k.f7231d;
                            break;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            jVar = k.f7232e;
                            break;
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                            jVar = k.f7233f;
                            break;
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            jVar = k.f7234g;
                            break;
                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                            jVar = k.f7235h;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (!AbstractC1825g.H(abstractC1759v)) {
                        C0723c c0723c = w.f4610p;
                        j.d(c0723c, "ENHANCED_NULLABILITY_ANNOTATION");
                        if (!AbstractC1825g.u(abstractC1759v, c0723c)) {
                            z9 = false;
                            obj = b.d(jVar, z9);
                        }
                    }
                    z9 = true;
                    obj = b.d(jVar, z9);
                } else {
                    j.e(V6, "$receiver");
                    if (V6 instanceof J) {
                        InterfaceC0007h c10 = V6.c();
                        j.c(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        z6.j s8 = h.s((InterfaceC0004e) c10);
                        if (s8 != null) {
                            StringBuilder sb = new StringBuilder("[");
                            EnumC1170c enumC1170c = (EnumC1170c) EnumC1170c.f13027q.get(s8);
                            if (enumC1170c != null) {
                                sb.append(enumC1170c.c());
                                obj = Y6.f.b(sb.toString());
                            } else {
                                EnumC1170c.a(6);
                                throw null;
                            }
                        } else {
                            j.e(V6, "$receiver");
                            if (V6 instanceof J) {
                                InterfaceC0007h c11 = V6.c();
                                if (c11 != null && h.J(c11)) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    j.e(V6, "$receiver");
                                    if (V6 instanceof J) {
                                        InterfaceC0007h c12 = V6.c();
                                        j.c(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                        C0724d h9 = AbstractC1098d.h((InterfaceC0004e) c12);
                                        String str = B6.d.f457a;
                                        C0722b f8 = B6.d.f(h9);
                                        if (f8 != null) {
                                            if (!rVar.f7245g && ((list = B6.d.f468n) == null || !list.isEmpty())) {
                                                Iterator it2 = list.iterator();
                                                while (it2.hasNext()) {
                                                    if (((B6.c) it2.next()).f454a.equals(f8)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            obj = Y6.f.c(C1169b.e(f8));
                                        }
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                                        sb2.append(V6);
                                        sb2.append(", ");
                                        throw new IllegalArgumentException(AbstractC1149a.i(o6.v.f13643a, V6.getClass(), sb2).toString());
                                    }
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                                sb3.append(V6);
                                sb3.append(", ");
                                throw new IllegalArgumentException(AbstractC1149a.i(o6.v.f13643a, V6.getClass(), sb3).toString());
                            }
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(V6);
                        sb4.append(", ");
                        throw new IllegalArgumentException(AbstractC1149a.i(o6.v.f13643a, V6.getClass(), sb4).toString());
                    }
                }
            } else {
                StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb5.append(V6);
                sb5.append(", ");
                throw new IllegalArgumentException(AbstractC1149a.i(o6.v.f13643a, V6.getClass(), sb5).toString());
            }
        }
        if (obj != null) {
            Object d3 = b.d(obj, rVar.f7239a);
            interfaceC1165d.j(abstractC1759v, d3, rVar);
            return d3;
        }
        J B02 = abstractC1759v.B0();
        if (B02 instanceof C1758u) {
            C1758u c1758u = (C1758u) B02;
            AbstractC1759v abstractC1759v3 = c1758u.f16015a;
            if (abstractC1759v3 != null) {
                return f0(m0(abstractC1759v3), rVar, interfaceC1165d);
            }
            LinkedHashSet linkedHashSet = c1758u.f16016b;
            j.e(linkedHashSet, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + AbstractC0436k.v0(linkedHashSet, null, null, null, null, 63));
        }
        InterfaceC0007h c13 = B02.c();
        if (c13 != null) {
            if (l.f(c13)) {
                return Y6.f.c("error/NonExistentClass");
            }
            boolean z11 = c13 instanceof InterfaceC0004e;
            if (z11 && h.z(abstractC1759v)) {
                if (abstractC1759v.r0().size() == 1) {
                    M m6 = (M) abstractC1759v.r0().get(0);
                    AbstractC1759v b9 = m6.b();
                    j.d(b9, "getType(...)");
                    if (m6.a() == w7.X.IN_VARIANCE) {
                        f02 = Y6.f.c("java/lang/Object");
                    } else {
                        w7.X a3 = m6.a();
                        j.d(a3, "getProjectionKind(...)");
                        if (z10 || ((ordinal = a3.ordinal()) == 0 ? (rVar2 = rVar.f7247i) == null : !(ordinal == 1 ? (rVar2 = rVar.f7246h) != null : (rVar2 = rVar.f7244f) != null))) {
                            rVar2 = rVar;
                        }
                        f02 = f0(b9, rVar2, interfaceC1165d);
                    }
                    return Y6.f.b("[" + Y6.f.h((k) f02));
                }
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            if (z11) {
                if (AbstractC0892g.b(c13) && !rVar.f7240b && (abstractC1759v2 = (AbstractC1759v) AbstractC1741c.d(abstractC1759v, new HashSet())) != null) {
                    return f0(abstractC1759v2, new r(rVar.f7239a, true, rVar.f7241c, rVar.f7242d, rVar.f7243e, rVar.f7244f, rVar.f7245g, rVar.f7246h, rVar.f7247i, 512), interfaceC1165d);
                }
                if (z10) {
                    C0725e c0725e = h.f16714e;
                    if (h.b((InterfaceC0004e) c13, z6.m.f16753Q)) {
                        c6 = Y6.f.c("java/lang/Class");
                        interfaceC1165d.j(abstractC1759v, c6, rVar);
                        return c6;
                    }
                }
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) c13;
                j.d(interfaceC0004e.a(), "getOriginal(...)");
                if (interfaceC0004e.e() == EnumC0005f.f744g) {
                    InterfaceC0010k q6 = interfaceC0004e.q();
                    j.c(q6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC0004e = (InterfaceC0004e) q6;
                }
                InterfaceC0004e a4 = interfaceC0004e.a();
                j.d(a4, "getOriginal(...)");
                c6 = Y6.f.c(n(a4, fVar));
                interfaceC1165d.j(abstractC1759v, c6, rVar);
                return c6;
            }
            if (c13 instanceof C6.T) {
                AbstractC1759v O8 = O((C6.T) c13);
                if (abstractC1759v.E0()) {
                    O8 = e0(O8);
                }
                return f0(O8, rVar, F7.c.f1619d);
            }
            if ((c13 instanceof C6.S) && rVar.j) {
                return f0(((s) ((C6.S) c13)).N0(), rVar, interfaceC1165d);
            }
            throw new UnsupportedOperationException("Unknown type " + abstractC1759v);
        }
        throw new UnsupportedOperationException("no descriptor for type constructor of " + abstractC1759v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (o6.j.a(((Y6.i) r6).f7226i, "java/lang/Object") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0115, code lost:
    
        r8 = r9.b();
        o6.j.d(r8, "getType(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012a, code lost:
    
        return (Y6.k) f0(e0(r8), Y6.r.k, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0113, code lost:
    
        if (m7.AbstractC1098d.g(r0).equals(m7.AbstractC1098d.g(r2)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k g0(InterfaceC0019u interfaceC0019u, F6.U u8) {
        InterfaceC0004e interfaceC0004e;
        Y6.j jVar;
        EnumC1170c enumC1170c;
        InterfaceC0019u a3;
        j.e(interfaceC0019u, "f");
        boolean a4 = j.a(((AbstractC0054n) interfaceC0019u).getName().b(), "remove");
        F7.c cVar = F7.c.f1619d;
        InterfaceC0004e interfaceC0004e2 = null;
        if (a4 && interfaceC0019u.z0().size() == 1 && !(AbstractC1098d.k(interfaceC0019u).q() instanceof R6.c) && !h.A(interfaceC0019u)) {
            List z02 = interfaceC0019u.a().z0();
            j.d(z02, "getValueParameters(...)");
            AbstractC1759v b4 = ((F6.U) AbstractC0436k.G0(z02)).b();
            j.d(b4, "getType(...)");
            r rVar = r.k;
            k kVar = (k) f0(b4, rVar, cVar);
            if (kVar instanceof Y6.j) {
                jVar = (Y6.j) kVar;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                enumC1170c = jVar.f7227i;
            } else {
                enumC1170c = null;
            }
            if (enumC1170c == EnumC1170c.INT && (a3 = AbstractC0282e.a(interfaceC0019u)) != null) {
                List z03 = a3.a().z0();
                j.d(z03, "getValueParameters(...)");
                AbstractC1759v b9 = ((F6.U) AbstractC0436k.G0(z03)).b();
                j.d(b9, "getType(...)");
                k kVar2 = (k) f0(b9, rVar, cVar);
                InterfaceC0010k q6 = a3.q();
                j.d(q6, "getContainingDeclaration(...)");
                if (AbstractC1098d.h(q6).equals(z6.m.K.f10797a)) {
                    if (kVar2 instanceof Y6.i) {
                    }
                }
            }
        }
        if (interfaceC0019u.z0().size() == 1) {
            InterfaceC0010k q8 = interfaceC0019u.q();
            if (q8 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) q8;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null) {
                List z04 = interfaceC0019u.z0();
                j.d(z04, "getValueParameters(...)");
                InterfaceC0007h c6 = ((F6.U) AbstractC0436k.G0(z04)).b().B0().c();
                if (c6 instanceof InterfaceC0004e) {
                    interfaceC0004e2 = (InterfaceC0004e) c6;
                }
                if (interfaceC0004e2 != null) {
                    if (h.u(interfaceC0004e) != null) {
                    }
                }
            }
        }
        AbstractC1759v b10 = u8.b();
        j.d(b10, "getType(...)");
        return (k) f0(b10, r.k, cVar);
    }

    public static final T h0(T t8, B b4) {
        j.e(t8, "<this>");
        int i4 = t8.f7935f;
        if ((i4 & 256) == 256) {
            return t8.f7943p;
        }
        if ((i4 & 512) == 512) {
            return b4.a(t8.f7944q);
        }
        return null;
    }

    public static void i(String str, boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void j(int i4) {
        if (i4 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static final T j0(C0439A c0439a, B b4) {
        j.e(c0439a, "<this>");
        j.e(b4, "typeTable");
        int i4 = c0439a.f7779f;
        if ((i4 & 32) == 32) {
            return c0439a.f7784m;
        }
        if ((i4 & 64) == 64) {
            return b4.a(c0439a.f7785n);
        }
        return null;
    }

    public static final void k(String str, int i4) {
        if (str.charAt(i4) == '-') {
            return;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Expected '-' (hyphen) at index ", ", but was '");
        j.append(str.charAt(i4));
        j.append('\'');
        throw new IllegalArgumentException(j.toString().toString());
    }

    public static final T k0(I i4, B b4) {
        j.e(i4, "<this>");
        int i8 = i4.f7855f;
        if ((i8 & 32) == 32) {
            return i4.f7860m;
        }
        if ((i8 & 64) == 64) {
            return b4.a(i4.f7861n);
        }
        return null;
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static final AbstractC1759v l0(AbstractC1759v abstractC1759v, D6.j jVar) {
        if (abstractC1759v.getAnnotations().isEmpty() && jVar.isEmpty()) {
            return abstractC1759v;
        }
        return abstractC1759v.H0().K0(AbstractC1741c.r(abstractC1759v.y0(), jVar));
    }

    public static final void m(long j, long j5, long j8) {
        if ((j5 | j8) >= 0 && j5 <= j && j - j5 >= j8) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j5 + " byteCount=" + j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [w7.W] */
    public static final W m0(AbstractC1759v abstractC1759v) {
        z zVar;
        j.e(abstractC1759v, "<this>");
        W H02 = abstractC1759v.H0();
        if (H02 instanceof AbstractC1754p) {
            AbstractC1754p abstractC1754p = (AbstractC1754p) H02;
            z zVar2 = abstractC1754p.f16006e;
            if (!zVar2.B0().e().isEmpty() && zVar2.B0().c() != null) {
                List e9 = zVar2.B0().e();
                j.d(e9, "getParameters(...)");
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(e9, 10));
                Iterator it = e9.iterator();
                while (it.hasNext()) {
                    arrayList.add(new E((C6.T) it.next()));
                }
                zVar2 = AbstractC1741c.q(zVar2, arrayList, null, 2);
            }
            z zVar3 = abstractC1754p.f16007f;
            if (!zVar3.B0().e().isEmpty() && zVar3.B0().c() != null) {
                List e10 = zVar3.B0().e();
                j.d(e10, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(e10, 10));
                Iterator it2 = e10.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new E((C6.T) it2.next()));
                }
                zVar3 = AbstractC1741c.q(zVar3, arrayList2, null, 2);
            }
            zVar = AbstractC1741c.e(zVar2, zVar3);
        } else if (H02 instanceof z) {
            z zVar4 = (z) H02;
            boolean isEmpty = zVar4.B0().e().isEmpty();
            zVar = zVar4;
            if (!isEmpty) {
                InterfaceC0007h c6 = zVar4.B0().c();
                zVar = zVar4;
                if (c6 != null) {
                    List e11 = zVar4.B0().e();
                    j.d(e11, "getParameters(...)");
                    ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(e11, 10));
                    Iterator it3 = e11.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new E((C6.T) it3.next()));
                    }
                    zVar = AbstractC1741c.q(zVar4, arrayList3, null, 2);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC1741c.h(zVar, H02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r1.f10805e == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String n(InterfaceC0004e interfaceC0004e, Y6.f fVar) {
        InterfaceC0004e interfaceC0004e2;
        j.e(interfaceC0004e, "klass");
        j.e(fVar, "typeMappingConfiguration");
        InterfaceC0010k q6 = interfaceC0004e.q();
        j.d(q6, "getContainingDeclaration(...)");
        C0725e name = interfaceC0004e.getName();
        if (name != null) {
            C0725e c0725e = AbstractC0727g.f10808a;
        }
        name = AbstractC0727g.f10810c;
        String c6 = name.c();
        if (q6 instanceof C6.F) {
            C0723c c0723c = ((F6.E) ((C6.F) q6)).f1461i;
            if (c0723c.f10797a.c()) {
                return c6;
            }
            return v.Y(c0723c.f10797a.f10800a, '.', '/') + '/' + c6;
        }
        if (q6 instanceof InterfaceC0004e) {
            interfaceC0004e2 = (InterfaceC0004e) q6;
        } else {
            interfaceC0004e2 = null;
        }
        if (interfaceC0004e2 != null) {
            return n(interfaceC0004e2, fVar) + '$' + c6;
        }
        throw new IllegalArgumentException("Unexpected container: " + q6 + " for " + interfaceC0004e);
    }

    public static final AbstractC1759v n0(AbstractC1759v abstractC1759v, ArrayList arrayList) {
        E e9;
        abstractC1759v.r0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B7.d dVar = (B7.d) it.next();
            dVar.getClass();
            AbstractC1759v abstractC1759v2 = dVar.f530c;
            AbstractC1759v abstractC1759v3 = dVar.f529b;
            C6.T t8 = dVar.f528a;
            InterfaceC1822d.f16280a.b(abstractC1759v3, abstractC1759v2);
            if (!j.a(abstractC1759v3, abstractC1759v2)) {
                w7.X e02 = t8.e0();
                w7.X x8 = w7.X.IN_VARIANCE;
                if (e02 != x8) {
                    boolean F2 = h.F(abstractC1759v3);
                    w7.X x9 = w7.X.OUT_VARIANCE;
                    w7.X x10 = w7.X.INVARIANT;
                    if (F2 && t8.e0() != x8) {
                        if (x9 == t8.e0()) {
                            x9 = x10;
                        }
                        e9 = new E(abstractC1759v2, x9);
                    } else if (abstractC1759v2 != null) {
                        if (h.y(abstractC1759v2) && abstractC1759v2.E0()) {
                            if (x8 == t8.e0()) {
                                x8 = x10;
                            }
                            e9 = new E(abstractC1759v3, x8);
                        } else {
                            if (x9 == t8.e0()) {
                                x9 = x10;
                            }
                            e9 = new E(abstractC1759v2, x9);
                        }
                    } else {
                        h.a(140);
                        throw null;
                    }
                    arrayList2.add(e9);
                }
            }
            e9 = new E(abstractC1759v3);
            arrayList2.add(e9);
        }
        return AbstractC1741c.p(abstractC1759v, arrayList2, null, 6);
    }

    public static final boolean o(AbstractC1759v abstractC1759v, J j, Set set) {
        InterfaceC0008i interfaceC0008i;
        List list;
        C6.T t8;
        boolean o7;
        if (!j.a(abstractC1759v.B0(), j)) {
            InterfaceC0007h c6 = abstractC1759v.B0().c();
            if (c6 instanceof InterfaceC0008i) {
                interfaceC0008i = (InterfaceC0008i) c6;
            } else {
                interfaceC0008i = null;
            }
            if (interfaceC0008i != null) {
                list = interfaceC0008i.t();
            } else {
                list = null;
            }
            Iterable W02 = AbstractC0436k.W0(abstractC1759v.r0());
            if (!(W02 instanceof Collection) || !((Collection) W02).isEmpty()) {
                Iterator it = W02.iterator();
                do {
                    H7.b bVar = (H7.b) it;
                    if (bVar.f2047e.hasNext()) {
                        a6.v vVar = (a6.v) bVar.next();
                        int i4 = vVar.f7769a;
                        M m6 = (M) vVar.f7770b;
                        if (list != null) {
                            t8 = (C6.T) AbstractC0436k.s0(i4, list);
                        } else {
                            t8 = null;
                        }
                        if ((t8 != null && set != null && set.contains(t8)) || m6.c()) {
                            o7 = false;
                        } else {
                            AbstractC1759v b4 = m6.b();
                            j.d(b4, "getType(...)");
                            o7 = o(b4, j, set);
                        }
                    }
                } while (!o7);
                return true;
            }
            return false;
        }
        return true;
    }

    public static LinkedHashSet o0(C0725e c0725e, Collection collection, Collection collection2, InterfaceC0004e interfaceC0004e, InterfaceC1521l interfaceC1521l, C0896k c0896k, boolean z8) {
        if (c0725e != null) {
            if (collection != null) {
                if (interfaceC0004e != null) {
                    if (interfaceC1521l != null) {
                        if (c0896k != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            c0896k.h(c0725e, collection, collection2, interfaceC0004e, new Q6.a(interfaceC1521l, linkedHashSet, z8));
                            return linkedHashSet;
                        }
                        a(17);
                        throw null;
                    }
                    a(16);
                    throw null;
                }
                a(15);
                throw null;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List p(C0450k c0450k, B b4) {
        j.e(c0450k, "<this>");
        List list = c0450k.f8166p;
        boolean isEmpty = list.isEmpty();
        ?? r02 = list;
        if (isEmpty) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> list2 = c0450k.f8167q;
            j.d(list2, "getContextReceiverTypeIdList(...)");
            r02 = new ArrayList(AbstractC0438m.d0(list2, 10));
            for (Integer num : list2) {
                j.b(num);
                r02.add(b4.a(num.intValue()));
            }
        }
        return r02;
    }

    public static LinkedHashSet p0(C0725e c0725e, AbstractCollection abstractCollection, Collection collection, InterfaceC0004e interfaceC0004e, InterfaceC1521l interfaceC1521l, C0896k c0896k) {
        if (c0725e != null) {
            if (interfaceC0004e != null) {
                if (interfaceC1521l != null) {
                    if (c0896k != null) {
                        return o0(c0725e, abstractCollection, collection, interfaceC0004e, interfaceC1521l, c0896k, false);
                    }
                    a(5);
                    throw null;
                }
                a(4);
                throw null;
            }
            a(3);
            throw null;
        }
        a(0);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List q(C0439A c0439a, B b4) {
        j.e(c0439a, "<this>");
        List list = c0439a.f7786o;
        boolean isEmpty = list.isEmpty();
        ?? r02 = list;
        if (isEmpty) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> list2 = c0439a.f7787p;
            j.d(list2, "getContextReceiverTypeIdList(...)");
            r02 = new ArrayList(AbstractC0438m.d0(list2, 10));
            for (Integer num : list2) {
                j.b(num);
                r02.add(b4.a(num.intValue()));
            }
        }
        return r02;
    }

    public static LinkedHashSet q0(C0725e c0725e, Collection collection, AbstractCollection abstractCollection, T6.i iVar, InterfaceC1521l interfaceC1521l, C0896k c0896k) {
        if (c0725e != null) {
            if (collection != null) {
                if (iVar != null) {
                    if (interfaceC1521l != null) {
                        if (c0896k != null) {
                            return o0(c0725e, collection, abstractCollection, iVar, interfaceC1521l, c0896k, true);
                        }
                        a(11);
                        throw null;
                    }
                    a(10);
                    throw null;
                }
                a(9);
                throw null;
            }
            a(7);
            throw null;
        }
        a(6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List r(I i4, B b4) {
        j.e(i4, "<this>");
        List list = i4.f7862o;
        boolean isEmpty = list.isEmpty();
        ?? r02 = list;
        if (isEmpty) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> list2 = i4.f7863p;
            j.d(list2, "getContextReceiverTypeIdList(...)");
            r02 = new ArrayList(AbstractC0438m.d0(list2, 10));
            for (Integer num : list2) {
                j.b(num);
                r02.add(b4.a(num.intValue()));
            }
        }
        return r02;
    }

    public static final T r0(C0439A c0439a, B b4) {
        j.e(c0439a, "<this>");
        j.e(b4, "typeTable");
        int i4 = c0439a.f7779f;
        if ((i4 & 8) == 8) {
            T t8 = c0439a.j;
            j.d(t8, "getReturnType(...)");
            return t8;
        }
        if ((i4 & 16) == 16) {
            return b4.a(c0439a.k);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final T s0(I i4, B b4) {
        j.e(i4, "<this>");
        j.e(b4, "typeTable");
        int i8 = i4.f7855f;
        if ((i8 & 8) == 8) {
            T t8 = i4.j;
            j.d(t8, "getReturnType(...)");
            return t8;
        }
        if ((i8 & 16) == 16) {
            return b4.a(i4.k);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final E t(AbstractC1759v abstractC1759v, w7.X x8, C6.T t8) {
        w7.X x9;
        j.e(abstractC1759v, "type");
        if (t8 != null) {
            x9 = t8.e0();
        } else {
            x9 = null;
        }
        if (x9 == x8) {
            x8 = w7.X.INVARIANT;
        }
        return new E(abstractC1759v, x8);
    }

    public static boolean u(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2) {
        j.e(interfaceC0001b, "superDescriptor");
        j.e(interfaceC0001b2, "subDescriptor");
        if ((interfaceC0001b2 instanceof R6.f) && (interfaceC0001b instanceof InterfaceC0019u)) {
            R6.f fVar = (R6.f) interfaceC0001b2;
            fVar.z0().size();
            InterfaceC0019u interfaceC0019u = (InterfaceC0019u) interfaceC0001b;
            interfaceC0019u.z0().size();
            List z02 = fVar.a().z0();
            j.d(z02, "getValueParameters(...)");
            List z03 = interfaceC0019u.a().z0();
            j.d(z03, "getValueParameters(...)");
            Iterator it = AbstractC0436k.X0(z02, z03).iterator();
            while (it.hasNext()) {
                Z5.j jVar = (Z5.j) it.next();
                F6.U u8 = (F6.U) jVar.f7485d;
                F6.U u9 = (F6.U) jVar.f7486e;
                j.b(u8);
                boolean z8 = g0((InterfaceC0019u) interfaceC0001b2, u8) instanceof Y6.j;
                j.b(u9);
                if (z8 != (g0(interfaceC0019u, u9) instanceof Y6.j)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final T v(V v8, B b4) {
        int i4 = v8.f7962f;
        if ((i4 & 16) == 16) {
            T t8 = v8.f7966l;
            j.d(t8, "getExpandedType(...)");
            return t8;
        }
        if ((i4 & 32) == 32) {
            return b4.a(v8.f7967m);
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final void v0(A4.c cVar, int i4, String str) {
        j.e(str, "v");
        ((MaterialTextView) cVar.f292f).setText(i4);
        ((MaterialTextView) cVar.f293g).setText(str);
    }

    public static final void w(AbstractC1759v abstractC1759v, z zVar, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC0008i interfaceC0008i;
        List list;
        C6.T t8;
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 instanceof C6.T) {
            if (!j.a(abstractC1759v.B0(), zVar.B0())) {
                linkedHashSet.add(c6);
                return;
            }
            for (AbstractC1759v abstractC1759v2 : ((C6.T) c6).getUpperBounds()) {
                j.b(abstractC1759v2);
                w(abstractC1759v2, zVar, linkedHashSet, set);
            }
            return;
        }
        InterfaceC0007h c9 = abstractC1759v.B0().c();
        if (c9 instanceof InterfaceC0008i) {
            interfaceC0008i = (InterfaceC0008i) c9;
        } else {
            interfaceC0008i = null;
        }
        if (interfaceC0008i != null) {
            list = interfaceC0008i.t();
        } else {
            list = null;
        }
        int i4 = 0;
        for (M m6 : abstractC1759v.r0()) {
            int i8 = i4 + 1;
            if (list != null) {
                t8 = (C6.T) AbstractC0436k.s0(i4, list);
            } else {
                t8 = null;
            }
            if ((t8 == null || set == null || !set.contains(t8)) && !m6.c() && !AbstractC0436k.l0(linkedHashSet, m6.b().B0().c()) && !j.a(m6.b().B0(), zVar.B0())) {
                AbstractC1759v b4 = m6.b();
                j.d(b4, "getType(...)");
                w(b4, zVar, linkedHashSet, set);
            }
            i4 = i8;
        }
    }

    public static final T x(T t8, B b4) {
        j.e(t8, "<this>");
        int i4 = t8.f7935f;
        if ((i4 & 4) == 4) {
            return t8.j;
        }
        if ((i4 & 8) == 8) {
            return b4.a(t8.k);
        }
        return null;
    }

    public static final void x0(A4.b bVar, int i4, String str, int i8, String str2) {
        j.e(str, "leftVal");
        j.e(str2, "rightVal");
        bVar.f289i.setText(i4);
        bVar.f288h.setText(str);
        bVar.f287g.setText(i8);
        bVar.f286f.setText(str2);
    }

    public static final void y(long j, byte[] bArr, int i4, int i8, int i9) {
        int i10 = 7 - i8;
        int i11 = 8 - i9;
        if (i11 > i10) {
            return;
        }
        while (true) {
            int i12 = I7.c.f2225a[(int) ((j >> (i10 << 3)) & 255)];
            int i13 = i4 + 1;
            bArr[i4] = (byte) (i12 >> 8);
            i4 += 2;
            bArr[i13] = (byte) i12;
            if (i10 != i11) {
                i10--;
            } else {
                return;
            }
        }
    }

    public static final void y0(A4.b bVar, int i4, String str, String str2, String str3) {
        j.e(str, "min");
        j.e(str2, "avg");
        j.e(str3, "max");
        bVar.f287g.setText(i4);
        bVar.f289i.setText(str);
        bVar.f286f.setText(str2);
        bVar.f288h.setText(str3);
    }

    public static F6.U z(C0725e c0725e, InterfaceC0004e interfaceC0004e) {
        if (c0725e != null) {
            if (interfaceC0004e != null) {
                Collection G8 = interfaceC0004e.G();
                if (G8.size() != 1) {
                    return null;
                }
                for (F6.U u8 : ((C0050j) G8.iterator().next()).z0()) {
                    if (u8.getName().equals(c0725e)) {
                        return u8;
                    }
                }
                return null;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public abstract int D(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int H();

    public abstract int I();

    public abstract void I0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4);

    public abstract void J0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i8);

    public abstract int K();

    public abstract int L();

    public abstract int M(View view);

    public abstract int N(CoordinatorLayout coordinatorLayout);

    public abstract int P();

    public W0.c Q(AbstractActivityC0870i abstractActivityC0870i, Object obj) {
        return null;
    }

    public float S(View view) {
        if (f7656b) {
            try {
                return A.a(view);
            } catch (NoSuchMethodError unused) {
                f7656b = false;
            }
        }
        return view.getAlpha();
    }

    public abstract float T(C5.k kVar);

    public abstract boolean Z(float f8);

    public abstract boolean c0(View view);

    public abstract boolean d0(float f8, float f9);

    public abstract int g(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float h(int i4);

    public abstract Object i0(int i4, Intent intent);

    public abstract Intent s(AbstractActivityC0870i abstractActivityC0870i, Object obj);

    public void t0(View view, float f8) {
        if (f7656b) {
            try {
                A.b(view, f8);
                return;
            } catch (NoSuchMethodError unused) {
                f7656b = false;
            }
        }
        view.setAlpha(f8);
    }

    public void u0(View view, int i4) {
        if (!f7658d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f7657c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f7658d = true;
        }
        Field field = f7657c;
        if (field != null) {
            try {
                f7657c.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void w0(C5.k kVar, float f8);

    public abstract boolean z0(View view, float f8);
}
