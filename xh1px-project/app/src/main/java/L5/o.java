package L5;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2990a;

    /* renamed from: b, reason: collision with root package name */
    public final n f2991b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2992c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f2993d;

    public o(n nVar) {
        this.f2990a = nVar.f2970d;
        this.f2991b = nVar;
        this.f2992c = nVar.getContext();
        this.f2993d = nVar.j;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public B1.b h() {
        return null;
    }

    public boolean i(int i4) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof i;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f2991b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(Q.g gVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z8) {
    }
}
