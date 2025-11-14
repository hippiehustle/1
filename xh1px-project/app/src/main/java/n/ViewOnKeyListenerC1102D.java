package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import o.C1213s0;
import o.E0;
import o.J0;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1102D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: e, reason: collision with root package name */
    public final Context f12558e;

    /* renamed from: f, reason: collision with root package name */
    public final m f12559f;

    /* renamed from: g, reason: collision with root package name */
    public final j f12560g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12561h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12562i;
    public final int j;
    public final J0 k;

    /* renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f12565n;

    /* renamed from: o, reason: collision with root package name */
    public View f12566o;

    /* renamed from: p, reason: collision with root package name */
    public View f12567p;

    /* renamed from: q, reason: collision with root package name */
    public x f12568q;

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f12569r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12570s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12571t;

    /* renamed from: u, reason: collision with root package name */
    public int f12572u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12574w;

    /* renamed from: l, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1107d f12563l = new ViewTreeObserverOnGlobalLayoutListenerC1107d(1, this);

    /* renamed from: m, reason: collision with root package name */
    public final L5.l f12564m = new L5.l(4, this);

    /* renamed from: v, reason: collision with root package name */
    public int f12573v = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [o.J0, o.E0] */
    public ViewOnKeyListenerC1102D(Context context, m mVar, View view, int i4, boolean z8) {
        this.f12558e = context;
        this.f12559f = mVar;
        this.f12561h = z8;
        this.f12560g = new j(mVar, LayoutInflater.from(context), z8, R.layout.abc_popup_menu_item_layout);
        this.j = i4;
        Resources resources = context.getResources();
        this.f12562i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f12566o = view;
        this.k = new E0(context, null, i4, 0);
        mVar.b(this, context);
    }

    @Override // n.y
    public final void a(m mVar, boolean z8) {
        if (mVar == this.f12559f) {
            dismiss();
            x xVar = this.f12568q;
            if (xVar != null) {
                xVar.a(mVar, z8);
            }
        }
    }

    @Override // n.InterfaceC1101C
    public final boolean b() {
        if (!this.f12570s && this.k.f13056C.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // n.InterfaceC1101C
    public final void c() {
        View view;
        boolean z8;
        Rect rect;
        if (b()) {
            return;
        }
        if (!this.f12570s && (view = this.f12566o) != null) {
            this.f12567p = view;
            J0 j0 = this.k;
            j0.f13056C.setOnDismissListener(this);
            j0.f13070s = this;
            j0.f13055B = true;
            j0.f13056C.setFocusable(true);
            View view2 = this.f12567p;
            if (this.f12569r == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f12569r = viewTreeObserver;
            if (z8) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f12563l);
            }
            view2.addOnAttachStateChangeListener(this.f12564m);
            j0.f13069r = view2;
            j0.f13066o = this.f12573v;
            boolean z9 = this.f12571t;
            Context context = this.f12558e;
            j jVar = this.f12560g;
            if (!z9) {
                this.f12572u = u.o(jVar, context, this.f12562i);
                this.f12571t = true;
            }
            j0.q(this.f12572u);
            j0.f13056C.setInputMethodMode(2);
            Rect rect2 = this.f12702d;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            j0.f13054A = rect;
            j0.c();
            C1213s0 c1213s0 = j0.f13059f;
            c1213s0.setOnKeyListener(this);
            if (this.f12574w) {
                m mVar = this.f12559f;
                if (mVar.f12651m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1213s0, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(mVar.f12651m);
                    }
                    frameLayout.setEnabled(false);
                    c1213s0.addHeaderView(frameLayout, null, false);
                }
            }
            j0.o(jVar);
            j0.c();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // n.InterfaceC1101C
    public final void dismiss() {
        if (b()) {
            this.k.dismiss();
        }
    }

    @Override // n.InterfaceC1101C
    public final C1213s0 e() {
        return this.k.f13059f;
    }

    @Override // n.y
    public final void g(boolean z8) {
        this.f12571t = false;
        j jVar = this.f12560g;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // n.y
    public final boolean i(SubMenuC1103E subMenuC1103E) {
        boolean z8;
        if (subMenuC1103E.hasVisibleItems()) {
            w wVar = new w(this.f12558e, subMenuC1103E, this.f12567p, this.f12561h, this.j, 0);
            x xVar = this.f12568q;
            wVar.f12711h = xVar;
            u uVar = wVar.f12712i;
            if (uVar != null) {
                uVar.l(xVar);
            }
            int size = subMenuC1103E.f12646f.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    MenuItem item = subMenuC1103E.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z8 = true;
                        break;
                    }
                    i4++;
                } else {
                    z8 = false;
                    break;
                }
            }
            wVar.f12710g = z8;
            u uVar2 = wVar.f12712i;
            if (uVar2 != null) {
                uVar2.q(z8);
            }
            wVar.j = this.f12565n;
            this.f12565n = null;
            this.f12559f.c(false);
            J0 j0 = this.k;
            int i8 = j0.f13062i;
            int m6 = j0.m();
            if ((Gravity.getAbsoluteGravity(this.f12573v, this.f12566o.getLayoutDirection()) & 7) == 5) {
                i8 += this.f12566o.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f12708e != null) {
                    wVar.d(i8, m6, true, true);
                }
            }
            x xVar2 = this.f12568q;
            if (xVar2 != null) {
                xVar2.h(subMenuC1103E);
            }
            return true;
        }
        return false;
    }

    @Override // n.y
    public final boolean j() {
        return false;
    }

    @Override // n.y
    public final Parcelable k() {
        return null;
    }

    @Override // n.y
    public final void l(x xVar) {
        this.f12568q = xVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f12570s = true;
        this.f12559f.c(true);
        ViewTreeObserver viewTreeObserver = this.f12569r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f12569r = this.f12567p.getViewTreeObserver();
            }
            this.f12569r.removeGlobalOnLayoutListener(this.f12563l);
            this.f12569r = null;
        }
        this.f12567p.removeOnAttachStateChangeListener(this.f12564m);
        PopupWindow.OnDismissListener onDismissListener = this.f12565n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i4 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // n.u
    public final void p(View view) {
        this.f12566o = view;
    }

    @Override // n.u
    public final void q(boolean z8) {
        this.f12560g.f12636f = z8;
    }

    @Override // n.u
    public final void r(int i4) {
        this.f12573v = i4;
    }

    @Override // n.u
    public final void s(int i4) {
        this.k.f13062i = i4;
    }

    @Override // n.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f12565n = onDismissListener;
    }

    @Override // n.u
    public final void u(boolean z8) {
        this.f12574w = z8;
    }

    @Override // n.u
    public final void v(int i4) {
        this.k.h(i4);
    }

    @Override // n.y
    public final void d(Parcelable parcelable) {
    }

    @Override // n.u
    public final void n(m mVar) {
    }
}
