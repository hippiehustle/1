package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public static o1 f13332n;

    /* renamed from: o, reason: collision with root package name */
    public static o1 f13333o;

    /* renamed from: d, reason: collision with root package name */
    public final View f13334d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f13335e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13336f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f13337g;

    /* renamed from: h, reason: collision with root package name */
    public final n1 f13338h;

    /* renamed from: i, reason: collision with root package name */
    public int f13339i;
    public int j;
    public p1 k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13340l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13341m;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.n1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.n1] */
    public o1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i4 = 0;
        this.f13337g = new Runnable(this) { // from class: o.n1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o1 f13323e;

            {
                this.f13323e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f13323e.c(false);
                        return;
                    default:
                        this.f13323e.a();
                        return;
                }
            }
        };
        final int i8 = 1;
        this.f13338h = new Runnable(this) { // from class: o.n1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o1 f13323e;

            {
                this.f13323e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i8) {
                    case 0:
                        this.f13323e.c(false);
                        return;
                    default:
                        this.f13323e.a();
                        return;
                }
            }
        };
        this.f13334d = view;
        this.f13335e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = P.P.f4220a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = I.a.h(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f13336f = scaledTouchSlop;
        this.f13341m = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(o1 o1Var) {
        o1 o1Var2 = f13332n;
        if (o1Var2 != null) {
            o1Var2.f13334d.removeCallbacks(o1Var2.f13337g);
        }
        f13332n = o1Var;
        if (o1Var != null) {
            o1Var.f13334d.postDelayed(o1Var.f13337g, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        o1 o1Var = f13333o;
        View view = this.f13334d;
        if (o1Var == this) {
            f13333o = null;
            p1 p1Var = this.k;
            if (p1Var != null) {
                View view2 = (View) p1Var.f13350f;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) p1Var.f13349e).getSystemService("window")).removeView(view2);
                }
                this.k = null;
                this.f13341m = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f13332n == this) {
            b(null);
        }
        view.removeCallbacks(this.f13338h);
    }

    public final void c(boolean z8) {
        int height;
        int i4;
        int i8;
        int i9;
        boolean z9;
        int i10;
        int i11;
        int i12;
        long longPressTimeout;
        long j;
        long j5;
        View view = this.f13334d;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        o1 o1Var = f13333o;
        if (o1Var != null) {
            o1Var.a();
        }
        f13333o = this;
        this.f13340l = z8;
        p1 p1Var = new p1(view.getContext());
        View view2 = (View) p1Var.f13350f;
        Context context = (Context) p1Var.f13349e;
        this.k = p1Var;
        int i13 = this.f13339i;
        int i14 = this.j;
        boolean z10 = this.f13340l;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) p1Var.f13352h;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context.getSystemService("window")).removeView(view2);
        }
        ((TextView) p1Var.f13351g).setText(this.f13335e);
        int[] iArr = (int[]) p1Var.k;
        int[] iArr2 = (int[]) p1Var.j;
        Rect rect = (Rect) p1Var.f13353i;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i13 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i14 + dimensionPixelOffset2;
            i4 = i14 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z10) {
            i8 = R.dimen.tooltip_y_offset_touch;
        } else {
            i8 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i8);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        int i15 = i13;
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            i11 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context.getResources();
                i11 = 1;
                i9 = i4;
                z9 = z10;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i12 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i12 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i10 = 0;
                rect.set(0, i12, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i9 = i4;
                z9 = z10;
                i10 = 0;
                i11 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i16 = iArr2[i10] - iArr[i10];
            iArr2[i10] = i16;
            iArr2[i11] = iArr2[i11] - iArr[i11];
            layoutParams.x = (i16 + i15) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i17 = iArr2[i11];
            int i18 = ((i17 + i9) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (z9) {
                if (i18 >= 0) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i19;
                }
            } else if (measuredHeight + i19 <= rect.height()) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i18;
            }
        }
        ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f13340l) {
            j5 = 2500;
        } else {
            WeakHashMap weakHashMap = P.O.f4214a;
            if ((view.getWindowSystemUiVisibility() & 1) == i11) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j5 = j - longPressTimeout;
        }
        n1 n1Var = this.f13338h;
        view.removeCallbacks(n1Var);
        view.postDelayed(n1Var, j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.j) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.k == null || !this.f13340l) {
            View view2 = this.f13334d;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f13341m = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.k == null) {
                    int x8 = (int) motionEvent.getX();
                    int y4 = (int) motionEvent.getY();
                    if (!this.f13341m) {
                        int abs = Math.abs(x8 - this.f13339i);
                        int i4 = this.f13336f;
                        if (abs <= i4) {
                        }
                    }
                    this.f13339i = x8;
                    this.j = y4;
                    this.f13341m = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f13339i = view.getWidth() / 2;
        this.j = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
