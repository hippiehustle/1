package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.InterfaceC0510v;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public class m extends Dialog implements InterfaceC0510v, B0.f {

    /* renamed from: d, reason: collision with root package name */
    public C0512x f9350d;

    /* renamed from: e, reason: collision with root package name */
    public final A.i f9351e;

    /* renamed from: f, reason: collision with root package name */
    public final C0544A f9352f;

    public m(Context context, int i4) {
        super(context, i4);
        this.f9351e = new A.i(new C0.b(this, new B0.e(0, this)));
        this.f9352f = new C0544A(new E.a(10, this));
    }

    public static void a(m mVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o6.j.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    @Override // B0.f
    public final A.i b() {
        return (A.i) this.f9351e.f89f;
    }

    public final void c() {
        Window window = getWindow();
        o6.j.b(window);
        View decorView = window.getDecorView();
        o6.j.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        o6.j.b(window2);
        View decorView2 = window2.getDecorView();
        o6.j.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        o6.j.b(window3);
        View decorView3 = window3.getDecorView();
        o6.j.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        C0512x c0512x = this.f9350d;
        if (c0512x == null) {
            C0512x c0512x2 = new C0512x(this);
            this.f9350d = c0512x2;
            return c0512x2;
        }
        return c0512x;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f9352f.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            o6.j.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0544A c0544a = this.f9352f;
            c0544a.getClass();
            c0544a.f9300e = onBackInvokedDispatcher;
            c0544a.b(c0544a.f9302g);
        }
        this.f9351e.i(bundle);
        C0512x c0512x = this.f9350d;
        if (c0512x == null) {
            c0512x = new C0512x(this);
            this.f9350d = c0512x;
        }
        c0512x.d(EnumC0503n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        o6.j.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f9351e.j(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C0512x c0512x = this.f9350d;
        if (c0512x == null) {
            c0512x = new C0512x(this);
            this.f9350d = c0512x;
        }
        c0512x.d(EnumC0503n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0512x c0512x = this.f9350d;
        if (c0512x == null) {
            c0512x = new C0512x(this);
            this.f9350d = c0512x;
        }
        c0512x.d(EnumC0503n.ON_DESTROY);
        this.f9350d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        c();
        super.setContentView(i4);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        o6.j.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o6.j.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
