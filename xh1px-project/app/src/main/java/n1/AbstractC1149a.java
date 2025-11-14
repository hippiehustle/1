package n1;

import androidx.recyclerview.widget.RecyclerView;
import o6.p;
import o6.w;
import u6.r;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1149a {
    public static float a(float f8, float f9, float f10, float f11) {
        return ((f8 - f9) * f10) + f11;
    }

    public static int b(int i4, int i8, int i9) {
        return (Integer.hashCode(i4) + i8) * i9;
    }

    public static int c(int i4, int i8, boolean z8) {
        return (Boolean.hashCode(z8) + i4) * i8;
    }

    public static int d(long j, int i4, int i8) {
        return (Long.hashCode(j) + i4) * i8;
    }

    public static String e(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.C());
        return sb.toString();
    }

    public static String f(String str, long j) {
        return str + j;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(StringBuilder sb, int i4, String str) {
        sb.append(i4);
        sb.append(str);
        return sb.toString();
    }

    public static String i(w wVar, Class cls, StringBuilder sb) {
        sb.append(wVar.b(cls));
        return sb.toString();
    }

    public static StringBuilder j(int i4, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i4);
        sb.append(str2);
        return sb;
    }

    public static r k(Class cls, String str, String str2, int i4, w wVar) {
        return wVar.f(new p(cls, str, str2, i4));
    }

    public static /* synthetic */ void l(String str, int i4) {
        if (i4 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = o6.j.class.getName();
            int i8 = 0;
            while (!stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            while (stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            o6.j.h(nullPointerException, o6.j.class.getName());
            throw nullPointerException;
        }
    }

    public static void m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ void n(String str, int i4) {
        if (i4 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g(str, " must not be null"));
        o6.j.h(nullPointerException, o6.j.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ String o(int i4) {
        switch (i4) {
            case 1:
                return "NONE";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "LEFT";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "TOP";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "RIGHT";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
