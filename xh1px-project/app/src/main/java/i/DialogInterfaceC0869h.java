package i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.buzbuz.smartautoclicker.R;
import java.util.WeakHashMap;
import o.C1221w0;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0869h extends E implements DialogInterface {

    /* renamed from: i, reason: collision with root package name */
    public final C0868g f11708i;

    public DialogInterfaceC0869h(ContextThemeWrapper contextThemeWrapper, int i4) {
        super(contextThemeWrapper, h(contextThemeWrapper, i4));
        this.f11708i = new C0868g(getContext(), this, getWindow());
    }

    public static int h(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i4) {
        C0868g c0868g = this.f11708i;
        if (i4 != -3) {
            if (i4 != -2) {
                if (i4 != -1) {
                    c0868g.getClass();
                    return null;
                }
                return c0868g.f11692i;
            }
            return c0868g.f11693l;
        }
        return c0868g.f11696o;
    }

    @Override // i.E, c.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z8;
        int i4;
        boolean z9;
        int i8;
        boolean z10;
        ListAdapter listAdapter;
        int i9;
        int i10;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        C0868g c0868g = this.f11708i;
        c0868g.f11685b.setContentView(c0868g.f11707z);
        Context context = c0868g.f11684a;
        Window window = c0868g.f11686c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view = c0868g.f11690g;
        if (view == null) {
            view = null;
        }
        int i11 = 0;
        if (view != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8 || !C0868g.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z8) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c0868g.f11691h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c0868g.f11689f != null) {
                ((LinearLayout.LayoutParams) ((C1221w0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b4 = C0868g.b(findViewById7, findViewById4);
        ViewGroup b9 = C0868g.b(findViewById8, findViewById5);
        ViewGroup b10 = C0868g.b(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0868g.f11699r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0868g.f11699r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b9.findViewById(android.R.id.message);
        c0868g.f11703v = textView;
        if (textView != null) {
            CharSequence charSequence = c0868g.f11688e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0868g.f11699r.removeView(c0868g.f11703v);
                if (c0868g.f11689f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0868g.f11699r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c0868g.f11699r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c0868g.f11689f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b9.setVisibility(8);
                }
            }
        }
        Button button = (Button) b10.findViewById(android.R.id.button1);
        c0868g.f11692i = button;
        A5.h hVar = c0868g.f11683F;
        button.setOnClickListener(hVar);
        if (TextUtils.isEmpty(c0868g.j)) {
            c0868g.f11692i.setVisibility(8);
            i4 = 0;
        } else {
            c0868g.f11692i.setText(c0868g.j);
            c0868g.f11692i.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) b10.findViewById(android.R.id.button2);
        c0868g.f11693l = button2;
        button2.setOnClickListener(hVar);
        if (TextUtils.isEmpty(c0868g.f11694m)) {
            c0868g.f11693l.setVisibility(8);
        } else {
            c0868g.f11693l.setText(c0868g.f11694m);
            c0868g.f11693l.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) b10.findViewById(android.R.id.button3);
        c0868g.f11696o = button3;
        button3.setOnClickListener(hVar);
        if (TextUtils.isEmpty(c0868g.f11697p)) {
            c0868g.f11696o.setVisibility(8);
        } else {
            c0868g.f11696o.setText(c0868g.f11697p);
            c0868g.f11696o.setVisibility(0);
            i4 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i4 == 1) {
                Button button4 = c0868g.f11692i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i4 == 2) {
                Button button5 = c0868g.f11693l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i4 == 4) {
                Button button6 = c0868g.f11696o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i4 == 0) {
            b10.setVisibility(8);
        }
        if (c0868g.f11704w != null) {
            b4.addView(c0868g.f11704w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0868g.f11701t = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(c0868g.f11687d) && c0868g.f11681D) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0868g.f11702u = textView2;
                textView2.setText(c0868g.f11687d);
                Drawable drawable = c0868g.f11700s;
                if (drawable != null) {
                    c0868g.f11701t.setImageDrawable(drawable);
                } else {
                    c0868g.f11702u.setPadding(c0868g.f11701t.getPaddingLeft(), c0868g.f11701t.getPaddingTop(), c0868g.f11701t.getPaddingRight(), c0868g.f11701t.getPaddingBottom());
                    c0868g.f11701t.setVisibility(8);
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0868g.f11701t.setVisibility(8);
                b4.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (b4 != null && b4.getVisibility() != 8) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (b10.getVisibility() != 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (findViewById2 = b9.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i8 != 0) {
            NestedScrollView nestedScrollView2 = c0868g.f11699r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (c0868g.f11688e == null && c0868g.f11689f == null) {
                findViewById = null;
            } else {
                findViewById = b4.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = b9.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0868g.f11689f;
        if (alertController$RecycleListView != null && (!z10 || i8 == 0)) {
            int paddingLeft = alertController$RecycleListView.getPaddingLeft();
            if (i8 != 0) {
                i9 = alertController$RecycleListView.getPaddingTop();
            } else {
                i9 = alertController$RecycleListView.f8307d;
            }
            int paddingRight = alertController$RecycleListView.getPaddingRight();
            if (z10) {
                i10 = alertController$RecycleListView.getPaddingBottom();
            } else {
                i10 = alertController$RecycleListView.f8308e;
            }
            alertController$RecycleListView.setPadding(paddingLeft, i9, paddingRight, i10);
        }
        if (!z9) {
            View view2 = c0868g.f11689f;
            if (view2 == null) {
                view2 = c0868g.f11699r;
            }
            if (view2 != null) {
                if (z10) {
                    i11 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = P.O.f4214a;
                P.G.b(view2, i8 | i11, 3);
                if (findViewById11 != null) {
                    b9.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b9.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0868g.f11689f;
        if (alertController$RecycleListView2 != null && (listAdapter = c0868g.f11705x) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i12 = c0868g.f11706y;
            if (i12 > -1) {
                alertController$RecycleListView2.setItemChecked(i12, true);
                alertController$RecycleListView2.setSelection(i12);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11708i.f11699r;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11708i.f11699r;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // i.E, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0868g c0868g = this.f11708i;
        c0868g.f11687d = charSequence;
        TextView textView = c0868g.f11702u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
