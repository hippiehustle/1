package L5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class u extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f3031e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f3032f;

    /* renamed from: g, reason: collision with root package name */
    public final B2.b f3033g;

    public u(n nVar, int i4) {
        super(nVar);
        this.f3031e = R.drawable.design_password_eye;
        this.f3033g = new B2.b(10, this);
        if (i4 != 0) {
            this.f3031e = i4;
        }
    }

    @Override // L5.o
    public final void b() {
        q();
    }

    @Override // L5.o
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // L5.o
    public final int d() {
        return this.f3031e;
    }

    @Override // L5.o
    public final View.OnClickListener f() {
        return this.f3033g;
    }

    @Override // L5.o
    public final boolean k() {
        return true;
    }

    @Override // L5.o
    public final boolean l() {
        boolean z8;
        EditText editText = this.f3032f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    @Override // L5.o
    public final void m(EditText editText) {
        this.f3032f = editText;
        q();
    }

    @Override // L5.o
    public final void r() {
        EditText editText = this.f3032f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3032f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // L5.o
    public final void s() {
        EditText editText = this.f3032f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
