package P;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class l0 extends k0 {
    public l0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    @Override // P.p0
    public t0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f4282c.consumeDisplayCutout();
        return t0.g(null, consumeDisplayCutout);
    }

    @Override // P.p0
    public C0261i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f4282c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0261i(displayCutout);
    }

    @Override // P.j0, P.p0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (Objects.equals(this.f4282c, l0Var.f4282c) && Objects.equals(this.f4286g, l0Var.f4286g) && j0.y(this.f4287h, l0Var.f4287h)) {
            return true;
        }
        return false;
    }

    @Override // P.p0
    public int hashCode() {
        return this.f4282c.hashCode();
    }
}
