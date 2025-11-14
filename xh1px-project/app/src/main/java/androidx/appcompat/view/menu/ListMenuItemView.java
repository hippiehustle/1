package androidx.appcompat.view.menu;

import R.g;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;
import n.m;
import n.o;
import n.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d, reason: collision with root package name */
    public o f8321d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f8322e;

    /* renamed from: f, reason: collision with root package name */
    public RadioButton f8323f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f8324g;

    /* renamed from: h, reason: collision with root package name */
    public CheckBox f8325h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f8326i;
    public ImageView j;
    public ImageView k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f8327l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f8328m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8329n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f8330o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8331p;

    /* renamed from: q, reason: collision with root package name */
    public final Drawable f8332q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8333r;

    /* renamed from: s, reason: collision with root package name */
    public LayoutInflater f8334s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8335t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g J6 = g.J(getContext(), attributeSet, AbstractC0805a.f11290r, R.attr.listMenuViewStyle);
        this.f8328m = J6.A(5);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        this.f8329n = typedArray.getResourceId(1, -1);
        this.f8331p = typedArray.getBoolean(7, false);
        this.f8330o = context;
        this.f8332q = J6.A(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f8333r = obtainStyledAttributes.hasValue(0);
        J6.L();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f8334s == null) {
            this.f8334s = LayoutInflater.from(getContext());
        }
        return this.f8334s;
    }

    private void setSubMenuArrowVisible(boolean z8) {
        int i4;
        ImageView imageView = this.j;
        if (imageView != null) {
            if (z8) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // n.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(o oVar) {
        int i4;
        boolean z8;
        char c6;
        int i8;
        String sb;
        boolean z9;
        char c9;
        char c10;
        this.f8321d = oVar;
        int i9 = 0;
        if (oVar.isVisible()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        setVisibility(i4);
        setTitle(oVar.f12673e);
        setCheckable(oVar.isCheckable());
        if (oVar.f12680n.o()) {
            if (oVar.f12680n.n()) {
                c10 = oVar.j;
            } else {
                c10 = oVar.f12676h;
            }
            if (c10 != 0) {
                z8 = true;
                oVar.f12680n.n();
                if (z8) {
                    o oVar2 = this.f8321d;
                    if (oVar2.f12680n.o()) {
                        if (oVar2.f12680n.n()) {
                            c9 = oVar2.j;
                        } else {
                            c9 = oVar2.f12676h;
                        }
                        if (c9 != 0) {
                            z9 = true;
                        }
                    }
                    z9 = false;
                }
                i9 = 8;
                if (i9 == 0) {
                    TextView textView = this.f8326i;
                    o oVar3 = this.f8321d;
                    m mVar = oVar3.f12680n;
                    Context context = mVar.f12641a;
                    if (mVar.n()) {
                        c6 = oVar3.j;
                    } else {
                        c6 = oVar3.f12676h;
                    }
                    if (c6 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        if (mVar.n()) {
                            i8 = oVar3.k;
                        } else {
                            i8 = oVar3.f12677i;
                        }
                        o.c(sb2, i8, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        o.c(sb2, i8, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        o.c(sb2, i8, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        o.c(sb2, i8, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        o.c(sb2, i8, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        o.c(sb2, i8, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c6 != '\b') {
                            if (c6 != '\n') {
                                if (c6 != ' ') {
                                    sb2.append(c6);
                                } else {
                                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                                }
                            } else {
                                sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                            }
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f8326i.getVisibility() != i9) {
                    this.f8326i.setVisibility(i9);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.f12683q);
            }
        }
        z8 = false;
        oVar.f12680n.n();
        if (z8) {
        }
        i9 = 8;
        if (i9 == 0) {
        }
        if (this.f8326i.getVisibility() != i9) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f12683q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.k;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
            rect.top = this.k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    @Override // n.z
    public o getItemData() {
        return this.f8321d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f8328m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f8324g = textView;
        int i4 = this.f8329n;
        if (i4 != -1) {
            textView.setTextAppearance(this.f8330o, i4);
        }
        this.f8326i = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8332q);
        }
        this.k = (ImageView) findViewById(R.id.group_divider);
        this.f8327l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        if (this.f8322e != null && this.f8331p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8322e.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i4, i8);
    }

    public void setCheckable(boolean z8) {
        CompoundButton compoundButton;
        View view;
        if (z8 || this.f8323f != null || this.f8325h != null) {
            if ((this.f8321d.f12690x & 4) != 0) {
                if (this.f8323f == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f8323f = radioButton;
                    LinearLayout linearLayout = this.f8327l;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f8323f;
                view = this.f8325h;
            } else {
                if (this.f8325h == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f8325h = checkBox;
                    LinearLayout linearLayout2 = this.f8327l;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f8325h;
                view = this.f8323f;
            }
            if (z8) {
                compoundButton.setChecked(this.f8321d.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f8325h;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f8323f;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z8) {
        CompoundButton compoundButton;
        if ((this.f8321d.f12690x & 4) != 0) {
            if (this.f8323f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f8323f = radioButton;
                LinearLayout linearLayout = this.f8327l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f8323f;
        } else {
            if (this.f8325h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f8325h = checkBox;
                LinearLayout linearLayout2 = this.f8327l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f8325h;
        }
        compoundButton.setChecked(z8);
    }

    public void setForceShowIcon(boolean z8) {
        this.f8335t = z8;
        this.f8331p = z8;
    }

    public void setGroupDividerEnabled(boolean z8) {
        int i4;
        ImageView imageView = this.k;
        if (imageView != null) {
            if (!this.f8333r && z8) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f8321d.f12680n;
        boolean z8 = this.f8335t;
        if (z8 || this.f8331p) {
            ImageView imageView = this.f8322e;
            if (imageView != null || drawable != null || this.f8331p) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.f8322e = imageView2;
                    LinearLayout linearLayout = this.f8327l;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.f8331p) {
                    this.f8322e.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.f8322e;
                if (!z8) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.f8322e.getVisibility() != 0) {
                    this.f8322e.setVisibility(0);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f8324g.setText(charSequence);
            if (this.f8324g.getVisibility() != 0) {
                this.f8324g.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f8324g.getVisibility() != 8) {
            this.f8324g.setVisibility(8);
        }
    }
}
