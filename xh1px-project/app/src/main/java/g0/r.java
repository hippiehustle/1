package g0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.buzbuz.smartautoclicker.R;
import q.C1341c;
import q.C1344f;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public class r extends AbstractComponentCallbacksC0755y implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: c0, reason: collision with root package name */
    public Handler f11052c0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f11060l0;

    /* renamed from: n0, reason: collision with root package name */
    public Dialog f11062n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f11063o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f11064p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f11065q0;

    /* renamed from: d0, reason: collision with root package name */
    public final L5.x f11053d0 = new L5.x(4, this);

    /* renamed from: e0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0745n f11054e0 = new DialogInterfaceOnCancelListenerC0745n(this);

    /* renamed from: f0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0746o f11055f0 = new DialogInterfaceOnDismissListenerC0746o(this);

    /* renamed from: g0, reason: collision with root package name */
    public int f11056g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public int f11057h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f11058i0 = true;
    public boolean j0 = true;

    /* renamed from: k0, reason: collision with root package name */
    public int f11059k0 = -1;

    /* renamed from: m0, reason: collision with root package name */
    public final C0747p f11061m0 = new C0747p(this);

    /* renamed from: r0, reason: collision with root package name */
    public boolean f11066r0 = false;

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void A() {
        this.f11093I = true;
        if (!this.f11065q0 && !this.f11064p0) {
            this.f11064p0 = true;
        }
        androidx.lifecycle.C c6 = this.f11105V;
        c6.getClass();
        androidx.lifecycle.C.a("removeObserver");
        androidx.lifecycle.B b4 = (androidx.lifecycle.B) c6.f8768b.h(this.f11061m0);
        if (b4 == null) {
            return;
        }
        b4.c();
        b4.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x0018, B:12:0x0024, B:18:0x003c, B:20:0x0044, B:21:0x004e, B:23:0x002e, B:25:0x0034, B:26:0x0039, B:27:0x0066), top: B:9:0x0018 }] */
    @Override // g0.AbstractComponentCallbacksC0755y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LayoutInflater B(Bundle bundle) {
        Context j;
        LayoutInflater B8 = super.B(bundle);
        boolean z8 = this.j0;
        if (z8 && !this.f11060l0) {
            if (z8 && !this.f11066r0) {
                try {
                    this.f11060l0 = true;
                    Dialog T5 = T();
                    this.f11062n0 = T5;
                    if (this.j0) {
                        int i4 = this.f11056g0;
                        if (i4 != 1 && i4 != 2) {
                            if (i4 == 3) {
                                Window window = T5.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                j = j();
                                if (j instanceof Activity) {
                                    this.f11062n0.setOwnerActivity((Activity) j);
                                }
                                this.f11062n0.setCancelable(this.f11058i0);
                                this.f11062n0.setOnCancelListener(this.f11054e0);
                                this.f11062n0.setOnDismissListener(this.f11055f0);
                                this.f11066r0 = true;
                            }
                        }
                        T5.requestWindowFeature(1);
                        j = j();
                        if (j instanceof Activity) {
                        }
                        this.f11062n0.setCancelable(this.f11058i0);
                        this.f11062n0.setOnCancelListener(this.f11054e0);
                        this.f11062n0.setOnDismissListener(this.f11055f0);
                        this.f11066r0 = true;
                    } else {
                        this.f11062n0 = null;
                    }
                    this.f11060l0 = false;
                } catch (Throwable th) {
                    this.f11060l0 = false;
                    throw th;
                }
            }
            if (T.K(2)) {
                toString();
            }
            Dialog dialog = this.f11062n0;
            if (dialog != null) {
                return B8.cloneInContext(dialog.getContext());
            }
        } else if (T.K(2)) {
            toString();
        }
        return B8;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public void E(Bundle bundle) {
        Dialog dialog = this.f11062n0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i4 = this.f11056g0;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i8 = this.f11057h0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z8 = this.f11058i0;
        if (!z8) {
            bundle.putBoolean("android:cancelable", z8);
        }
        boolean z9 = this.j0;
        if (!z9) {
            bundle.putBoolean("android:showsDialog", z9);
        }
        int i9 = this.f11059k0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public void F() {
        this.f11093I = true;
        Dialog dialog = this.f11062n0;
        if (dialog != null) {
            this.f11063o0 = false;
            dialog.show();
            View decorView = this.f11062n0.getWindow().getDecorView();
            o6.j.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public void G() {
        this.f11093I = true;
        Dialog dialog = this.f11062n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void I(Bundle bundle) {
        Bundle bundle2;
        this.f11093I = true;
        if (this.f11062n0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f11062n0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.K == null && this.f11062n0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f11062n0.onRestoreInstanceState(bundle2);
        }
    }

    public final void S(boolean z8, boolean z9) {
        if (this.f11064p0) {
            return;
        }
        this.f11064p0 = true;
        this.f11065q0 = false;
        Dialog dialog = this.f11062n0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f11062n0.dismiss();
            if (!z9) {
                if (Looper.myLooper() == this.f11052c0.getLooper()) {
                    onDismiss(this.f11062n0);
                } else {
                    this.f11052c0.post(this.f11053d0);
                }
            }
        }
        this.f11063o0 = true;
        if (this.f11059k0 >= 0) {
            T m6 = m();
            int i4 = this.f11059k0;
            if (i4 >= 0) {
                m6.y(new P(m6, null, i4), z8);
                this.f11059k0 = -1;
                return;
            }
            throw new IllegalArgumentException(A.j.l("Bad id: ", i4));
        }
        C0732a c0732a = new C0732a(m());
        c0732a.f10964p = true;
        T t8 = this.f11128x;
        if (t8 != null && t8 != c0732a.f10966r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0732a.b(new c0(3, this));
        if (z8) {
            c0732a.f(true, true);
        } else {
            c0732a.e();
        }
    }

    public Dialog T() {
        if (T.K(3)) {
            toString();
        }
        return new c.m(O(), this.f11057h0);
    }

    public final Dialog U() {
        Dialog dialog = this.f11062n0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void V(T t8, String str) {
        this.f11064p0 = false;
        this.f11065q0 = true;
        t8.getClass();
        C0732a c0732a = new C0732a(t8);
        c0732a.f10964p = true;
        c0732a.g(0, this, str, 1);
        c0732a.e();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final AbstractC1638C c() {
        return new C0748q(this, new C0751u(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f11063o0) {
            if (T.K(3)) {
                toString();
            }
            S(true, true);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void t() {
        this.f11093I = true;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public void v(Context context) {
        Object obj;
        super.v(context);
        androidx.lifecycle.C c6 = this.f11105V;
        c6.getClass();
        androidx.lifecycle.C.a("observeForever");
        C0747p c0747p = this.f11061m0;
        androidx.lifecycle.B b4 = new androidx.lifecycle.B(c6, c0747p);
        C1344f c1344f = c6.f8768b;
        C1341c g8 = c1344f.g(c0747p);
        if (g8 != null) {
            obj = g8.f13860e;
        } else {
            C1341c c1341c = new C1341c(c0747p, b4);
            c1344f.f13869g++;
            C1341c c1341c2 = c1344f.f13867e;
            if (c1341c2 == null) {
                c1344f.f13866d = c1341c;
                c1344f.f13867e = c1341c;
            } else {
                c1341c2.f13861f = c1341c;
                c1341c.f13862g = c1341c2;
                c1344f.f13867e = c1341c;
            }
            obj = null;
        }
        androidx.lifecycle.B b9 = (androidx.lifecycle.B) obj;
        if (!(b9 instanceof androidx.lifecycle.A)) {
            if (b9 == null) {
                b4.b(true);
            }
            if (!this.f11065q0) {
                this.f11064p0 = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public void w(Bundle bundle) {
        boolean z8;
        super.w(bundle);
        this.f11052c0 = new Handler();
        if (this.f11087C == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.j0 = z8;
        if (bundle != null) {
            this.f11056g0 = bundle.getInt("android:style", 0);
            this.f11057h0 = bundle.getInt("android:theme", 0);
            this.f11058i0 = bundle.getBoolean("android:cancelable", true);
            this.j0 = bundle.getBoolean("android:showsDialog", this.j0);
            this.f11059k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void z() {
        this.f11093I = true;
        Dialog dialog = this.f11062n0;
        if (dialog != null) {
            this.f11063o0 = true;
            dialog.setOnDismissListener(null);
            this.f11062n0.dismiss();
            if (!this.f11064p0) {
                onDismiss(this.f11062n0);
            }
            this.f11062n0 = null;
            this.f11066r0 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
