package N;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3508e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3510b;

    /* renamed from: c, reason: collision with root package name */
    public int f3511c;

    /* renamed from: d, reason: collision with root package name */
    public char f3512d;

    static {
        for (int i4 = 0; i4 < 1792; i4++) {
            f3508e[i4] = Character.getDirectionality(i4);
        }
    }

    public a(CharSequence charSequence) {
        this.f3509a = charSequence;
        this.f3510b = charSequence.length();
    }

    public final byte a() {
        int i4 = this.f3511c - 1;
        CharSequence charSequence = this.f3509a;
        char charAt = charSequence.charAt(i4);
        this.f3512d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f3511c);
            this.f3511c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f3511c--;
        char c6 = this.f3512d;
        if (c6 < 1792) {
            return f3508e[c6];
        }
        return Character.getDirectionality(c6);
    }
}
