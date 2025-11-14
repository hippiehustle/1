package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.buzbuz.smartautoclicker.R;
import java.util.ArrayList;
import n.InterfaceC1099A;
import n.SubMenuC1103E;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197k implements n.y {

    /* renamed from: B, reason: collision with root package name */
    public int f13270B;

    /* renamed from: d, reason: collision with root package name */
    public final Context f13271d;

    /* renamed from: e, reason: collision with root package name */
    public Context f13272e;

    /* renamed from: f, reason: collision with root package name */
    public n.m f13273f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f13274g;

    /* renamed from: h, reason: collision with root package name */
    public n.x f13275h;
    public InterfaceC1099A k;

    /* renamed from: l, reason: collision with root package name */
    public int f13277l;

    /* renamed from: m, reason: collision with root package name */
    public C1193i f13278m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f13279n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13280o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13281p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13282q;

    /* renamed from: r, reason: collision with root package name */
    public int f13283r;

    /* renamed from: s, reason: collision with root package name */
    public int f13284s;

    /* renamed from: t, reason: collision with root package name */
    public int f13285t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13286u;

    /* renamed from: w, reason: collision with root package name */
    public C1187f f13288w;

    /* renamed from: x, reason: collision with root package name */
    public C1187f f13289x;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC1191h f13290y;

    /* renamed from: z, reason: collision with root package name */
    public C1189g f13291z;

    /* renamed from: i, reason: collision with root package name */
    public final int f13276i = R.layout.abc_action_menu_layout;
    public final int j = R.layout.abc_action_menu_item_layout;

    /* renamed from: v, reason: collision with root package name */
    public final SparseBooleanArray f13287v = new SparseBooleanArray();

    /* renamed from: A, reason: collision with root package name */
    public final W5.a f13269A = new W5.a(20, this);

    public C1197k(Context context) {
        this.f13271d = context;
        this.f13274g = LayoutInflater.from(context);
    }

    @Override // n.y
    public final void a(n.m mVar, boolean z8) {
        c();
        C1187f c1187f = this.f13289x;
        if (c1187f != null && c1187f.b()) {
            c1187f.f12712i.dismiss();
        }
        n.x xVar = this.f13275h;
        if (xVar != null) {
            xVar.a(mVar, z8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [n.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(n.o oVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = oVar.getActionView();
        int i4 = 0;
        if (actionView == null || oVar.e()) {
            if (view instanceof n.z) {
                actionMenuItemView = (n.z) view;
            } else {
                actionMenuItemView = (n.z) this.f13274g.inflate(this.j, viewGroup, false);
            }
            actionMenuItemView.a(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.k);
            if (this.f13291z == null) {
                this.f13291z = new C1189g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f13291z);
            actionView = actionMenuItemView;
        }
        if (oVar.f12668C) {
            i4 = 8;
        }
        actionView.setVisibility(i4);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1201m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        Object obj;
        RunnableC1191h runnableC1191h = this.f13290y;
        if (runnableC1191h != null && (obj = this.k) != null) {
            ((View) obj).removeCallbacks(runnableC1191h);
            this.f13290y = null;
            return true;
        }
        C1187f c1187f = this.f13288w;
        if (c1187f != null) {
            if (c1187f.b()) {
                c1187f.f12712i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // n.y
    public final void d(Parcelable parcelable) {
        int i4;
        MenuItem findItem;
        if ((parcelable instanceof C1195j) && (i4 = ((C1195j) parcelable).f13266d) > 0 && (findItem = this.f13273f.findItem(i4)) != null) {
            i((SubMenuC1103E) findItem.getSubMenu());
        }
    }

    public final boolean e() {
        C1187f c1187f = this.f13288w;
        if (c1187f != null && c1187f.b()) {
            return true;
        }
        return false;
    }

    @Override // n.y
    public final boolean f(n.o oVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.y
    public final void g(boolean z8) {
        int i4;
        n.o oVar;
        ViewGroup viewGroup = (ViewGroup) this.k;
        ArrayList arrayList = null;
        boolean z9 = false;
        if (viewGroup != null) {
            n.m mVar = this.f13273f;
            if (mVar != null) {
                mVar.i();
                ArrayList l6 = this.f13273f.l();
                int size = l6.size();
                i4 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    n.o oVar2 = (n.o) l6.get(i8);
                    if ((oVar2.f12690x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i4);
                        if (childAt instanceof n.z) {
                            oVar = ((n.z) childAt).getItemData();
                        } else {
                            oVar = null;
                        }
                        View b4 = b(oVar2, childAt, viewGroup);
                        if (oVar2 != oVar) {
                            b4.setPressed(false);
                            b4.jumpDrawablesToCurrentState();
                        }
                        if (b4 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b4.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b4);
                            }
                            ((ViewGroup) this.k).addView(b4, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i4) == this.f13278m) {
                    i4++;
                } else {
                    viewGroup.removeViewAt(i4);
                }
            }
        }
        ((View) this.k).requestLayout();
        n.m mVar2 = this.f13273f;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f12649i;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                n.p pVar = ((n.o) arrayList2.get(i9)).f12666A;
            }
        }
        n.m mVar3 = this.f13273f;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.j;
        }
        if (this.f13281p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z9 = !((n.o) arrayList.get(0)).f12668C;
            } else if (size3 > 0) {
                z9 = true;
            }
        }
        if (z9) {
            if (this.f13278m == null) {
                this.f13278m = new C1193i(this, this.f13271d);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f13278m.getParent();
            if (viewGroup3 != this.k) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f13278m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.k;
                C1193i c1193i = this.f13278m;
                actionMenuView.getClass();
                C1201m j = ActionMenuView.j();
                j.f13313a = true;
                actionMenuView.addView(c1193i, j);
            }
        } else {
            C1193i c1193i2 = this.f13278m;
            if (c1193i2 != null) {
                Object parent = c1193i2.getParent();
                Object obj = this.k;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f13278m);
                }
            }
        }
        ((ActionMenuView) this.k).setOverflowReserved(this.f13281p);
    }

    @Override // n.y
    public final int getId() {
        return this.f13277l;
    }

    @Override // n.y
    public final void h(Context context, n.m mVar) {
        this.f13272e = context;
        LayoutInflater.from(context);
        this.f13273f = mVar;
        Resources resources = context.getResources();
        if (!this.f13282q) {
            this.f13281p = true;
        }
        int i4 = 2;
        this.f13283r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i8 <= 600 && ((i8 <= 960 || i9 <= 720) && (i8 <= 720 || i9 <= 960))) {
            if (i8 < 500 && ((i8 <= 640 || i9 <= 480) && (i8 <= 480 || i9 <= 640))) {
                if (i8 >= 360) {
                    i4 = 3;
                }
            } else {
                i4 = 4;
            }
        } else {
            i4 = 5;
        }
        this.f13285t = i4;
        int i10 = this.f13283r;
        if (this.f13281p) {
            if (this.f13278m == null) {
                C1193i c1193i = new C1193i(this, this.f13271d);
                this.f13278m = c1193i;
                if (this.f13280o) {
                    c1193i.setImageDrawable(this.f13279n);
                    this.f13279n = null;
                    this.f13280o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13278m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f13278m.getMeasuredWidth();
        } else {
            this.f13278m = null;
        }
        this.f13284s = i10;
        float f8 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.y
    public final boolean i(SubMenuC1103E subMenuC1103E) {
        boolean z8;
        if (subMenuC1103E.hasVisibleItems()) {
            SubMenuC1103E subMenuC1103E2 = subMenuC1103E;
            while (true) {
                n.m mVar = subMenuC1103E2.f12576z;
                if (mVar == this.f13273f) {
                    break;
                }
                subMenuC1103E2 = (SubMenuC1103E) mVar;
            }
            n.o oVar = subMenuC1103E2.f12575A;
            ViewGroup viewGroup = (ViewGroup) this.k;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i4);
                    if ((childAt instanceof n.z) && ((n.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i4++;
                }
            }
            if (view != null) {
                this.f13270B = subMenuC1103E.f12575A.f12669a;
                int size = subMenuC1103E.f12646f.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size) {
                        MenuItem item = subMenuC1103E.getItem(i8);
                        if (item.isVisible() && item.getIcon() != null) {
                            z8 = true;
                            break;
                        }
                        i8++;
                    } else {
                        z8 = false;
                        break;
                    }
                }
                C1187f c1187f = new C1187f(this, this.f13272e, subMenuC1103E, view);
                this.f13289x = c1187f;
                c1187f.f12710g = z8;
                n.u uVar = c1187f.f12712i;
                if (uVar != null) {
                    uVar.q(z8);
                }
                C1187f c1187f2 = this.f13289x;
                if (!c1187f2.b()) {
                    if (c1187f2.f12708e != null) {
                        c1187f2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                n.x xVar = this.f13275h;
                if (xVar != null) {
                    xVar.h(subMenuC1103E);
                }
                return true;
            }
        }
        return false;
    }

    @Override // n.y
    public final boolean j() {
        int i4;
        ArrayList arrayList;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C1197k c1197k = this;
        n.m mVar = c1197k.f13273f;
        if (mVar != null) {
            arrayList = mVar.l();
            i4 = arrayList.size();
        } else {
            i4 = 0;
            arrayList = null;
        }
        int i9 = c1197k.f13285t;
        int i10 = c1197k.f13284s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1197k.k;
        int i11 = 0;
        boolean z12 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z8 = true;
            if (i11 >= i4) {
                break;
            }
            n.o oVar = (n.o) arrayList.get(i11);
            int i14 = oVar.f12691y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z12 = true;
            }
            if (c1197k.f13286u && oVar.f12668C) {
                i9 = 0;
            }
            i11++;
        }
        if (c1197k.f13281p && (z12 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = c1197k.f13287v;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i4) {
            n.o oVar2 = (n.o) arrayList.get(i16);
            int i18 = oVar2.f12691y;
            if ((i18 & 2) == i8) {
                z9 = z8;
            } else {
                z9 = false;
            }
            int i19 = oVar2.f12670b;
            if (z9) {
                View b4 = c1197k.b(oVar2, null, viewGroup);
                b4.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b4.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z8);
                }
                oVar2.g(z8);
            } else if ((i18 & 1) == z8) {
                boolean z13 = sparseBooleanArray.get(i19);
                if ((i15 > 0 || z13) && i10 > 0) {
                    z10 = z8;
                } else {
                    z10 = false;
                }
                if (z10) {
                    View b9 = c1197k.b(oVar2, null, viewGroup);
                    b9.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b9.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    if (i10 + i17 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 &= z11;
                }
                if (z10 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z13) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        n.o oVar3 = (n.o) arrayList.get(i20);
                        if (oVar3.f12670b == i19) {
                            if ((oVar3.f12690x & 32) == 32) {
                                i15++;
                            }
                            oVar3.g(false);
                        }
                    }
                }
                if (z10) {
                    i15--;
                }
                oVar2.g(z10);
            } else {
                oVar2.g(false);
                i16++;
                i8 = 2;
                c1197k = this;
                z8 = true;
            }
            i16++;
            i8 = 2;
            c1197k = this;
            z8 = true;
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, o.j] */
    @Override // n.y
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f13266d = this.f13270B;
        return obj;
    }

    @Override // n.y
    public final void l(n.x xVar) {
        throw null;
    }

    @Override // n.y
    public final boolean m(n.o oVar) {
        return false;
    }

    public final boolean n() {
        n.m mVar;
        if (this.f13281p && !e() && (mVar = this.f13273f) != null && this.k != null && this.f13290y == null) {
            mVar.i();
            if (!mVar.j.isEmpty()) {
                RunnableC1191h runnableC1191h = new RunnableC1191h(this, new C1187f(this, this.f13272e, this.f13273f, this.f13278m));
                this.f13290y = runnableC1191h;
                ((View) this.k).post(runnableC1191h);
                return true;
            }
            return false;
        }
        return false;
    }
}
