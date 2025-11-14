package K2;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes.dex */
public final class i implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2628a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f2629b;

    public /* synthetic */ i() {
        this(1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: NumberFormatException -> 0x003f, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x003f, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x0023, B:11:0x002d, B:13:0x0031), top: B:1:0x0000 }] */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i4, int i8, Spanned spanned, int i9, int i10) {
        boolean z8;
        Integer num;
        try {
            if (o6.j.a(charSequence, "-")) {
                charSequence = "-0";
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) spanned);
            sb.append((Object) charSequence);
            int parseInt = Integer.parseInt(sb.toString());
            Integer num2 = this.f2628a;
            boolean z9 = true;
            if (num2 != null && num2.intValue() > parseInt) {
                z8 = false;
                num = this.f2629b;
                if (num != null) {
                    if (parseInt > num.intValue()) {
                        z9 = false;
                    }
                }
                if (!z8 && z9) {
                    return null;
                }
            }
            z8 = true;
            num = this.f2629b;
            if (num != null) {
            }
            return !z8 ? "" : "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public i(Integer num, Integer num2) {
        this.f2628a = num;
        this.f2629b = num2;
    }
}
