package c7;

import java.util.Arrays;
import o6.j;

/* renamed from: c7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587f extends AbstractC0582a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0587f f9721g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0587f f9722h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9723f;

    static {
        C0587f c0587f;
        C0587f c0587f2 = new C0587f(new int[]{2, 2, 0}, false);
        f9721g = c0587f2;
        int i4 = c0587f2.f9676c;
        int i8 = c0587f2.f9675b;
        if (i8 == 1 && i4 == 9) {
            c0587f = new C0587f(new int[]{2, 0, 0}, false);
        } else {
            c0587f = new C0587f(new int[]{i8, i4 + 1, 0}, false);
        }
        f9722h = c0587f;
        new C0587f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587f(int[] iArr, boolean z8) {
        super(Arrays.copyOf(iArr, iArr.length));
        j.e(iArr, "versionArray");
        this.f9723f = z8;
    }

    public final boolean b(C0587f c0587f) {
        C0587f c0587f2;
        j.e(c0587f, "metadataVersionFromLanguageVersion");
        if (this.f9723f) {
            c0587f2 = f9721g;
        } else {
            c0587f2 = f9722h;
        }
        int i4 = c0587f2.f9675b;
        int i8 = c0587f.f9675b;
        if (i4 > i8 || (i4 >= i8 && c0587f2.f9676c > c0587f.f9676c)) {
            c0587f = c0587f2;
        }
        int i9 = this.f9676c;
        boolean z8 = false;
        int i10 = this.f9675b;
        if ((i10 == 1 && i9 == 0) || i10 == 0) {
            return false;
        }
        int i11 = c0587f.f9675b;
        if (i10 > i11 || (i10 >= i11 && i9 > c0587f.f9676c)) {
            z8 = true;
        }
        return !z8;
    }
}
