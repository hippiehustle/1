package z1;

import A1.i;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.PrintWriter;
import l5.DialogC1035e;
import o6.j;
import s3.AbstractC1492c;
import w1.e;

/* loaded from: classes.dex */
public abstract class b extends e {

    /* renamed from: p, reason: collision with root package name */
    public InputMethodManager f16616p;

    /* renamed from: q, reason: collision with root package name */
    public final C1.b f16617q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16618r;

    /* renamed from: s, reason: collision with root package name */
    public DialogC1035e f16619s;

    /* renamed from: t, reason: collision with root package name */
    public CoordinatorLayout f16620t;

    public b(Integer num) {
        super(num, true);
        this.f16617q = new C1.b(10, this);
    }

    public final void D() {
        DialogC1035e dialogC1035e = this.f16619s;
        if (dialogC1035e != null) {
            InputMethodManager inputMethodManager = this.f16616p;
            if (inputMethodManager != null) {
                Window window = dialogC1035e.getWindow();
                j.b(window);
                inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                return;
            }
            j.i("inputMethodManager");
            throw null;
        }
    }

    public abstract ViewGroup E();

    public abstract void F(DialogC1035e dialogC1035e);

    @Override // w1.e
    public final void j(PrintWriter printWriter, CharSequence charSequence) {
        j.e(charSequence, "prefix");
        super.j(printWriter, charSequence);
        printWriter.append((CharSequence) AbstractC1492c.b(charSequence)).append((CharSequence) ("isDialogShown=" + this.f16618r + "; ")).println();
    }

    @Override // w1.e
    public final void p() {
        Object systemService = k().getSystemService((Class<Object>) InputMethodManager.class);
        j.d(systemService, "getSystemService(...)");
        this.f16616p = (InputMethodManager) systemService;
        DialogC1035e dialogC1035e = new DialogC1035e(k());
        ViewGroup E7 = E();
        dialogC1035e.setContentView(E7);
        dialogC1035e.setCancelable(false);
        dialogC1035e.setOnKeyListener(new i(2, this));
        dialogC1035e.create();
        Window window = dialogC1035e.getWindow();
        if (window != null) {
            window.setType(2032);
            window.setSoftInputMode(3);
            window.getDecorView().setOnTouchListener(new E1.b(3, this.f16617q));
        }
        ViewParent parent = E7.getParent().getParent();
        j.c(parent, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        this.f16620t = (CoordinatorLayout) parent;
        if (dialogC1035e.f12304i == null) {
            dialogC1035e.f();
        }
        BottomSheetBehavior bottomSheetBehavior = dialogC1035e.f12304i;
        bottomSheetBehavior.I(3);
        bottomSheetBehavior.K = false;
        this.f16619s = dialogC1035e;
        F(dialogC1035e);
    }

    @Override // w1.e
    public void q() {
        DialogC1035e dialogC1035e = this.f16619s;
        if (dialogC1035e != null) {
            dialogC1035e.dismiss();
        }
        this.f16619s = null;
    }

    @Override // w1.e
    public void t() {
        D();
    }

    @Override // w1.e
    public void v() {
        if (!this.f16618r) {
            this.f16618r = true;
            DialogC1035e dialogC1035e = this.f16619s;
            if (dialogC1035e != null) {
                dialogC1035e.show();
            }
        }
    }

    @Override // w1.e
    public void w() {
        if (!this.f16618r) {
            return;
        }
        D();
        DialogC1035e dialogC1035e = this.f16619s;
        if (dialogC1035e != null) {
            dialogC1035e.hide();
        }
        this.f16618r = false;
    }
}
