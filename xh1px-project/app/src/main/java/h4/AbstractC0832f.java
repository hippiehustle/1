package h4;

import A0.i;
import A1.p;
import L7.AbstractC0166y;
import L7.F;
import L7.k0;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import g0.b0;
import i3.C0881a;
import i3.C0882b;
import i3.C0883c;
import j2.C0902b;
import j3.C0934t;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import l0.C0997a;
import l1.C0999a;
import l3.C1013l;
import m3.C1079s;
import n0.C1130h;
import n1.AbstractC1149a;
import n2.C1155c;
import n2.m;
import n2.s;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o6.j;
import p2.C1304a;
import t6.C1586a;
import t6.C1588c;
import t6.C1590e;
import x4.C1790c;

/* renamed from: h4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0832f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11370a = 0;

    public static final void A(C1.g gVar, R.g gVar2, Context context, b0 b0Var) {
        j.e(gVar, "<this>");
        j.e(b0Var, "creator");
        j.e(gVar2, "listener");
        gVar.d(context, new p(R.style.AppTheme, R.string.dialog_overlay_title_dumb_action_type, AbstractC0437l.X(C0882b.f11758d, C0881a.f11757d, i3.d.f11760d, C0883c.f11759d), new i3.f(gVar, context, b0Var, gVar2, 0), (InterfaceC1162a) gVar2.f4989g), false);
    }

    public static final void B(C1.g gVar, Context context, p2.d dVar, R.g gVar2) {
        j.e(gVar, "<this>");
        j.e(dVar, "dumbAction");
        j.e(gVar2, "listener");
        if (dVar instanceof C1304a) {
            C(gVar, context, (C1304a) dVar, gVar2);
            return;
        }
        if (dVar instanceof p2.c) {
            D(gVar, context, (p2.c) dVar, gVar2);
        } else {
            if (dVar instanceof p2.b) {
                p2.b bVar = (p2.b) dVar;
                Objects.toString(bVar);
                gVar.d(context, new C1013l(bVar, (InterfaceC1163b) gVar2.f4987e, (InterfaceC1163b) gVar2.f4988f, (InterfaceC1162a) gVar2.f4989g), true);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void C(C1.g gVar, Context context, C1304a c1304a, R.g gVar2) {
        if (!c1304a.h()) {
            Log.e("DumbActionUiFlow", "Can't start dumb click edition ui flow, click is invalid: " + c1304a);
            ((InterfaceC1162a) gVar2.f4989g).a();
            return;
        }
        c1304a.toString();
        gVar.d(context, new C0934t(c1304a, (InterfaceC1163b) gVar2.f4987e, (InterfaceC1163b) gVar2.f4988f, (InterfaceC1162a) gVar2.f4989g), true);
    }

    public static final void D(C1.g gVar, Context context, p2.c cVar, R.g gVar2) {
        if (!cVar.h()) {
            Log.e("DumbActionUiFlow", "Can't start dumb swipe edition ui flow, swipe is invalid: " + cVar);
            ((InterfaceC1162a) gVar2.f4989g).a();
            return;
        }
        cVar.toString();
        gVar.d(context, new C1079s(cVar, (InterfaceC1163b) gVar2.f4987e, (InterfaceC1163b) gVar2.f4988f, (InterfaceC1162a) gVar2.f4989g), true);
    }

    public static p2.e E(s sVar) {
        h1.f fVar;
        j.e(sVar, "<this>");
        m mVar = sVar.f12925a;
        C0999a c0999a = new C0999a(mVar.f12911a, false);
        String str = mVar.f12912b;
        int i4 = mVar.f12913c;
        boolean z8 = mVar.f12914d;
        int i8 = mVar.f12915e;
        boolean z9 = mVar.f12916f;
        boolean z10 = mVar.f12917g;
        List L02 = AbstractC0436k.L0(sVar.f12926b, new i(24));
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(L02, 10));
        Iterator it = L02.iterator();
        while (it.hasNext()) {
            arrayList.add(g.u((C1155c) it.next()));
        }
        n2.p pVar = sVar.f12927c;
        if (pVar == null) {
            fVar = new h1.f(0L, 0L);
        } else {
            fVar = new h1.f(pVar.f12921c, pVar.f12922d);
        }
        return new p2.e(c0999a, str, arrayList, i4, z8, i8, z9, z10, fVar);
    }

    public static final void F(RectF rectF, float f8, float f9) {
        j.e(rectF, "<this>");
        rectF.left += f8;
        rectF.top += f9;
        rectF.right += f8;
        rectF.bottom += f9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t6.a, t6.c] */
    public static C1588c G(int i4, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            C1588c c1588c = C1588c.f15130g;
            return C1588c.f15130g;
        }
        return new C1586a(i4, i8 - 1, 1);
    }

    public static double d(double d2) {
        if (d2 < 0.0d) {
            return 0.0d;
        }
        if (d2 > 100.0d) {
            return 100.0d;
        }
        return d2;
    }

    public static float e(float f8, float f9, float f10) {
        if (f9 <= f10) {
            if (f8 < f9) {
                return f9;
            }
            if (f8 > f10) {
                return f10;
            }
            return f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f9 + '.');
    }

    public static int f(int i4, int i8, int i9) {
        if (i8 <= i9) {
            if (i4 < i8) {
                return i8;
            }
            if (i4 > i9) {
                return i9;
            }
            return i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static int g(int i4, C1588c c1588c) {
        int i8 = c1588c.f15124e;
        int i9 = c1588c.f15123d;
        if (!c1588c.isEmpty()) {
            if (i4 < Integer.valueOf(i9).intValue()) {
                return Integer.valueOf(i9).intValue();
            }
            if (i4 > Integer.valueOf(i8).intValue()) {
                return Integer.valueOf(i8).intValue();
            }
            return i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c1588c + '.');
    }

    public static long h(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static long i(long j, C1590e c1590e) {
        long j5 = c1590e.f15136e;
        long j8 = c1590e.f15135d;
        if (!c1590e.isEmpty()) {
            if (j < Long.valueOf(j8).longValue()) {
                return Long.valueOf(j8).longValue();
            }
            if (j > Long.valueOf(j5).longValue()) {
                return Long.valueOf(j5).longValue();
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c1590e + '.');
    }

    public static int j(int i4, int i8) {
        return H.b.e(i4, (Color.alpha(i4) * i8) / 255);
    }

    public static Z k(Class cls) {
        j.e(cls, "modelClass");
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            j.b(newInstance);
            return (Z) newInstance;
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    public static final String l(AbstractCollection abstractCollection) {
        String valueOf;
        j.e(abstractCollection, "<this>");
        StringBuilder sb = new StringBuilder();
        for (Object obj : abstractCollection) {
            if (sb.length() > 0) {
                valueOf = ", " + obj;
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        return sb.toString();
    }

    public static int m(Context context, int i4, int i8) {
        Integer num;
        int i9;
        TypedValue E7 = E2.d.E(context, i4);
        if (E7 != null) {
            int i10 = E7.resourceId;
            if (i10 != 0) {
                i9 = context.getColor(i10);
            } else {
                i9 = E7.data;
            }
            num = Integer.valueOf(i9);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i8;
    }

    public static int n(Context context, int i4, String str) {
        TypedValue G8 = E2.d.G(context, i4, str);
        int i8 = G8.resourceId;
        if (i8 != 0) {
            return context.getColor(i8);
        }
        return G8.data;
    }

    public static int o(View view, int i4) {
        Context context = view.getContext();
        TypedValue G8 = E2.d.G(view.getContext(), i4, view.getClass().getCanonicalName());
        int i8 = G8.resourceId;
        if (i8 != 0) {
            return context.getColor(i8);
        }
        return G8.data;
    }

    public static final k0 p(Z z8, q1.e eVar, C0902b c0902b, InterfaceC1163b interfaceC1163b) {
        j.e(z8, "<this>");
        j.e(eVar, "repository");
        j.e(c0902b, "condition");
        j.e(interfaceC1163b, "onCompleted");
        C0997a g8 = U.g(z8);
        S7.e eVar2 = F.f3175a;
        return AbstractC0166y.q(g8, S7.d.f5456f, null, new C1790c(eVar, c0902b, interfaceC1163b, null), 2);
    }

    public static float q(int i4, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i4]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean r(int i4) {
        double pow;
        double pow2;
        double pow3;
        if (i4 != 0) {
            ThreadLocal threadLocal = H.b.f1846a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i4);
            int green = Color.green(i4);
            int blue = Color.blue(i4);
            if (dArr.length == 3) {
                double d2 = red / 255.0d;
                if (d2 < 0.04045d) {
                    pow = d2 / 12.92d;
                } else {
                    pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = green / 255.0d;
                if (d3 < 0.04045d) {
                    pow2 = d3 / 12.92d;
                } else {
                    pow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                double d9 = blue / 255.0d;
                if (d9 < 0.04045d) {
                    pow3 = d9 / 12.92d;
                } else {
                    pow3 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d10 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d10;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d10 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        return false;
    }

    public static boolean s(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int t(float f8, int i4, int i8) {
        return H.b.c(H.b.e(i8, Math.round(Color.alpha(i8) * f8)), i4);
    }

    public static final ArrayList u(Map map, InterfaceC1163b interfaceC1163b) {
        Boolean bool;
        j.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C1130h c1130h = (C1130h) entry.getValue();
            if (c1130h != null) {
                bool = Boolean.valueOf(c1130h.f12755b);
            } else {
                bool = null;
            }
            j.b(bool);
            if (!bool.booleanValue() && !c1130h.f12756c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) interfaceC1163b.m((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int x(Context context, int i4, int i8) {
        TypedValue E7 = E2.d.E(context, i4);
        if (E7 != null && E7.type == 16) {
            return E7.data;
        }
        return i8;
    }

    public static TimeInterpolator y(Context context, int i4, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!s(valueOf, "cubic-bezier") && !s(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (s(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(q(0, split), q(1, split), q(2, split), q(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            }
            if (s(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    H.e.b(D2.f.h(substring), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e9) {
                    throw new RuntimeException("Error in parsing ".concat(substring), e9);
                }
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static final void z(RectF rectF, float f8, PointF pointF) {
        j.e(rectF, "<this>");
        float width = (rectF.width() * f8) - rectF.width();
        float height = (rectF.height() * f8) - rectF.height();
        float width2 = (pointF.x - rectF.left) / rectF.width();
        float height2 = (pointF.y - rectF.top) / rectF.height();
        rectF.left -= width * width2;
        rectF.top -= height * height2;
        float f9 = 1;
        rectF.right = AbstractC1149a.a(f9, width2, width, rectF.right);
        rectF.bottom = AbstractC1149a.a(f9, height2, height, rectF.bottom);
    }

    public abstract boolean a(v.g gVar, v.c cVar);

    public abstract boolean b(v.g gVar, Object obj, Object obj2);

    public abstract boolean c(v.g gVar, v.f fVar, v.f fVar2);

    public abstract void v(v.f fVar, v.f fVar2);

    public abstract void w(v.f fVar, Thread thread);
}
