package A;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c1.C0566g;
import g0.AbstractComponentCallbacksC0755y;
import g0.T;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import l1.C0999a;
import o6.w;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static final void a(int i4, View view, ViewGroup viewGroup) {
        o6.j.e(view, "view");
        o6.j.e(viewGroup, "container");
        int b4 = AbstractC1769h.b(i4);
        ViewGroup viewGroup2 = null;
        if (b4 != 0) {
            if (b4 != 1) {
                if (b4 != 2) {
                    if (b4 == 3) {
                        if (T.K(2)) {
                            view.toString();
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (T.K(2)) {
                    view.toString();
                }
                view.setVisibility(8);
                return;
            }
            if (T.K(2)) {
                view.toString();
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 == null) {
                if (T.K(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent2;
        }
        if (viewGroup2 != null) {
            if (T.K(2)) {
                view.toString();
                viewGroup2.toString();
            }
            viewGroup2.removeView(view);
        }
    }

    public static /* synthetic */ boolean b(int i4) {
        if (i4 == 1 || i4 == 2) {
            return false;
        }
        if (i4 == 3 || i4 == 4) {
            return true;
        }
        throw null;
    }

    public static int c(String str, int i4, int i8) {
        return (str.hashCode() + i4) * i8;
    }

    public static int d(C0999a c0999a, int i4, int i8) {
        return (c0999a.hashCode() + i4) * i8;
    }

    public static int e(t.g gVar, int i4, D0.c cVar, int i8, int i9, int i10) {
        cVar.c(i8, gVar.f(i4));
        return i9 + i10;
    }

    public static D0.c f(t.g gVar, StringBuilder sb, String str, String str2, D0.a aVar) {
        int h8 = gVar.h();
        for (int i4 = 0; i4 < h8; i4++) {
            sb.append("?");
            if (i4 < h8 - 1) {
                sb.append(",");
            }
        }
        sb.append(str);
        String sb2 = sb.toString();
        o6.j.d(sb2, str2);
        return aVar.L(sb2);
    }

    public static Y5.c g(c1.h hVar, int i4) {
        return Y5.a.a(new C0566g(hVar, i4));
    }

    public static View h(ViewGroup viewGroup, int i4, ViewGroup viewGroup2, boolean z8) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup2, z8);
    }

    public static String i(int i4, int i8, String str, String str2) {
        return str + i4 + str2 + i8;
    }

    public static String j(int i4, String str, String str2) {
        return str + i4 + str2;
    }

    public static String k(String str) {
        return str;
    }

    public static String l(String str, int i4) {
        return str + i4;
    }

    public static String m(String str, M6.h hVar, String str2) {
        return str + hVar + str2;
    }

    public static String n(String str, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, String str2) {
        return str + abstractComponentCallbacksC0755y + str2;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(StringBuilder sb, String str, char c6) {
        sb.append(str);
        sb.append(c6);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(String str, C0999a c0999a, String str2, C0999a c0999a2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(c0999a);
        sb.append(str2);
        sb.append(c0999a2);
        sb.append(str3);
        return sb;
    }

    public static u6.i u(Class cls, String str, String str2, int i4, w wVar) {
        return wVar.d(new o6.m(cls, str, str2, i4));
    }

    public static /* synthetic */ void v(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z8 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z8) {
                    executorService.shutdownNow();
                    z8 = true;
                }
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String x(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    public static /* synthetic */ String y(int i4) {
        switch (i4) {
            case 1:
                return "BEGIN_ARRAY";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "END_ARRAY";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "BEGIN_OBJECT";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "END_OBJECT";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "NAME";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
