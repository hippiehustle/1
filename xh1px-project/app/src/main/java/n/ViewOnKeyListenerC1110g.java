package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import g0.L;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import o.C1173A;
import o.C1213s0;
import o.E0;
import o.G0;
import o.H0;
import o.J0;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1110g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public ViewTreeObserver f12603A;

    /* renamed from: B, reason: collision with root package name */
    public PopupWindow.OnDismissListener f12604B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f12605C;

    /* renamed from: e, reason: collision with root package name */
    public final Context f12606e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12607f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12608g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12609h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f12610i;

    /* renamed from: q, reason: collision with root package name */
    public View f12616q;

    /* renamed from: r, reason: collision with root package name */
    public View f12617r;

    /* renamed from: s, reason: collision with root package name */
    public int f12618s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12619t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12620u;

    /* renamed from: v, reason: collision with root package name */
    public int f12621v;

    /* renamed from: w, reason: collision with root package name */
    public int f12622w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12624y;

    /* renamed from: z, reason: collision with root package name */
    public x f12625z;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1107d f12611l = new ViewTreeObserverOnGlobalLayoutListenerC1107d(0, this);

    /* renamed from: m, reason: collision with root package name */
    public final L5.l f12612m = new L5.l(3, this);

    /* renamed from: n, reason: collision with root package name */
    public final L f12613n = new L(6, this);

    /* renamed from: o, reason: collision with root package name */
    public int f12614o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f12615p = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12623x = false;

    public ViewOnKeyListenerC1110g(Context context, View view, int i4, boolean z8) {
        this.f12606e = context;
        this.f12616q = view;
        this.f12608g = i4;
        this.f12609h = z8;
        this.f12618s = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f12607f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f12610i = new Handler();
    }

    @Override // n.y
    public final void a(m mVar, boolean z8) {
        int i4;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (mVar == ((C1109f) arrayList.get(i8)).f12601b) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 >= 0) {
            int i9 = i8 + 1;
            if (i9 < arrayList.size()) {
                ((C1109f) arrayList.get(i9)).f12601b.c(false);
            }
            C1109f c1109f = (C1109f) arrayList.remove(i8);
            m mVar2 = c1109f.f12601b;
            J0 j0 = c1109f.f12600a;
            mVar2.r(this);
            if (this.f12605C) {
                G0.b(j0.f13056C, null);
                j0.f13056C.setAnimationStyle(0);
            }
            j0.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f12618s = ((C1109f) arrayList.get(size2 - 1)).f12602c;
            } else {
                if (this.f12616q.getLayoutDirection() == 1) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                this.f12618s = i4;
            }
            if (size2 == 0) {
                dismiss();
                x xVar = this.f12625z;
                if (xVar != null) {
                    xVar.a(mVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f12603A;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f12603A.removeGlobalOnLayoutListener(this.f12611l);
                    }
                    this.f12603A = null;
                }
                this.f12617r.removeOnAttachStateChangeListener(this.f12612m);
                this.f12604B.onDismiss();
                return;
            }
            if (z8) {
                ((C1109f) arrayList.get(0)).f12601b.c(false);
            }
        }
    }

    @Override // n.InterfaceC1101C
    public final boolean b() {
        ArrayList arrayList = this.k;
        if (arrayList.size() <= 0 || !((C1109f) arrayList.get(0)).f12600a.f13056C.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // n.InterfaceC1101C
    public final void c() {
        boolean z8;
        if (!b()) {
            ArrayList arrayList = this.j;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w((m) it.next());
            }
            arrayList.clear();
            View view = this.f12616q;
            this.f12617r = view;
            if (view != null) {
                if (this.f12603A == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f12603A = viewTreeObserver;
                if (z8) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f12611l);
                }
                this.f12617r.addOnAttachStateChangeListener(this.f12612m);
            }
        }
    }

    @Override // n.InterfaceC1101C
    public final void dismiss() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        if (size > 0) {
            C1109f[] c1109fArr = (C1109f[]) arrayList.toArray(new C1109f[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                C1109f c1109f = c1109fArr[i4];
                if (c1109f.f12600a.f13056C.isShowing()) {
                    c1109f.f12600a.dismiss();
                }
            }
        }
    }

    @Override // n.InterfaceC1101C
    public final C1213s0 e() {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1109f) arrayList.get(arrayList.size() - 1)).f12600a.f13059f;
    }

    @Override // n.y
    public final void g(boolean z8) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1109f) it.next()).f12600a.f13059f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // n.y
    public final boolean i(SubMenuC1103E subMenuC1103E) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            C1109f c1109f = (C1109f) it.next();
            if (subMenuC1103E == c1109f.f12601b) {
                c1109f.f12600a.f13059f.requestFocus();
                return true;
            }
        }
        if (subMenuC1103E.hasVisibleItems()) {
            n(subMenuC1103E);
            x xVar = this.f12625z;
            if (xVar != null) {
                xVar.h(subMenuC1103E);
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
        this.f12625z = xVar;
    }

    @Override // n.u
    public final void n(m mVar) {
        mVar.b(this, this.f12606e);
        if (b()) {
            w(mVar);
        } else {
            this.j.add(mVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1109f c1109f;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                c1109f = (C1109f) arrayList.get(i4);
                if (!c1109f.f12600a.f13056C.isShowing()) {
                    break;
                } else {
                    i4++;
                }
            } else {
                c1109f = null;
                break;
            }
        }
        if (c1109f != null) {
            c1109f.f12601b.c(false);
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
        if (this.f12616q != view) {
            this.f12616q = view;
            this.f12615p = Gravity.getAbsoluteGravity(this.f12614o, view.getLayoutDirection());
        }
    }

    @Override // n.u
    public final void q(boolean z8) {
        this.f12623x = z8;
    }

    @Override // n.u
    public final void r(int i4) {
        if (this.f12614o != i4) {
            this.f12614o = i4;
            this.f12615p = Gravity.getAbsoluteGravity(i4, this.f12616q.getLayoutDirection());
        }
    }

    @Override // n.u
    public final void s(int i4) {
        this.f12619t = true;
        this.f12621v = i4;
    }

    @Override // n.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f12604B = onDismissListener;
    }

    @Override // n.u
    public final void u(boolean z8) {
        this.f12624y = z8;
    }

    @Override // n.u
    public final void v(int i4) {
        this.f12620u = true;
        this.f12622w = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0161, code lost:
    
        if (((r9.getWidth() + r11[0]) + r5) > r10.right) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0163, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        if ((r11[0] - r5) < 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.J0, o.E0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(m mVar) {
        boolean z8;
        int i4;
        C1109f c1109f;
        View view;
        Rect rect;
        int i8;
        boolean z9;
        int i9;
        int i10;
        int width;
        MenuItem menuItem;
        j jVar;
        int i11;
        int firstVisiblePosition;
        Context context = this.f12606e;
        LayoutInflater from = LayoutInflater.from(context);
        j jVar2 = new j(mVar, from, this.f12609h, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f12623x) {
            jVar2.f12636f = true;
        } else if (b()) {
            int size = mVar.f12646f.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    MenuItem item = mVar.getItem(i12);
                    if (item.isVisible() && item.getIcon() != null) {
                        z8 = true;
                        break;
                    }
                    i12++;
                } else {
                    z8 = false;
                    break;
                }
            }
            jVar2.f12636f = z8;
        }
        int o7 = u.o(jVar2, context, this.f12607f);
        ?? e02 = new E0(context, null, this.f12608g, 0);
        e02.f13095F = this.f12613n;
        e02.f13070s = this;
        e02.f13056C.setOnDismissListener(this);
        e02.f13069r = this.f12616q;
        e02.f13066o = this.f12615p;
        e02.f13055B = true;
        e02.f13056C.setFocusable(true);
        e02.f13056C.setInputMethodMode(2);
        e02.o(jVar2);
        e02.q(o7);
        e02.f13066o = this.f12615p;
        ArrayList arrayList = this.k;
        if (arrayList.size() > 0) {
            c1109f = (C1109f) arrayList.get(arrayList.size() - 1);
            m mVar2 = c1109f.f12601b;
            int size2 = mVar2.f12646f.size();
            int i13 = 0;
            while (true) {
                if (i13 < size2) {
                    menuItem = mVar2.getItem(i13);
                    if (menuItem.hasSubMenu() && mVar == menuItem.getSubMenu()) {
                        break;
                    } else {
                        i13++;
                    }
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem == null) {
                i4 = 1;
                view = null;
            } else {
                C1213s0 c1213s0 = c1109f.f12600a.f13059f;
                ListAdapter adapter = c1213s0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    i11 = 0;
                }
                int count = jVar.getCount();
                i4 = 1;
                int i14 = 0;
                while (true) {
                    if (i14 < count) {
                        if (menuItem == jVar.getItem(i14)) {
                            break;
                        } else {
                            i14++;
                        }
                    } else {
                        i14 = -1;
                        break;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + i11) - c1213s0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1213s0.getChildCount()) {
                    view = c1213s0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i15 = Build.VERSION.SDK_INT;
                C1173A c1173a = e02.f13056C;
                if (i15 <= 28) {
                    Method method = J0.f13094G;
                    if (method != null) {
                        try {
                            method.invoke(c1173a, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    H0.a(c1173a, false);
                }
                G0.a(e02.f13056C, null);
                C1213s0 c1213s02 = ((C1109f) arrayList.get(arrayList.size() - 1)).f12600a.f13059f;
                int[] iArr = new int[2];
                c1213s02.getLocationOnScreen(iArr);
                Rect rect2 = new Rect();
                this.f12617r.getWindowVisibleDisplayFrame(rect2);
                if (this.f12618s == i4) {
                }
                if (i8 == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f12618s = i8;
                if (Build.VERSION.SDK_INT >= 26) {
                    e02.f13069r = view;
                    i10 = 0;
                    i9 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f12616q.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f12615p & 7) == 5) {
                        iArr2[0] = this.f12616q.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i9 = iArr3[0] - iArr2[0];
                    i10 = iArr3[1] - iArr2[1];
                }
                if ((this.f12615p & 5) == 5) {
                    if (z9) {
                        width = i9 + o7;
                        e02.f13062i = width;
                        e02.f13065n = true;
                        e02.f13064m = true;
                        e02.h(i10);
                    } else {
                        o7 = view.getWidth();
                        width = i9 - o7;
                        e02.f13062i = width;
                        e02.f13065n = true;
                        e02.f13064m = true;
                        e02.h(i10);
                    }
                } else {
                    if (z9) {
                        width = i9 + view.getWidth();
                        e02.f13062i = width;
                        e02.f13065n = true;
                        e02.f13064m = true;
                        e02.h(i10);
                    }
                    width = i9 - o7;
                    e02.f13062i = width;
                    e02.f13065n = true;
                    e02.f13064m = true;
                    e02.h(i10);
                }
            } else {
                if (this.f12619t) {
                    e02.f13062i = this.f12621v;
                }
                if (this.f12620u) {
                    e02.h(this.f12622w);
                }
                Rect rect3 = this.f12702d;
                if (rect3 != null) {
                    rect = new Rect(rect3);
                } else {
                    rect = null;
                }
                e02.f13054A = rect;
            }
            arrayList.add(new C1109f(e02, mVar, this.f12618s));
            e02.c();
            C1213s0 c1213s03 = e02.f13059f;
            c1213s03.setOnKeyListener(this);
            if (c1109f != null && this.f12624y && mVar.f12651m != null) {
                FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1213s03, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(mVar.f12651m);
                c1213s03.addHeaderView(frameLayout, null, false);
                e02.c();
                return;
            }
            return;
        }
        i4 = 1;
        c1109f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C1109f(e02, mVar, this.f12618s));
        e02.c();
        C1213s0 c1213s032 = e02.f13059f;
        c1213s032.setOnKeyListener(this);
        if (c1109f != null) {
        }
    }

    @Override // n.y
    public final void d(Parcelable parcelable) {
    }
}
