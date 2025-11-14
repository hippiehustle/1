package O0;

import Z0.g;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class a extends Paint {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3852a;

    @Override // android.graphics.Paint
    public void setAlpha(int i4) {
        switch (this.f3852a) {
            case 0:
                if (Build.VERSION.SDK_INT < 30) {
                    setColor((g.c(i4) << 24) | (getColor() & 16777215));
                    return;
                } else {
                    super.setAlpha(g.c(i4));
                    return;
                }
            default:
                super.setAlpha(i4);
                return;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f3852a) {
            case 0:
                return;
            default:
                super.setTextLocales(localeList);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, int i8) {
        super(i4);
        this.f3852a = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PorterDuff.Mode mode) {
        super(1);
        this.f3852a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
