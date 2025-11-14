package E2;

import I7.m;
import I7.o;
import I7.v;
import Y6.f;
import Y6.k;
import Z.g;
import Z5.r;
import Z5.t;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.w;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.C0471g;
import b6.C0533a;
import b6.C0535c;
import b7.C0542a;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.materialswitch.MaterialSwitch;
import e1.C0637a;
import f7.C0723c;
import f7.C0725e;
import h6.AbstractC0837b;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m.C1039b;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import n7.C1169b;
import n7.EnumC1170c;
import o6.j;
import q4.X;
import s3.AbstractC1492c;
import t6.C1586a;
import t6.C1587b;
import u6.InterfaceC1642c;
import u6.p;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1177a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1178b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1179c = 0;

    public b() {
        new ConcurrentHashMap();
    }

    public static int A(int i4, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        i8 = rect2.top;
                        i9 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i8 = rect2.left;
                    i9 = rect.right;
                }
            } else {
                i8 = rect.top;
                i9 = rect2.bottom;
            }
        } else {
            i8 = rect.left;
            i9 = rect2.right;
        }
        return Math.max(0, i8 - i9);
    }

    public static int B(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final K2.e C(Context context) {
        return new K2.e(context, X.T(Integer.valueOf(R.layout.item_list_header)));
    }

    public static float D(EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.c.c(edgeEffect, f8, f9);
        }
        S.b.a(edgeEffect, f8, f9);
        return f8;
    }

    public static void E(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final String F(D0.c cVar) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 0;
        do {
            if (i4 == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cVar.l(0));
                sb.append("'.\n");
            }
            String l6 = cVar.l(3);
            if (!linkedHashMap.containsKey(l6)) {
                linkedHashMap.put(l6, cVar.l(2));
            }
            i4++;
        } while (cVar.H());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(i4);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AbstractC1149a.m(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static C0542a G(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C1586a c1586a = new C1586a(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c1586a, 10));
        Iterator it = c1586a.iterator();
        while (((C1587b) it).f15128f) {
            ((w) it).nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] P02 = AbstractC0436k.P0(arrayList);
        return new C0542a(Arrays.copyOf(P02, P02.length));
    }

    public static final void H(A4.c cVar, boolean z8) {
        j.e(cVar, "<this>");
        ((MaterialSwitch) cVar.f293g).setChecked(z8);
    }

    public static final void I(A4.c cVar, int i4) {
        j.e(cVar, "<this>");
        A4.c cVar2 = (A4.c) cVar.f292f;
        j.d(cVar2, "titleAndDescription");
        X.R(cVar2, i4);
    }

    public static final void J(A4.c cVar, InterfaceC1162a interfaceC1162a) {
        ((MaterialSwitch) cVar.f293g).setOnClickListener(new a(1, interfaceC1162a));
    }

    public static void K(Drawable drawable, int i4) {
        drawable.setTint(i4);
    }

    public static final N6.c L(Collection collection, N6.d dVar) {
        Iterator it = collection.iterator();
        N6.c cVar = null;
        while (it.hasNext()) {
            N6.c cVar2 = (N6.c) it.next();
            if (j.a(cVar2.b(), dVar)) {
                if (cVar == null) {
                    cVar = cVar2;
                } else {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + dVar);
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + dVar);
    }

    public static final void M(String str, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i4);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static final ArrayList N(C0535c c0535c) {
        j.e(c0535c, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c0535c, 10));
        ListIterator listIterator = c0535c.listIterator(0);
        while (true) {
            C0533a c0533a = (C0533a) listIterator;
            if (c0533a.hasNext()) {
                p pVar = (p) c0533a.next();
                Object obj = pVar.get();
                String Z8 = v.Z(m.o0(pVar.getName(), "FLAG_"), "_", " ");
                Uri parse = Uri.parse("https://developer.android.com/reference/android/content/Intent#" + pVar.getName());
                j.d(parse, "parse(...)");
                arrayList.add(new C0637a(obj, Z8, parse));
            } else {
                return arrayList;
            }
        }
    }

    public static final String O(String str) {
        j.e(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static final r P(String str) {
        int i4;
        AbstractC1492c.f(10);
        int length = str.length();
        if (length != 0) {
            int i8 = 0;
            char charAt = str.charAt(0);
            if (j.f(charAt, 48) < 0) {
                i4 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i4 = 0;
            }
            int i9 = 119304647;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0) {
                    int i10 = i8 ^ Integer.MIN_VALUE;
                    if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                        if (i9 == 119304647) {
                            i9 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                            if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i11 = i8 * 10;
                    int i12 = digit + i11;
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                        return null;
                    }
                    i4++;
                    i8 = i12;
                } else {
                    return null;
                }
            }
            return new r(i8);
        }
        return null;
    }

    public static final t Q(String str) {
        int i4;
        long j;
        int i8;
        j.e(str, "<this>");
        int i9 = 10;
        AbstractC1492c.f(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            int i10 = 1;
            if (j.f(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i4 = 1;
                } else {
                    return null;
                }
            } else {
                i4 = 0;
            }
            long j5 = 10;
            long j8 = 0;
            long j9 = 512409557603043100L;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), i9);
                if (digit >= 0) {
                    int i11 = length;
                    long j10 = j8 ^ Long.MIN_VALUE;
                    int i12 = i4;
                    if (Long.compare(j10, j9 ^ Long.MIN_VALUE) > 0) {
                        if (j9 == 512409557603043100L) {
                            if (j5 < 0) {
                                if (Long.MAX_VALUE < (j5 ^ Long.MIN_VALUE)) {
                                    j = j5;
                                    j9 = 0;
                                } else {
                                    j9 = 1;
                                    j = j5;
                                }
                            } else {
                                long j11 = (Long.MAX_VALUE / j5) << i10;
                                if ((((-1) - (j11 * j5)) ^ Long.MIN_VALUE) >= (j5 ^ Long.MIN_VALUE)) {
                                    i8 = i10;
                                } else {
                                    i8 = 0;
                                }
                                j = j5;
                                j9 = j11 + i8;
                            }
                            if (Long.compare(j10, j9 ^ Long.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        j = j5;
                    }
                    long j12 = j8 * j;
                    long j13 = (digit & 4294967295L) + j12;
                    if (Long.compare(j13 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i4 = i12 + 1;
                    j8 = j13;
                    length = i11;
                    j5 = j;
                    i9 = 10;
                    i10 = 1;
                } else {
                    return null;
                }
            }
            return new t(j8);
        }
        return null;
    }

    public static final C0723c a(C0723c c0723c, String str) {
        return c0723c.a(C0725e.e(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = A(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(int i4, Rect rect, Rect rect2, Rect rect3) {
        boolean c6 = c(i4, rect, rect2);
        if (!c(i4, rect, rect3) && c6) {
            if (i4 != 17) {
                if (i4 != 33) {
                    if (i4 != 66) {
                        if (i4 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static final Object d(Object obj, boolean z8) {
        EnumC1170c enumC1170c;
        j.e(obj, "possiblyPrimitiveType");
        if (z8) {
            obj = (k) obj;
            if ((obj instanceof Y6.j) && (enumC1170c = ((Y6.j) obj).f7227i) != null) {
                C0723c c0723c = enumC1170c.f13035g;
                if (c0723c != null) {
                    String d2 = C1169b.b(c0723c).d();
                    j.d(d2, "getInternalName(...)");
                    return f.c(d2);
                }
                EnumC1170c.a(15);
                throw null;
            }
        }
        return obj;
    }

    public static final String e(String str) {
        j.e(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            StringBuilder sb = new StringBuilder(str.length());
            sb.append(Character.toUpperCase(charAt));
            sb.append((CharSequence) str, 1, str.length());
            return sb.toString();
        }
        return str;
    }

    public static void f(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void g(int i4, int i8, int i9) {
        if (i4 >= 0 && i8 <= i9) {
            if (i4 <= i8) {
                return;
            } else {
                throw new IllegalArgumentException(A.j.i(i4, i8, "fromIndex: ", " > toIndex: "));
            }
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i8 + ", size: " + i9);
    }

    public static void h(boolean z8, String str, Object... objArr) {
        if (z8) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final boolean n(String str, String str2) {
        j.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i4 < str.length()) {
                    char charAt = str.charAt(i4);
                    int i10 = i9 + 1;
                    if (i9 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i8 - 1 == 0 && i9 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i8++;
                    }
                    i4++;
                    i9 = i10;
                } else if (i8 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    j.d(substring, "substring(...)");
                    return j.a(m.w0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static String o(C0471g c0471g) {
        StringBuilder sb = new StringBuilder(c0471g.size());
        for (int i4 = 0; i4 < c0471g.size(); i4++) {
            byte g8 = c0471g.g(i4);
            if (g8 != 34) {
                if (g8 != 39) {
                    if (g8 != 92) {
                        switch (g8) {
                            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                                sb.append("\\a");
                                break;
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (g8 >= 32 && g8 <= 126) {
                                    sb.append((char) g8);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((g8 >>> 6) & 3) + 48));
                                    sb.append((char) (((g8 >>> 3) & 7) + 48));
                                    sb.append((char) ((g8 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final void p(D0.a aVar, String str) {
        j.e(aVar, "<this>");
        j.e(str, "sql");
        D0.c L8 = aVar.L(str);
        try {
            L8.H();
            AbstractC0837b.d(L8, null);
        } finally {
        }
    }

    public static View r(View view, int i4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View findViewById = viewGroup.getChildAt(i8).findViewById(i4);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static final String s(Collection collection) {
        j.e(collection, "collection");
        if (!collection.isEmpty()) {
            return o.P(AbstractC0436k.v0(collection, ",\n", "\n", "\n", null, 56)) + "},";
        }
        return " }";
    }

    public static float t(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final Context u(Context context) {
        return r5.e.b(new C1039b(context, R.style.AppTheme));
    }

    public static final int v(InterfaceC1642c interfaceC1642c) {
        j.e(interfaceC1642c, "<this>");
        o6.w wVar = o6.v.f13643a;
        if (interfaceC1642c.equals(wVar.b(Byte.TYPE))) {
            return R.string.dropdown_intent_extra_type_item_byte;
        }
        if (interfaceC1642c.equals(wVar.b(Boolean.TYPE))) {
            return R.string.dropdown_intent_extra_type_item_boolean;
        }
        if (interfaceC1642c.equals(wVar.b(Character.TYPE))) {
            return R.string.dropdown_intent_extra_type_item_char;
        }
        if (interfaceC1642c.equals(wVar.b(Double.TYPE))) {
            return R.string.dropdown_intent_extra_type_item_double;
        }
        if (interfaceC1642c.equals(wVar.b(Integer.TYPE))) {
            return R.string.dropdown_intent_extra_type_item_int;
        }
        if (interfaceC1642c.equals(wVar.b(Float.TYPE))) {
            return R.string.dropdown_intent_extra_type_item_float;
        }
        if (interfaceC1642c.equals(wVar.b(Short.TYPE))) {
            return R.string.dropdown_intent_extra_type_item_short;
        }
        if (interfaceC1642c.equals(wVar.b(String.class))) {
            return R.string.dropdown_intent_extra_type_item_string;
        }
        return 0;
    }

    public static final String w(String str) {
        int m02 = m.m0(str, '.', 6);
        if (m02 != -1 && m02 < m.e0(str)) {
            String substring = str.substring(m02 + 1);
            j.d(substring, "substring(...)");
            return substring;
        }
        return null;
    }

    public static boolean x(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        int i8 = rect.top;
                        int i9 = rect2.top;
                        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i10 = rect.left;
                int i11 = rect2.left;
                if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if ((i12 > i13 || rect.top >= i13) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i14 = rect.right;
        int i15 = rect2.right;
        if ((i14 > i15 || rect.left >= i15) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    public static boolean y(MotionEvent motionEvent, int i4) {
        if ((motionEvent.getSource() & i4) == i4) {
            return true;
        }
        return false;
    }

    public static final boolean z(String str, int i4) {
        char charAt = str.charAt(i4);
        if ('A' <= charAt && charAt < '[') {
            return true;
        }
        return false;
    }

    public abstract Typeface i(Context context, G.f fVar, Resources resources, int i4);

    public abstract Typeface j(Context context, M.j[] jVarArr, int i4);

    public Typeface k(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface l(Context context, InputStream inputStream) {
        File Y = c.Y(context);
        if (Y == null) {
            return null;
        }
        try {
            if (!c.Q(Y, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(Y.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            Y.delete();
        }
    }

    public Typeface m(Context context, Resources resources, int i4, String str, int i8) {
        File Y = c.Y(context);
        if (Y == null) {
            return null;
        }
        try {
            if (!c.P(Y, resources, i4)) {
                return null;
            }
            return Typeface.createFromFile(Y.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            Y.delete();
        }
    }

    public M.j q(M.j[] jVarArr, int i4) {
        int i8;
        boolean z8;
        int i9;
        if ((i4 & 1) == 0) {
            i8 = 400;
        } else {
            i8 = 700;
        }
        if ((i4 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        M.j jVar = null;
        int i10 = Integer.MAX_VALUE;
        for (M.j jVar2 : jVarArr) {
            int abs = Math.abs(jVar2.f3291c - i8) * 2;
            if (jVar2.f3292d == z8) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            int i11 = abs + i9;
            if (jVar == null || i10 > i11) {
                jVar = jVar2;
                i10 = i11;
            }
        }
        return jVar;
    }
}
