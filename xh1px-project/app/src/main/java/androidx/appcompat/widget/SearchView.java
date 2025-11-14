package androidx.appcompat.widget;

import L5.s;
import P.O;
import R.g;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.buzbuz.smartautoclicker.R;
import f6.C0716f;
import h.AbstractC0805a;
import i.AbstractC0862a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.InterfaceC1038a;
import o.AbstractC1223x0;
import o.C1205o;
import o.C1225y0;
import o.P0;
import o.Q0;
import o.R0;
import o.S0;
import o.T0;
import o.U0;
import o.V0;
import o.W0;
import o.Y0;

/* loaded from: classes.dex */
public class SearchView extends AbstractC1223x0 implements InterfaceC1038a {

    /* renamed from: l0, reason: collision with root package name */
    public static final C0716f f8415l0;

    /* renamed from: A, reason: collision with root package name */
    public final View f8416A;

    /* renamed from: B, reason: collision with root package name */
    public W0 f8417B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f8418C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f8419D;

    /* renamed from: E, reason: collision with root package name */
    public final int[] f8420E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f8421F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f8422G;

    /* renamed from: H, reason: collision with root package name */
    public final Drawable f8423H;

    /* renamed from: I, reason: collision with root package name */
    public final int f8424I;

    /* renamed from: J, reason: collision with root package name */
    public final int f8425J;
    public final Intent K;

    /* renamed from: L, reason: collision with root package name */
    public final Intent f8426L;

    /* renamed from: M, reason: collision with root package name */
    public final CharSequence f8427M;

    /* renamed from: N, reason: collision with root package name */
    public T0 f8428N;

    /* renamed from: O, reason: collision with root package name */
    public View.OnFocusChangeListener f8429O;

    /* renamed from: P, reason: collision with root package name */
    public View.OnClickListener f8430P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f8431Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f8432R;

    /* renamed from: S, reason: collision with root package name */
    public T.c f8433S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f8434T;

    /* renamed from: U, reason: collision with root package name */
    public CharSequence f8435U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f8436V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f8437W;

    /* renamed from: a0, reason: collision with root package name */
    public int f8438a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f8439b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f8440c0;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f8441d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f8442e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f8443f0;

    /* renamed from: g0, reason: collision with root package name */
    public SearchableInfo f8444g0;

    /* renamed from: h0, reason: collision with root package name */
    public Bundle f8445h0;

    /* renamed from: i0, reason: collision with root package name */
    public final P0 f8446i0;
    public final P0 j0;

    /* renamed from: k0, reason: collision with root package name */
    public final WeakHashMap f8447k0;

    /* renamed from: s, reason: collision with root package name */
    public final SearchAutoComplete f8448s;

    /* renamed from: t, reason: collision with root package name */
    public final View f8449t;

    /* renamed from: u, reason: collision with root package name */
    public final View f8450u;

    /* renamed from: v, reason: collision with root package name */
    public final View f8451v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f8452w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f8453x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f8454y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f8455z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C1205o {

        /* renamed from: h, reason: collision with root package name */
        public int f8456h;

        /* renamed from: i, reason: collision with root package name */
        public SearchView f8457i;
        public boolean j;
        public final d k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.k = new d(this);
            this.f8456h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i4 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                if (i4 < 640 || i8 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0716f c0716f = SearchView.f8415l0;
            c0716f.getClass();
            C0716f.a();
            Method method = c0716f.f10786c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f8456h > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // o.C1205o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.j) {
                d dVar = this.k;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z8, int i4, Rect rect) {
            super.onFocusChanged(z8, i4, rect);
            SearchView searchView = this.f8457i;
            searchView.w(searchView.f8432R);
            searchView.post(searchView.f8446i0);
            if (searchView.f8448s.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f8457i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z8) {
            super.onWindowFocusChanged(z8);
            if (z8 && this.f8457i.hasFocus() && getVisibility() == 0) {
                this.j = true;
                Context context = getContext();
                C0716f c0716f = SearchView.f8415l0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z8) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.k;
            if (!z8) {
                this.j = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.j = false;
                    removeCallbacks(dVar);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.j = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f8457i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f8456h = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f6.f, java.lang.Object] */
    static {
        C0716f c0716f = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f10784a = null;
            obj.f10785b = null;
            obj.f10786c = null;
            C0716f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f10784a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f10785b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f10786c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c0716f = obj;
        }
        f8415l0 = c0716f;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f8418C = new Rect();
        this.f8419D = new Rect();
        this.f8420E = new int[2];
        this.f8421F = new int[2];
        this.f8446i0 = new P0(this, 0);
        this.j0 = new P0(this, 1);
        this.f8447k0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        R0 r02 = new R0(this);
        s sVar = new s(2, this);
        C1225y0 c1225y0 = new C1225y0(1, this);
        C2.b bVar2 = new C2.b(2, this);
        int[] iArr = AbstractC0805a.f11293u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        g gVar = new g(context, obtainStyledAttributes);
        O.l(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f8448s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f8449t = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f8450u = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f8451v = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f8452w = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f8453x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f8454y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f8455z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f8422G = imageView5;
        findViewById.setBackground(gVar.A(20));
        findViewById2.setBackground(gVar.A(25));
        imageView.setImageDrawable(gVar.A(23));
        imageView2.setImageDrawable(gVar.A(15));
        imageView3.setImageDrawable(gVar.A(12));
        imageView4.setImageDrawable(gVar.A(28));
        imageView5.setImageDrawable(gVar.A(23));
        this.f8423H = gVar.A(22);
        AbstractC0862a.w(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f8424I = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f8425J = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(bVar2);
        searchAutoComplete.setOnEditorActionListener(r02);
        searchAutoComplete.setOnItemClickListener(sVar);
        searchAutoComplete.setOnItemSelectedListener(c1225y0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new Q0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f8427M = obtainStyledAttributes.getText(14);
        this.f8435U = obtainStyledAttributes.getText(21);
        int i4 = obtainStyledAttributes.getInt(6, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i8 = obtainStyledAttributes.getInt(5, -1);
        if (i8 != -1) {
            setInputType(i8);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        gVar.L();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f8426L = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f8416A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new A5.b(3, this));
        }
        w(this.f8431Q);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.f8448s;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f8437W = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f8448s;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f8437W = false;
    }

    public int getImeOptions() {
        return this.f8448s.getImeOptions();
    }

    public int getInputType() {
        return this.f8448s.getInputType();
    }

    public int getMaxWidth() {
        return this.f8438a0;
    }

    public CharSequence getQuery() {
        return this.f8448s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f8435U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f8444g0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.f8444g0.getHintId());
        }
        return this.f8427M;
    }

    public int getSuggestionCommitIconResId() {
        return this.f8425J;
    }

    public int getSuggestionRowLayout() {
        return this.f8424I;
    }

    public T.c getSuggestionsAdapter() {
        return this.f8433S;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f8441d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f8445h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f8444g0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i4;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8445h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i4 = searchableInfo.getVoiceMaxResults();
        } else {
            i4 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i4);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i4 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f8448s;
        if (i4 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        C0716f c0716f = f8415l0;
        c0716f.getClass();
        C0716f.a();
        Method method = c0716f.f10784a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c0716f.getClass();
        C0716f.a();
        Method method2 = c0716f.f10785b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f8448s;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f8431Q) {
                clearFocus();
                w(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void n(int i4) {
        int i8;
        Uri parse;
        String h8;
        Cursor cursor = this.f8433S.f5481f;
        if (cursor != null && cursor.moveToPosition(i4)) {
            Intent intent = null;
            try {
                int i9 = Y0.f13159A;
                String h9 = Y0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h9 == null) {
                    h9 = this.f8444g0.getSuggestIntentAction();
                }
                if (h9 == null) {
                    h9 = "android.intent.action.SEARCH";
                }
                String h10 = Y0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h10 == null) {
                    h10 = this.f8444g0.getSuggestIntentData();
                }
                if (h10 != null && (h8 = Y0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h10 = h10 + "/" + Uri.encode(h8);
                }
                if (h10 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h10);
                }
                intent = j(h9, parse, Y0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), Y0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e9) {
                try {
                    i8 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i8 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e9);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f8448s;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i4) {
        Editable text = this.f8448s.getText();
        Cursor cursor = this.f8433S.f5481f;
        if (cursor != null) {
            if (cursor.moveToPosition(i4)) {
                String c6 = this.f8433S.c(cursor);
                if (c6 != null) {
                    setQuery(c6);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    @Override // m.InterfaceC1038a
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f8448s;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f8441d0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f8443f0);
        this.f8442e0 = false;
    }

    @Override // m.InterfaceC1038a
    public final void onActionViewExpanded() {
        if (this.f8442e0) {
            return;
        }
        this.f8442e0 = true;
        SearchAutoComplete searchAutoComplete = this.f8448s;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f8443f0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f8446i0);
        post(this.j0);
        super.onDetachedFromWindow();
    }

    @Override // o.AbstractC1223x0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        if (z8) {
            SearchAutoComplete searchAutoComplete = this.f8448s;
            int[] iArr = this.f8420E;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f8421F;
            getLocationInWindow(iArr2);
            int i11 = iArr[1] - iArr2[1];
            int i12 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i12;
            int height = searchAutoComplete.getHeight() + i11;
            Rect rect = this.f8418C;
            rect.set(i12, i11, width, height);
            int i13 = rect.left;
            int i14 = rect.right;
            int i15 = i10 - i8;
            Rect rect2 = this.f8419D;
            rect2.set(i13, 0, i14, i15);
            W0 w02 = this.f8417B;
            if (w02 == null) {
                W0 w03 = new W0(searchAutoComplete, rect2, rect);
                this.f8417B = w03;
                setTouchDelegate(w03);
            } else {
                w02.f13148b.set(rect2);
                Rect rect3 = w02.f13150d;
                rect3.set(rect2);
                int i16 = -w02.f13151e;
                rect3.inset(i16, i16);
                w02.f13149c.set(rect);
            }
        }
    }

    @Override // o.AbstractC1223x0, android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        if (this.f8432R) {
            super.onMeasure(i4, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i9 = this.f8438a0) > 0) {
                    size = Math.min(i9, size);
                }
            } else {
                size = this.f8438a0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i10 = this.f8438a0;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof V0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        V0 v02 = (V0) parcelable;
        super.onRestoreInstanceState(v02.f6209d);
        w(v02.f13135f);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, o.V0, V.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new V.b(super.onSaveInstanceState());
        bVar.f13135f = this.f8432R;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        post(this.f8446i0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f8448s;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f8428N != null) {
                text.toString();
            }
            if (this.f8444g0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        int i4;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f8448s.getText());
        if (isEmpty && (!this.f8431Q || this.f8442e0)) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        ImageView imageView = this.f8454y;
        imageView.setVisibility(i4);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (this.f8437W || !isFocusable()) {
            return false;
        }
        if (!this.f8432R) {
            boolean requestFocus = this.f8448s.requestFocus(i4, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i4, rect);
    }

    public final void s() {
        int[] iArr;
        if (this.f8448s.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f8450u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f8451v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f8445h0 = bundle;
    }

    public void setIconified(boolean z8) {
        if (z8) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f8448s;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f8430P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z8) {
        if (this.f8431Q == z8) {
            return;
        }
        this.f8431Q = z8;
        w(z8);
        t();
    }

    public void setImeOptions(int i4) {
        this.f8448s.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f8448s.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f8438a0 = i4;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f8429O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(T0 t02) {
        this.f8428N = t02;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f8430P = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f8435U = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z8) {
        int i4;
        this.f8436V = z8;
        T.c cVar = this.f8433S;
        if (cVar instanceof Y0) {
            Y0 y02 = (Y0) cVar;
            if (z8) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            y02.f13167s = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i4;
        this.f8444g0 = searchableInfo;
        Intent intent = null;
        boolean z8 = true;
        SearchAutoComplete searchAutoComplete = this.f8448s;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f8444g0.getImeOptions());
            int inputType = this.f8444g0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f8444g0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            T.c cVar = this.f8433S;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f8444g0.getSuggestAuthority() != null) {
                Y0 y02 = new Y0(getContext(), this, this.f8444g0, this.f8447k0);
                this.f8433S = y02;
                searchAutoComplete.setAdapter(y02);
                Y0 y03 = (Y0) this.f8433S;
                if (this.f8436V) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                y03.f13167s = i4;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.f8444g0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f8444g0.getVoiceSearchLaunchWebSearch()) {
                intent = this.K;
            } else if (this.f8444g0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f8426L;
            }
            if (intent != null) {
            }
        }
        z8 = false;
        this.f8439b0 = z8;
        if (z8) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.f8432R);
    }

    public void setSubmitButtonEnabled(boolean z8) {
        this.f8434T = z8;
        w(this.f8432R);
    }

    public void setSuggestionsAdapter(T.c cVar) {
        this.f8433S = cVar;
        this.f8448s.setAdapter(cVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z8 = this.f8431Q;
        SearchAutoComplete searchAutoComplete = this.f8448s;
        if (z8 && (drawable = this.f8423H) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        int i4;
        if ((this.f8434T || this.f8439b0) && !this.f8432R && (this.f8453x.getVisibility() == 0 || this.f8455z.getVisibility() == 0)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.f8451v.setVisibility(i4);
    }

    public final void v(boolean z8) {
        int i4;
        boolean z9 = this.f8434T;
        if (z9 && ((z9 || this.f8439b0) && !this.f8432R && hasFocus() && (z8 || !this.f8439b0))) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.f8453x.setVisibility(i4);
    }

    public final void w(boolean z8) {
        int i4;
        int i8;
        int i9;
        this.f8432R = z8;
        int i10 = 8;
        if (z8) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f8448s.getText());
        this.f8452w.setVisibility(i4);
        v(!isEmpty);
        if (z8) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        this.f8449t.setVisibility(i8);
        ImageView imageView = this.f8422G;
        if (imageView.getDrawable() != null && !this.f8431Q) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        r();
        if (this.f8439b0 && !this.f8432R && isEmpty) {
            this.f8453x.setVisibility(8);
            i10 = 0;
        }
        this.f8455z.setVisibility(i10);
        u();
    }

    public void setOnCloseListener(S0 s02) {
    }

    public void setOnSuggestionListener(U0 u02) {
    }
}
