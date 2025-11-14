package i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;
import java.lang.ref.WeakReference;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868g {

    /* renamed from: A, reason: collision with root package name */
    public final int f11678A;

    /* renamed from: B, reason: collision with root package name */
    public final int f11679B;

    /* renamed from: C, reason: collision with root package name */
    public final int f11680C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f11681D;

    /* renamed from: E, reason: collision with root package name */
    public final HandlerC0866e f11682E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11684a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0869h f11685b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f11686c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f11687d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f11688e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f11689f;

    /* renamed from: g, reason: collision with root package name */
    public View f11690g;

    /* renamed from: i, reason: collision with root package name */
    public Button f11692i;
    public CharSequence j;
    public Message k;

    /* renamed from: l, reason: collision with root package name */
    public Button f11693l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f11694m;

    /* renamed from: n, reason: collision with root package name */
    public Message f11695n;

    /* renamed from: o, reason: collision with root package name */
    public Button f11696o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f11697p;

    /* renamed from: q, reason: collision with root package name */
    public Message f11698q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f11699r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f11700s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f11701t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f11702u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f11703v;

    /* renamed from: w, reason: collision with root package name */
    public View f11704w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f11705x;

    /* renamed from: z, reason: collision with root package name */
    public final int f11707z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11691h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f11706y = -1;

    /* renamed from: F, reason: collision with root package name */
    public final A5.h f11683F = new A5.h(2, this);

    /* JADX WARN: Type inference failed for: r6v1, types: [i.e, android.os.Handler] */
    public C0868g(Context context, DialogInterfaceC0869h dialogInterfaceC0869h, Window window) {
        this.f11684a = context;
        this.f11685b = dialogInterfaceC0869h;
        this.f11686c = window;
        ?? handler = new Handler();
        handler.f11677a = new WeakReference(dialogInterfaceC0869h);
        this.f11682E = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0805a.f11279e, R.attr.alertDialogStyle, 0);
        this.f11707z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f11678A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f11679B = obtainStyledAttributes.getResourceId(7, 0);
        this.f11680C = obtainStyledAttributes.getResourceId(3, 0);
        this.f11681D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0869h.d().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.f11682E.obtainMessage(i4, onClickListener);
        } else {
            message = null;
        }
        if (i4 != -3) {
            if (i4 != -2) {
                if (i4 == -1) {
                    this.j = charSequence;
                    this.k = message;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f11694m = charSequence;
            this.f11695n = message;
            return;
        }
        this.f11697p = charSequence;
        this.f11698q = message;
    }
}
