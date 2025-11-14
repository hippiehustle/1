package o;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.buzbuz.smartautoclicker.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class Y0 extends T.c implements View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f13159A = 0;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13160l;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutInflater f13161m;

    /* renamed from: n, reason: collision with root package name */
    public final SearchView f13162n;

    /* renamed from: o, reason: collision with root package name */
    public final SearchableInfo f13163o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f13164p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f13165q;

    /* renamed from: r, reason: collision with root package name */
    public final int f13166r;

    /* renamed from: s, reason: collision with root package name */
    public int f13167s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f13168t;

    /* renamed from: u, reason: collision with root package name */
    public int f13169u;

    /* renamed from: v, reason: collision with root package name */
    public int f13170v;

    /* renamed from: w, reason: collision with root package name */
    public int f13171w;

    /* renamed from: x, reason: collision with root package name */
    public int f13172x;

    /* renamed from: y, reason: collision with root package name */
    public int f13173y;

    /* renamed from: z, reason: collision with root package name */
    public int f13174z;

    public Y0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f5480e = true;
        this.f5481f = null;
        this.f5479d = false;
        this.f5482g = -1;
        this.f5483h = new T.a(this);
        this.f5484i = new T.b(0, this);
        this.f13160l = suggestionRowLayout;
        this.k = suggestionRowLayout;
        this.f13161m = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f13167s = 1;
        this.f13169u = -1;
        this.f13170v = -1;
        this.f13171w = -1;
        this.f13172x = -1;
        this.f13173y = -1;
        this.f13174z = -1;
        this.f13162n = searchView;
        this.f13163o = searchableInfo;
        this.f13166r = searchView.getSuggestionCommitIconResId();
        this.f13164p = context;
        this.f13165q = weakHashMap;
    }

    public static String h(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e9) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e9);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    @Override // T.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i4;
        int i8;
        int i9;
        Drawable f8;
        Drawable f9;
        Drawable.ConstantState constantState;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        X0 x02 = (X0) view.getTag();
        int i10 = this.f13174z;
        if (i10 != -1) {
            i4 = cursor.getInt(i10);
        } else {
            i4 = 0;
        }
        TextView textView = x02.f13153a;
        TextView textView2 = x02.f13154b;
        ImageView imageView = x02.f13157e;
        if (textView != null) {
            String h8 = h(cursor, this.f13169u);
            textView.setText(h8);
            if (TextUtils.isEmpty(h8)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f13164p;
        if (textView2 != null) {
            String h9 = h(cursor, this.f13171w);
            if (h9 != null) {
                if (this.f13168t == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f13168t = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h9);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f13168t, null), 0, h9.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f13170v);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = x02.f13155c;
        if (imageView2 != null) {
            int i11 = this.f13172x;
            if (i11 == -1) {
                f9 = null;
            } else {
                f9 = f(cursor.getString(i11));
                if (f9 == null) {
                    ComponentName searchActivity = this.f13163o.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f13165q;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        if (constantState2 == null) {
                            f9 = null;
                        } else {
                            f9 = constantState2.newDrawable(context.getResources());
                        }
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e9) {
                            Log.w("SuggestionsAdapter", e9.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder j = AbstractC1149a.j(iconResource, "Invalid icon resource ", " for ");
                                j.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", j.toString());
                            } else {
                                f9 = drawable;
                                if (f9 != null) {
                                    constantState = null;
                                } else {
                                    constantState = f9.getConstantState();
                                }
                                weakHashMap.put(flattenToShortString, constantState);
                            }
                        }
                        f9 = null;
                        if (f9 != null) {
                        }
                        weakHashMap.put(flattenToShortString, constantState);
                    }
                    if (f9 == null) {
                        f9 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f9);
            if (f9 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f9.setVisible(false, false);
                f9.setVisible(true, false);
            }
        }
        ImageView imageView3 = x02.f13156d;
        if (imageView3 != null) {
            int i12 = this.f13173y;
            if (i12 == -1) {
                f8 = null;
            } else {
                f8 = f(cursor.getString(i12));
            }
            imageView3.setImageDrawable(f8);
            if (f8 == null) {
                imageView3.setVisibility(8);
            } else {
                imageView3.setVisibility(0);
                f8.setVisible(false, false);
                i8 = 1;
                f8.setVisible(true, false);
                i9 = this.f13167s;
                if (i9 == 2 && (i9 != i8 || (i4 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
        }
        i8 = 1;
        i9 = this.f13167s;
        if (i9 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // T.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f13169u = cursor.getColumnIndex("suggest_text_1");
                this.f13170v = cursor.getColumnIndex("suggest_text_2");
                this.f13171w = cursor.getColumnIndex("suggest_text_2_url");
                this.f13172x = cursor.getColumnIndex("suggest_icon_1");
                this.f13173y = cursor.getColumnIndex("suggest_icon_2");
                this.f13174z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e9) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e9);
        }
    }

    @Override // T.c
    public final String c(Cursor cursor) {
        String h8;
        String h9;
        if (cursor != null) {
            String h10 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (h10 != null) {
                return h10;
            }
            SearchableInfo searchableInfo = this.f13163o;
            if (searchableInfo.shouldRewriteQueryFromData() && (h9 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return h9;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (h8 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return h8;
            }
            return null;
        }
        return null;
    }

    @Override // T.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f13161m.inflate(this.k, viewGroup, false);
        inflate.setTag(new X0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f13166r);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f13164p.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        Drawable newDrawable;
        Drawable newDrawable2;
        WeakHashMap weakHashMap = this.f13165q;
        Context context = this.f13164p;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                if (constantState == null) {
                    newDrawable2 = null;
                } else {
                    newDrawable2 = constantState.newDrawable();
                }
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                if (constantState2 == null) {
                    newDrawable = null;
                } else {
                    newDrawable = constantState2.newDrawable();
                }
                if (newDrawable != null) {
                    return newDrawable;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e9) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e9.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        try {
                            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                            try {
                                openInputStream.close();
                            } catch (IOException e10) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e10);
                            }
                            drawable = createFromStream;
                            if (drawable != null) {
                            }
                        } finally {
                        }
                    } else {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f13164p.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // T.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e9) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e9);
            View inflate = this.f13161m.inflate(this.f13160l, viewGroup, false);
            if (inflate != null) {
                ((X0) inflate.getTag()).f13153a.setText(e9.toString());
            }
            return inflate;
        }
    }

    @Override // T.c, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e9) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e9);
            View d2 = d(viewGroup);
            ((X0) d2.getTag()).f13153a.setText(e9.toString());
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f5481f;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f5481f;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f13162n.p((CharSequence) tag);
        }
    }
}
