package S0;

import A.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5193a;

    /* renamed from: b, reason: collision with root package name */
    public final char f5194b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5195c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5196d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5197e;

    public d(ArrayList arrayList, char c6, double d2, String str, String str2) {
        this.f5193a = arrayList;
        this.f5194b = c6;
        this.f5195c = d2;
        this.f5196d = str;
        this.f5197e = str2;
    }

    public static int a(char c6, String str, String str2) {
        return str2.hashCode() + j.c(str, c6 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f5194b, this.f5197e, this.f5196d);
    }
}
